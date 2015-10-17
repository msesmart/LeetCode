public class longestSubstringWithoutRepeatingCharacters{
    public int lengthOfLongestSubstring(String s) {
        if(s==null)return 0;
		boolean[] flag=new boolean[256];
		
		int result=0;
		int start=0;
		char[] arr=s.toCharArray(); int n=arr.length;
		for(int i=0;i<n;i++){
			char current=arr[i];
			if(flag[current]){
				result=Math.max(i-start,result);
				for(int j=start;j<i;j++){
					if(arr[j]==arr[i]){
						start=j+1;
						break;
					}
					flag[arr[j]]=false;
				}
			}else{
				flag[current]=true;
			}
		}
		return Math.max(result,n-start);
    }
}