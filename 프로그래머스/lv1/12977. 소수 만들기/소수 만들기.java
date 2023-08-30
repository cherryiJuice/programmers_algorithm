class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int count = 0;
        int[] sum = new int[nums.length*(nums.length-1)*(nums.length-2)/(3*2)];
        
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    sum[count++] = nums[i]+nums[j]+nums[k];
                }
            }
        }
        int[] arr = new int[3000];
        for (int i = 2; i < 3000; i++) {  
            if(arr[i] == 0){            
                for (int j = i*2; j < 3000; j=j+i) {    
                    arr[j] = 1;         
                }
            }
        }
        
        for(int i=0; i<sum.length; i++){
            if(arr[sum[i]]==0) answer++;
        }

        return answer;
    }
}