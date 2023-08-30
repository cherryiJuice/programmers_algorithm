class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        char[] charArr = s.toCharArray();
        
        for(int i=charArr.length-1; i>=0; i--){
            for(int j=i-1; j>=0; j--){
                if(charArr[i]==charArr[j]) {
                    answer[i]=i-j;
                    break;
                }
            }
            if(answer[i]==0) answer[i] = -1;
        }
        return answer;
    }
}