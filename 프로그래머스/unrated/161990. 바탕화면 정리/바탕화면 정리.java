class Solution {
    public int[] solution(String[] wallpaper) {
        int x_min=wallpaper.length, y_min=wallpaper[0].length();
        int x_max=0, y_max=0;                    

        for(int i=0; i<wallpaper.length; i++){
            
            for(int j=0; j<wallpaper[0].length(); j++){
                
                String s = wallpaper[i].substring(j,j+1);
                
                if(s.equals("#")){
                    if(i>x_max) x_max = i;
                    if(i<x_min) x_min = i;
                    
                    if(j>y_max) y_max = j;
                    if(j<y_min) y_min = j;
                }
                
            }
        }
        return new int[] {x_min, y_min, x_max+1, y_max+1};
    }
}