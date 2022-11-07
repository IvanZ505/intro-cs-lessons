public class Palindrome {
    public static boolean palindrome(String string) {
        String backwards = "";
        for(int x = string.length()-1; x>=0; x--) {
            backwards = backwards.concat(String.valueOf(string.charAt(x)));
            StdOut.println(backwards);
        }
        return string.equals(backwards);
    }

    public static boolean palindrome_recur(String string) {
        if(string == null || string.length() == 0 || string.length() == 1) {
            return true;
        }
        char firstLetter = string.charAt(0);
        char lastLetter = string.charAt(string.length()-1);

        if(firstLetter == lastLetter) {
            return palindrome_recur(string.substring(1, string.length()-1));
        } else {
            return false;
        }

    }
    public static void main(String[] args) {
        StdOut.println(palindrome_recur("boboobob"));
    }
}
