public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {14,12,9,5,77,50};
        int target = 14;
        System.out.println( linearSearch(arr,target));
    }

    //Returning the index of the founded element
    public static int linearSearch(int[] arr,int target){
        if(arr[0]==target){
            return 0; //If the element found at first position
        }
        if(arr.length == 0){
            return -1; //If the array is empty
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return i;
            }
        }

        return -1; //If element not found
    }

    //Returning element
    public static int linearSearch2(int[] arr,int target){
        if(arr[0]==target){
            return 0; //If the element found at first position
        }
        if(arr.length == 0){
            return -1; //If the array is empty
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return arr[i];
            }
        }

        return Integer.MAX_VALUE; //If element not found
    }

    //Returning true if it is found otherwise false
    public static boolean linearSearch3(int[] arr,int target){
        if(arr[0]==target){
            return true; //If the element found at first position
        }
        if(arr.length == 0){
            return false; //If the array is empty
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return true;
            }
        }

        return false; //If element not found
    }
}
