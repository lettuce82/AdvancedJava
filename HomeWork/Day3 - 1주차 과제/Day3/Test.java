import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Test {

    static final String[] KEYWORDS = new String[] {
        "abstract", "assert", "boolean", "break", "byte",
        "case", "catch", "char", "class", "const",
        "continue", "default", "do", "double", "else",
        "enum", "extends", "false", "final", "finally",
        "float", "for", "if", "goto", "implements",
        "import", "instanceof", "int", "interface", "long",
        "native", "new", "null", "package", "private",
        "protected", "public", "return", "short", "static",
        "strictfp", "super", "switch", "synchronize", "this",
        "throw", "throws", "transient", "true", "try",
        "void", "volatile", "while"
    };

    static Map<String, Integer> result = new HashMap<String, Integer>();

    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("Usage: java FileDetails FileName");
            return;
        }

        initialKeyword();

        String fileName = args[0];
        File file = new File(fileName);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufReader = new BufferedReader(fileReader);

            String line = "";
            while((line = bufReader.readLine()) != null) {
                
                countKeyword(line);
            }

            printResult();

            fileReader.close();
            bufReader.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void initialKeyword() {
        for(String keyword : KEYWORDS) {
            result.put(keyword, 0);
        }
    }

    public static void countKeyword(String line) {
        for(String keyword : KEYWORDS) {
            if(line.contains(keyword)) {
                int count = result.get(keyword);
                result.replace(keyword, ++count);
            }
        }
    }

    public static void printResult() {
        for(String keyword : KEYWORDS) {
            if(result.get(keyword) != 0) {
                System.out.println(keyword + ": " + result.get(keyword));
            }
        }
    }
}
