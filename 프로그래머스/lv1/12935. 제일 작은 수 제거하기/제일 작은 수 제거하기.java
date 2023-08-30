import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length==1) return new int[] {-1};

		List<Integer> list = new ArrayList<Integer>();
		for(int i: arr) list.add(i);
		
		list.remove(Collections.min(list)); 
        
        int[] resultArray = new int[arr.length - 1];
        for (int i = 0; i < list.size(); ++i) {
            resultArray[i] = list.get(i);
        }
		
        return resultArray;
    }
}