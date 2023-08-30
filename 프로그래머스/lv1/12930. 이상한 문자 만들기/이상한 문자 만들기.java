class Solution {
    public String solution(String s) {
        String answer = "";
        int evenCheck=1;
        for(int i=0; i<s.length(); i++){
            if(s.substring(i,i+1).equals(" ")) evenCheck = -1;
            answer += evenCheck == 1? s.substring(i,i+1).toUpperCase() : s.substring(i,i+1).toLowerCase();
            evenCheck *= -1;
        }
        return answer;
    }
}