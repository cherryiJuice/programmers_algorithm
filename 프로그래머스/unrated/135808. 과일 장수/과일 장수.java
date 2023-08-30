import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Arrays.sort(score);
        
        System.out.println(score.length-1-(m-1));
        for(int j=score.length-1-(m-1); j>=0; j-=m){
            answer += score[j]*m;
        }
        return answer;
    }
}