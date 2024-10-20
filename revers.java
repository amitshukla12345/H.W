public class ReverseWords {
    public static void main(String[] args) {
     
        String inputString = "I love Java Programming";


        String[] words = inputString.split(" ");

      
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.println(words[i]);
        }
    }
}