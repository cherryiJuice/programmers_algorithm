class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int count=0;
        int zero_count=0;
        
        for(int i=0; i<6; i++){
            if(lottos[i] == 0) zero_count++;
            for(int j=0; j<6; j++){
                if(lottos[i] == win_nums[j]) count++;
            }
        }
        
        int maxRank = 7 - (count + zero_count);
        int minRank = 7 - count;
        if(maxRank > 6) maxRank = 6;
        if(minRank > 6) minRank = 6;

        return new int[] {maxRank, minRank};
    }
}