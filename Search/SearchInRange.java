public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        int target = 3;
        int start =1 ;
        int end =4;
        System.out.println(searchInRange(arr,target,start,end));
    }

    public static int searchInRange(int[] arr,int target,int start,int end) {
        while(start < end){
            for (int i = start; i <= end; i++) {
                if (arr[i] == target) {
                    return i;
                }
            }
        }
        return -1;//If element not found
    }
}
