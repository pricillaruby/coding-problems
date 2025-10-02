public class MinimumElement {
    public static void main(String[] args) {
        int[] arr = {14,12,9,5,77,50};
        System.out.println(minimumElement(arr));
    }

    public static int minimumElement(int[] arr){
        int min = arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        return min; //If element not found
    }
}
