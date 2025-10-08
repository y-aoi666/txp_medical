class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] answer = null;

        // 1要素目のループ
        for(int i = 0 ; i < nums.length ; i++){
            // 2要素目のループ
            for(int j = i+1 ; j < nums.length ; j++){
                // 合計がtargetになっていれば、組み合わせを登録する
                if(nums[i] + nums[j] == target){
                    answer = new int[]{i,j};
                    break;
                }
            }
            // 組み合わせが見つかっていればループを抜ける
            if(answer != null){
                break;
            }
        }
        return answer;
    }
}