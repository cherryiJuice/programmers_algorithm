class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i=1; i<food.length; i++) {
            String n_food = String.valueOf(i);
            answer += n_food.repeat(food[i]/2);
        }

        answer+="0";

        for(int i=food.length-1; i>0; i--){
            String n_food = String.valueOf(i);
            answer += n_food.repeat(food[i]/2);
        }

        return answer;
    }
}