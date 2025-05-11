public class ArrayRotation {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int pos = 2;  

        int n = a.length;
        pos = pos % n;  

        for (int i = 0; i < pos; i++) {
            int temp = a[0];
            for (int j = 0; j < n - 1; j++) {
                a[j] = a[j + 1];
            }
            a[n - 1] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
