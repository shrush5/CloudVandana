public class PangramChecker {
    public static boolean isPangram(String sentence) {
        String lowerCaseSentence = sentence.toLowerCase();
        for (char letter = 'a'; letter <= 'z'; letter++) {
            if (lowerCaseSentence.indexOf(letter) == -1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String inputSentence = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(inputSentence);
        System.out.println("Is the sentence a pangram? " + isPangram);
    }
}