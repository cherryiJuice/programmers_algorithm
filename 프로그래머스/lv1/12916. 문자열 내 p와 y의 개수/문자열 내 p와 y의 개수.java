class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s=s.toLowerCase();
        int countP=0, countY=0;
        for(int i=0; i<s.length(); i++){
           if(s.indexOf('p') != -1) {
        	   countP++;
        	   s=s.replaceFirst("p", "1");
           }
           else if(s.indexOf('y') != -1) {
        	   countY++;
        	   s=s.replaceFirst("y", "1");
           }
        }
    

        if(countP==countY) return answer;
        else return false;
    }
}