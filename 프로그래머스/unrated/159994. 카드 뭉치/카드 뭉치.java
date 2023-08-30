class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer="Yes";
        int cards1_index=0;
        int cards2_index=0;
        
        for(int g=0; g<goal.length; g++) {
            if(goal[g].equals(cards1[cards1_index]) && cards1_index < cards1.length){
                if(cards1_index < cards1.length-1) {cards1_index++;}
            }
                
            else if(goal[g].equals(cards2[cards2_index]) && cards2_index < cards2.length) {
                if(cards2_index < cards2.length-1) {cards2_index++;}
            }

            else answer = "No";
        }
        
        return answer;
    }
}