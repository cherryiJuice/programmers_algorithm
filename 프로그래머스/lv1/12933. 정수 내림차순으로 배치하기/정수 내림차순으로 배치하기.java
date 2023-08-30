import java.util.Arrays;
class Solution {
    public long solution(long n) {
        char[] charArr = Long.toString(n).toCharArray();
        Arrays.sort(charArr);
        
        return Long.parseLong(new StringBuilder(new String(charArr)).reverse().toString());
    }
}