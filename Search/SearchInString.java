public class SearchInString {
    public static void main(String[] args) {
        String name = "Pricilla";
        char target = 's';
        System.out.println(searchInString(name,target));
    }
    public static boolean searchInString(String name,char target){
        char[] nameArray = name.toCharArray();
        for (char value : nameArray) {
            if (value == target) {
                return true;
            }
        }
        return false;
    }
}
