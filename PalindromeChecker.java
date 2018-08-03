public class PalindromeChecker {
    public static void main(String[] args) {
        System.out.println(isPalindrome1(args[0]));
        System.out.println(isPalindrome2(args[0]));
        System.out.println(isPalindrome3(args[0]));
        System.out.println(isPalindrome4(args[0]));
    }

    private static boolean isPalindrome1(String s) {
        int sLength = s.length();
        int halfLength = sLength / 2;

        int equivCount = 0;

        for (int i = 0; i < halfLength; i++) {
           if (s.charAt(i) == s.charAt(sLength - i - 1)) {
                equivCount++;
            }
        }

        return (halfLength == equivCount) ? true : false;
    }

    private static boolean isPalindrome2(String s) {
        int sLength = s.length();
        int halfLength = sLength / 2;

        int i = 0;

        while (i < halfLength) {
            if (s.charAt(i) != s.charAt(sLength - i - 1))
                return false;
            i++;
        }
        return true;
    }

    private static boolean isPalindrome3(String s) {
        int sLength = s.length();
        int i = 0;

        if (sLength == 0 || sLength == 1)
            return true;
        if (s.charAt(i) == s.charAt(sLength - i - 1)) {
            i++;
            if (sLength > 2)
                isPalindrome3(s.substring(i, sLength - i - 1));
            return true;
        }
        else
            return false;
    }

    private static boolean isPalindrome4(String s) {
        int sLength = s.length();
        int i = 0;

        if (sLength <= 1)
            return true;
        if (areTwoLettersEqual(s, i)) {
            i++;
            if (sLength > 2)
                isPalindrome3(s.substring(i, sLength - i - 1));
            return true;
        }
        else
            return false;
    }

    private static boolean areTwoLettersEqual(String s, int i) {
        return s.charAt(i) == s.charAt(s.length() - i - 1) ? true : false;
    }
}