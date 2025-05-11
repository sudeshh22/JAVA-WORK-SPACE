public class Main {
    public static void main(String[] args) {
        String[] arr = { "apple", "ape", "april" };

        if (arr == null || arr.length == 0) {
            System.out.println("");
            return;
        }

        String prefix = arr[0];

        for (int i = 1; i < arr.length; i++) {
            while (arr[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
              
                if (prefix.isEmpty()) {
                    System.out.println("");
                    return;
                }
            }
        }

        System.out.println(prefix);
    }
}
