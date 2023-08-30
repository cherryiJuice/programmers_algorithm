class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        double inclin1, inclin2;
        for(int i=1; i<4; i++){
            inclin1 = (double)(dots[0][1]-dots[i][1])/(dots[0][0]-dots[i][0]);
            inclin2 = (double)(dots[i%3+1][1]-dots[(i+1)%3+1][1])/(dots[i%3+1][0]-dots[(i+1)%3+1][0]);
            if(inclin1==inclin2) return 1;
        }
        return answer;
    }
}