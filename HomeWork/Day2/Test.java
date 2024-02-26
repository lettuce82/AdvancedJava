public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(9));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if (n % 2 == 0) {
            for(int i = n; i >= 0; i -= 2) {
                answer += i;
            }
        } else {
            for(int i = n - 1; i >= 0; i -= 2) {
                answer += i;
            }
        }
        
        return answer;
    }
}