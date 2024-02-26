import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeywordCount {
    public static void main(String[] args) {
        String fileName = args[0];
        //키워드가 들어간 파일의 이름
        String keywordFileName = "Keywords";

        printKeywordCount(fileName, keywordFileName);
    }

    static void printKeywordCount(String fileName, String keywordFileName) {
        List<String> fileWords = readFileWords(fileName);
        List<String> keywordList = readFileWords(keywordFileName);
        Map<String, Integer> keywordCount = countKeywords(fileWords, keywordList);

        // 키워드별 빈도 출력
        for (Map.Entry<String, Integer> entry : keywordCount.entrySet()) {
            int count = entry.getValue();
            if (count >= 1) {
                System.out.println(entry.getKey() + ": " + count);
            }
        }
    }

    static List<String> readFileWords(String fileName) {
        List<String> words = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] lineWords = line.replaceAll("[^a-zA-Z0-9 ]", "").split("\\s+");
                for (String word : lineWords) {
                    if (!word.isEmpty()) {
                        words.add(word.toLowerCase()); // 단어를 소문자로 변환하여 저장
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return words;
    }

    static Map<String, Integer> countKeywords(List<String> fileWords, List<String> keywordList) {
        Map<String, Integer> keywordCount = new HashMap<>();
        for (String keyword : keywordList) {
            keywordCount.put(keyword, 0); // 키워드별 빈도 초기화
        }

        // 파일에서 읽은 단어들과 키워드 비교하여 빈도 계산
        for (String word : fileWords) {
            if (keywordCount.containsKey(word)) {
                keywordCount.put(word, keywordCount.get(word) + 1); // 해당 키워드 빈도 증가
            }
        }
        return keywordCount;
    }
}
