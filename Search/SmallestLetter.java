public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'c','d','f','j'};
        char target = 'c';
        System.out.println(ceilingNumber(letters,target));
    }
    //ceiling no = smallest letter that is greater than target
    public static char ceilingNumber(char[] letters,char target){
        int start = 0;
        int end = letters.length-1;

        while(start <= end){

            int mid = start + (end-start)/2;

            if(letters[mid] > target){
                end = mid -1;
            }else{
                start = mid+1;
            } //here no need of mid element , ignore the mid
        }
        return letters[start % letters.length]; //When no element is found greater in the array , it return 1st element
    }
}
