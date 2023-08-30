class Solution {
    public long solution(int a, int b) {
        long answer;
        long min=Math.min(a,b);
        long max=Math.max(a,b);
        answer = (Math.max(a,b)-Math.min(a,b)+1)*(max+min)/2;
        return answer;
    }
}