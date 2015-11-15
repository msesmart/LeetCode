public class minimumWindowSubstring{
	public String minWindow(String s, String t){
		int sLen = s.size();
		int tLen = t.size();
		int[] needToFind = new int[256];
		for (int i = 0; i < tLen; i++)
			needToFind[t.charAt(i)]++;
		int[] hasFound = new int[256];
		int minWindowLen = Integer.MAX_VALUE;
		int minWindowBegin = 0;
		int minWindowEnd = 0;
		int count = 0;
		for (int begin = 0, end = 0; end < sLen; end++) {
			// skip characters not in t
			if (needToFind[s.charAt(end)] == 0) continue;
			hasFound[s.charAt(end)]++;
			if (hasFound[s.charAt(end)] <= needToFind[s.charAt(end)])
				count++;
			// if window constraint is satisfied
			if (count == tLen) {
				// advance begin index as far right as possible,
				// stop when advancing breaks window constraint.
				while (needToFind[s.charAt(begin)] == 0 || hasFound[s.charAt(begin)] > needToFind[s.charAt(begin)]) {
					if (hasFound[s.charAt(begin)] > needToFind[s.charAt(begin)])
						hasFound[s.charAt(begin)]--;
					begin++;
				}
				// update minWindow if a minimum length is met
				int windowLen = end - begin + 1;
				if (windowLen < minWindowLen) {
					minWindowBegin = begin;
					minWindowEnd = end;
					minWindowLen = windowLen;
				} // end if
			} // end if
		} // end for
		if (count == tLen) return s.substring(minWindowBegin, minWindowEnd + 1);
		else return "";
	}
}