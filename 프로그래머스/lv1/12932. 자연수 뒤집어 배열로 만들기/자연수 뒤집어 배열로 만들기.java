class Solution {
    public int[] solution(long n) {
        int[] answer = new int[Long.toString(n).length()];
        long digit=n;
        int i=0;
        while(digit>0) {
        	answer[i++] = (int) (digit%10);
        	digit /= 10;
        }
        return answer;
    }
}