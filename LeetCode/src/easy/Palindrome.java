package easy;

public class Palindrome {
    public static void main(String[] args) {
        Palindrome test = new Palindrome();
        String string = "A man, a plan, a canal: Panama";
        System.out.println(test.isPalindrome(string));
    }

    public boolean isPalindrome(String s) {
        if (s.length() == 0 || s == null) return false;
        if (s.length() == 1) return true;

        String temp = s.toLowerCase();
        StringBuilder rev = new StringBuilder();
        StringBuilder nor = new StringBuilder();
        char[] tochar = temp.toCharArray();
        for (int i = tochar.length - 1, j = 0; i >= 0; i--, j++) {
            if (Character.isLetterOrDigit(tochar[i])) {
                rev.append(tochar[i]);
            }
            if (Character.isLetterOrDigit(tochar[j])) {
                nor.append(tochar[j]);
            }

        }
        return rev.toString().equals(nor.toString());


    }

}
