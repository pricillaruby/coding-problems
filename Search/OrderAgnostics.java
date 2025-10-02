public class OrderAgnostics {
    public static void main(String[] args) {
        int[] nums = {2,4,6,9,11,12,14,20,36,48};
        int target = 36;
        System.out.println(binarySearch(nums,target));
    }
    public static int binarySearch(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;

        boolean isAsc = nums[start] < nums[end];

        while(start <= end){

            int mid = start + (end-start)/2;

            if(nums[mid] == target){
                return mid;
            }

             if(isAsc){
                 if( nums[mid] > target){
                     end = mid -1;
                 }else{
                     start = mid+1;
                 }
             }else{
                 if( nums[mid] < target){
                     end = mid -1;
                 }else{
                     start = mid+1;
                 }
             }
        }
        return -1;
    }
}
