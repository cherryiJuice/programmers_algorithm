class Solution {
    public long solution(long n) {
        long answer = 0;
        answer = (long) (Math.sqrt(n)%1==0? Math.pow(Math.sqrt(n)+1, 2) : -1);        
        return answer;
    }
}