public class ProbabilityManager {
    private String[] words;
    private int[] wordValues;
    private final String LETTER_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private char[] letters;
    private int[] letterValues;

    public ProbabilityManager(String[] words) {
        letters = LETTER_STRING.toCharArray();
        this.words = words;
        wordValues = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            wordValues[i] = 0;
        }
        letterValues = new int[26];

        for (int i = 0; i < 26; i++) {
            letterValues[i] = 0;
        }
    }

    public String calculate() {
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < 5; j++) {
                letterValues[LETTER_STRING.indexOf(words[i].charAt(j))]++;
            }
        }

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < 5; j++) {
                wordValues[i]+=letterValues[LETTER_STRING.indexOf(words[i].charAt(j))];
            }
        }

        int highL = 0;
        int highI = 0;
        for (int i = 0; i < words.length; i++) {
            if(wordValues[highI] > highL) {
                highI = i;
                highL = wordValues[i];
            }
        }
        return words[highI];
    }


}
