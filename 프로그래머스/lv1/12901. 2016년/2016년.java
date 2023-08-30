class Solution {
    public String solution(int a, int b) {
        String[] week={"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] month={31,29,31,30,31,30,31,31,30,31,30,31};
        int days = b-1;
        
        for(int i=0; i<a-1; i++){
            days += month[i];
        }
        return week[days%7];
    }
}