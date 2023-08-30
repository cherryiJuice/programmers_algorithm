import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] mid;
        
        for(int i=0; i<commands.length; i++) {
        	mid = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(mid);
        	answer[i] = mid[commands[i][2]-1];
        }
   
        return answer;
    }
}