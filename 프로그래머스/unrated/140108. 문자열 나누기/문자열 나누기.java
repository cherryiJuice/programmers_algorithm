class Solution {
    public int solution(String s) {
        int answer = 1;
        char c = s.charAt(0);
        int c_count=0, o_count=0;
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==c) c_count++;
            else o_count++;
            if(c_count == o_count && i<s.length()-1){
                c_count=0;
                o_count=0;
                c = s.charAt(i+1);
                answer++;
            }
        }
        return answer;
    }
}