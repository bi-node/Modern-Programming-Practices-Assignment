package easy;

public class StringAlternate {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqrst"));
    }

    public static String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int len = len1 < len2 ? len1 : len2;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));

        }
        if (len1 > len2) sb.append(word1.substring(len, len1));
        else sb.append(word2.substring(len, len2));

        return sb.toString();

    }

}
