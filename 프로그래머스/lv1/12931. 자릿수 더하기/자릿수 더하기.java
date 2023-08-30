import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int digit=n;
        while(digit!=0) {
            answer += digit%10;
            digit /= 10;
        }

        return answer;
    }
}