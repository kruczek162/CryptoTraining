package eu.szestkam.cryptotraining.AtBashCipher;

public class AtBash {

    private String phrase;
    private final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public AtBash () {
        this.phrase = "";
    }

    public AtBash (String text) {
        this.phrase = text;
    }

    public String code () {
        String code  = "";

        char [] letters = phrase.toCharArray();
        for (char letter : letters) {
             boolean isLower = isLower(letter);
            Character _char = Character.toUpperCase(letter);
            int val = charIndexOf(_char);

            int newVal = ALPHABET.length()-val-1;

            String newLetter = codeLetter(newVal);

            code += valueNewLetter(isLower, newLetter);

        }
        return code;
    }



    private static String valueNewLetter(boolean isLower, String newLetter) {
        return (isLower) ? newLetter.toLowerCase() : newLetter.toUpperCase();
    }
    private String codeLetter(int newVal) {
        return String.valueOf(ALPHABET.charAt(newVal));
    }

    private static boolean isLower(char letter) {
        return Character.isLowerCase(letter);
    }

    private int charIndexOf(Character _char) {
        return ALPHABET.indexOf(_char);
    }


}
