public class ReverseWords {
    public static void main(String[] args) {
        String sentence = "joyboy has returned";
        String[] words = sentence.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
