
class Solution {
    public int solution(int n) {
        int answer = 2;
        if(n%2==0){
            answer=3;
            while(true){
                if(n%answer==1) return answer;
                answer+=2;
            }
        }
        else {
            while(true){
                if(n%answer==1) return answer;
                answer+=2;
            }
        }

    }
}