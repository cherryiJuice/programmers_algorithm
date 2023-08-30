class Solution {
    public static int[] solution(String[] park, String[] routes) {
        int x_pos=0, y_pos=0;
        
        for(int i=0; i<park.length; i++){
            for(int j=0; j<park[0].length(); j++){
                if(park[i].charAt(j)=='S') {
                    y_pos=i;
                    x_pos=j;
                }
            }
        }
        
        for(int i=0; i<routes.length; i++){
            if(routes[i].charAt(0)=='E'){
                int move=0;
                for(int j=1; j<=routes[i].charAt(2)-'0'; j++){
                    if(x_pos+j == park[0].length()) {
                        move=0;
                        break;
                    }
                    else if(park[y_pos].charAt(x_pos+j)=='X') {
                        move=0;
                        break;
                    }
                    else move++;
                }
                x_pos+=move;
            }
            
            if(routes[i].charAt(0)=='W'){
                int move=0;
                for(int j=1; j<=routes[i].charAt(2)-'0'; j++){
                    if(x_pos-j == -1) {
                        move=0;
                        break;
                    }
                    else if(park[y_pos].charAt(x_pos-j)=='X') {
                        move=0;
                        break;
                    } 
                    else move--;
                }
                x_pos+=move;
            }
            if(routes[i].charAt(0)=='S'){
                int move=0;
                for(int j=1; j<=routes[i].charAt(2)-'0'; j++){
                    if(y_pos+j == park.length){
                        move=0;
                        break;
                    } 
                    else if(park[y_pos+j].charAt(x_pos)=='X') {
                        move=0;
                        break;
                    }
                    else move++;
                }
                y_pos+=move;
            }
            
            if(routes[i].charAt(0)=='N'){
                int move=0;
                for(int j=1; j<=routes[i].charAt(2)-'0'; j++){
                    if(y_pos-j == -1) {
                        move=0;
                        break;
                    }
                    else if(park[y_pos-j].charAt(x_pos)=='X'){
                        move=0;
                        break;
                    } 
                    else move--;
                }
                y_pos+=move;
            }
        }
        return new int[] {y_pos, x_pos};
    }
}