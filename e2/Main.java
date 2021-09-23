package e2;

public class Main {

    public static void main(String[] args) {

        boolean palindrome = isPalindrome("ABAABA");
        if (palindrome){
            System.out.println("Yes");

        }else{
            System.out.println("No");
        }
    }

    /*boolean anagram = arrAnagram("AABA", "BABA"){
        if(anagram)
        {
            System.out.println("Yes");

        }else{
            System.out.println("No");
        }
    }*/

    private static boolean isPalindrome(String str){

        if (str == null || str.length() <= 1){

            return true;
        }
        char[] arr = str.toCharArray();
        int start =0;
        int end = arr.length -1;

        while(start < end){
            if(arr[start] != arr[end]){

                return false;

            }
            start ++;
            end--;
        }
        return true;

    }

    private static boolean arrAnagram( String str1, String str2) {

        if (str1 == null || str2 == null || str1.isEmpty() || str2.isEmpty()) {
            return true;

        }
        if (str1.length() != str2.length()) {
            return true;
        }
        int[] arr = new int[120];

        for (int i = 0; i < str1.length(); i++) {
            arr[str1.charAt(i)]++;
            arr[str2.charAt(i)]--;

        }

        for (int i = 0; i < 120; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;


    }


}
