class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {

        int[] count = new int[1001];
        for(int i = 0; i < target.length; i++) {
            count[target[i]]++;
        }

        for(int i = 0; i < arr.length; i++) {
            count[arr[i]]--;
            if(count[arr[i]] < 0) {
                return false;
            }
        }

        return true;

    }
}