public class CharacterFrequencyCounter {
    public static void main(String[] args) {
        String a = "aabbccd";
        char[] arr = a.toCharArray();
        int count;

        for (int i = 0; i < arr.length; i++) {
            count = 1;
            if (arr[i] != '0') {  // '0' is used to mark counted characters
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        arr[j] = '0';  // mark as counted
                    }
                }
                System.out.println(arr[i] + " : " + count);
            }
        }
    }
}
