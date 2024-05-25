package easy;

public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"));
        //t.gcdOfStrings("ABABAB", "ABAB");

    }

    public String gcdOfStrings(String str1, String str2) {

        if (!(str1 + str2).equals(str2 + str1)) {
            return ""; // if the concatenation of both strings is not equal in both orders, no gcd exists
        }

        // gcd found, it's the substring up to the gcd length
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }

    // helper method to find greatest common divisor
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
