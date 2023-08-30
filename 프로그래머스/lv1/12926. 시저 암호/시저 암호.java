class Solution {
    public String solution(String s, int n) {
        char[] charArr = s.toCharArray();
        for(int i=0; i<charArr.length; i++){
            if(charArr[i] != 32){
                charArr[i] += n;
                if(charArr[i]>122 && charArr[i]-n>=97) charArr[i]-=26;
                else if(charArr[i]>90 && charArr[i]-n<=90) charArr[i]-=26;
            }
        }
        return new String(charArr);
    }
}