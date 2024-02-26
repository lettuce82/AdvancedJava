import java.io.*;

public class FileDetails {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java FileDetails FileName");
            return;
        }
        String fileName = args[0];


        // read the file that passed from parameter of main method
        File file = new File(fileName);
        try (FileInputStream stream = new FileInputStream(file)) {
            //정수로 변환하는 이유
            //: length() 함수의 반환타입은 long 이다.
            char[] contents = new char[(int)file.length()];
            for (int i = 0; i < contents.length; i++) {
                contents[i] = (char)stream.read();
            }

            // for (char c : contents) {
            //     System.out.print(c);
            // }

            summerize(contents);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void summerize(char[] contents) {
        int vowles = 0, consonages = 0, lines = 0;
        for (char c : contents) {
            if (Character.isLetter(c)) {
                if ("AEIOUaeiou".indexOf(c) != -1) {
                    vowles++;
                } else {
                    consonages++;
                }
            } else if (c == '\n') {
                lines++;
            }
        }
        System.out.println("총 문자수: " + contents.length);
        System.out.println("모음 수: " + vowles);
        System.out.println("자음 수: " + consonages);
        System.out.println("줄 수: " + lines);
    }
}