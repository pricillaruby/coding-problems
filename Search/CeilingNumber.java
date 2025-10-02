public class CeilingNumber {
    public static void main(String[] args) {
        int[] nums = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println(ceilingNumber(nums,target));
    }
    //ceiling no = smallest number that is greater than target
    public static int ceilingNumber(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;

        while(start <= end){

            int mid = start + (end-start)/2;

            if(nums[mid] < target){
                start = mid+1;
            }else if( nums[mid] > target){
                end = mid -1;
            }else{ //target == arr[mid]
                return mid;
            }
        }
        return start; //When loop condition break(start > end) , start will be the answer
    }
}

