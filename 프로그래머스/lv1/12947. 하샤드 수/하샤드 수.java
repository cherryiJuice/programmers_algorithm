class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum=0;
        int digit=x;
        while(digit>0){
            sum += digit%10;
            digit/=10;
        }
        if(x%sum==0) answer=true;
        else answer=false;
        return answer;
    }
}