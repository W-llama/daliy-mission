class Solution {
    public int solution(int[] nums) {
        boolean[] noprime = new boolean[2998];
        for(int i=2 ; i<=54 ; i++){
            if(!noprime[i]){
                for(int j=2 ; j<2997/i ; j++){
                    noprime[i*j]=true;
                }
            }
        }
        int nl=nums.length, cnt=0;
        for(int i=0; i<nl-2; i++){
            for(int j=i+1; j<nl-1; j++){
                for(int k=j+1; k<nl; k++){
                    if(!noprime[nums[i]+nums[j]+nums[k]]) cnt++;
                }
            }
        }
        return cnt;
    }
}