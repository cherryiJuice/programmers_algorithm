import java.util.StringTokenizer;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
		int count = 0;
		int[] score = new int[3];
		StringTokenizer stk=new StringTokenizer(dartResult, "SDT*#",true);
		
		while(stk.hasMoreTokens()){
			String s = stk.nextToken();
			if(s.equals("*")){
				if(count != 1) score[count-2] *= 2;
				score[count-1] *= 2;
			}
			else if(s.equals("#")){
				score[count-1] *= -1;
			}
			else if(s.equals("S"))
				count++;
			else if(s.equals("D"))
				score[count] = (int) Math.pow(score[count++], 2);
			else if(s.equals("T"))
				score[count] = (int) Math.pow(score[count++], 3);
			else {
				score[count] = Integer.parseInt(s);
			}
		}
		for(int i: score) {
			answer+=i;
		}
        return answer;
    }
}