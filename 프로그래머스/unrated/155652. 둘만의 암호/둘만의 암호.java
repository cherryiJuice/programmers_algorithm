class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        char[] charArray = s.toCharArray();
        char[] skip_char = skip.toCharArray();
        
        for(int i=0; i<charArray.length; i++){
            for(int j=0; j<index; j++){
            	charArray[i]++;
            	if(charArray[i] > 122) charArray[i]-=26;
                for(int k=0; k<skip_char.length; k++){
                    if(charArray[i] == skip_char[k]) {
                        charArray[i]++;
                        k=-1;
                        if(charArray[i] > 122) charArray[i]-=26;
                    }
                }
            }
            answer+=charArray[i];
        }
        return answer;
    }
}