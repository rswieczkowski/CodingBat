package pl.ap_1;

public class CommonTwo {

    public static int commonTwo(String[] a, String[] b) {

        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i].equals(b[j])) {
                    count++;
                    break;
                }
            }
            while (i < a.length -1 && a[i+1].equals(a[i])) {
                i++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(commonTwo(new String[]{"a", "a", "b", "b", "c"}, new String[]{"a", "b", "c"}));
    }
}
