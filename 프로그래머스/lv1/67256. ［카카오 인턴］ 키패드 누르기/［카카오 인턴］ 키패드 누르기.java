class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuffer result = new StringBuffer();
        int left=10, right=12;
        
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                result.append("L");
                left = numbers[i];
            }
            else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                result.append("R");
                right = numbers[i];
            }
            else {
                if(numbers[i]==0) numbers[i]=11;
            	int right_distance = Math.abs(numbers[i]-right)/3 + Math.abs(numbers[i]-right)%3;
            	int left_distance = Math.abs(numbers[i]-left)/3 + Math.abs(numbers[i]-left)%3;
                if(right_distance == left_distance){
                    if(hand.substring(0,1).equals("r")) right = numbers[i];
            		else left = numbers[i];
            		result.append(hand.substring(0,1).toUpperCase());
                }
                else if(right_distance<left_distance){
                    result.append("R");
                    right = numbers[i];
                }
                else{
                    result.append("L");
                    left = numbers[i];
                }
            }
        }
        return result.toString();
    }
}