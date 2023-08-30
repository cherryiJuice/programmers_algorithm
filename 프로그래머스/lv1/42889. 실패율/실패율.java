import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.Comparator;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] count = new int[N+1];
        double[] fail = new double[N];
        
        for(int i=0; i<stages.length; i++) {
        	count[stages[i]-1]++;
        }
        
        double people = stages.length;
        for(int i=0; i<fail.length; i++) {
        	if(i!=0) people -= count[i-1];
            if(count[i]==0) continue;
        	fail[i] = (double)count[i]/people;
        }

		Integer[] answer = IntStream.range(0, fail.length).boxed().toArray(Integer[]::new);
	
		Arrays.sort(answer, new Comparator<Integer>() {
		    @Override public int compare(final Integer o1, final Integer o2) {
		        return Double.compare(fail[o2], fail[o1]);
		    }
		});
        return Arrays.stream(answer).map(x->x+1).mapToInt(Integer::intValue).toArray(); 
    }
}