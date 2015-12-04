public class containsDuplicateIII {
	public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
		if(k < 1 || t < 0) return false;
		TreeSet<Long> set = new TreeSet<Long>();
		for(int i = 0; i < nums.length(); i++) {
			long temp = (long)nums[i];
			if((set.floor(temp) != null && temp - set.floor(temp) <= (long)t) || (set.ceiling(c) != null && set.ceiling(c) - temp <= (long)t)) return true;
			set.add(c);
			if(i >= k) set.remove((long)nums[i - k]);
		}
		return false;
	}
}