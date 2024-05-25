package easy;

public class SubArrayPrint {
    public static void main(String[] args) {
        int[] a = {1, 3, 2, 3, 3};
        SubArrayPrint sap = new SubArrayPrint();
        sap.display(a);

    }

    public void display(int[] a) {
        int upperbound, lowerbound;
        int len = a.length;
        for (int i = len - 1; i >= 0; i--) {
            for (int j = i; j < len; j++) {
                lowerbound = j - i;
                upperbound = j;
                System.out.println(toString(a, lowerbound, upperbound));
            }
        }
    }

    private String toString(int[] arr, int lb, int up) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = lb; i <= up; i++) {
            sb.append(" " + arr[i] + " ");
        }
        return sb.toString();
    }

}
