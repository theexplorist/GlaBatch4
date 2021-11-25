package Session8;

import java.util.Arrays;

public class DistinctSubsLeetcode {

	public int numDistinct(String s, String t) {
        int[][] cache = new int[s.length() + 1][t.length() + 1];
		
		for(int[] arr : cache) {
			Arrays.fill(arr, -1);
		}
        return numDistinct(s, t, 0, 0, cache);
    }
    
    
    //currS, currT -> 2D
    public int numDistinct(String s, String t, int currS, int currT, int[][] cache) {
        if(t.length() == currT) {
            return 1;
        }
        
        if(s.length() == currS) {
            return 0;
        }
        
        if(cache[currS][currT] != -1) {
            return cache[currS][currT];
        }
        int p = 0, r = 0;
        
        if(s.charAt(currS) == t.charAt(currT)) {
            p = numDistinct(s, t, currS + 1, currT + 1, cache);
        }
        
        r = numDistinct(s, t, currS + 1,  currT, cache);
        
        return cache[currS][currT] = p + r;
    }
}
