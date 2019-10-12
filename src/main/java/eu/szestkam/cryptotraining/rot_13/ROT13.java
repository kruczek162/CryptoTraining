package eu.szestkam.cryptotraining.rot_13;

public class ROT13 {
    private final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private String phrase;

    ROT13(String text) {
        this.phrase = text;
    }

    ROT13() {
        phrase = "";
    }

    public String encode() {
        String code = "";

        char[] letters = phrase.toCharArray();
        for (char letter : letters) {
            boolean isLower = isLower(letter);
            Character _char = Character.toUpperCase(letter);
            int val = charIndexOf(_char);
            int newVal = (val + 13) % 26;
            String newLetter = codeLetter(newVal);
            code += valueNewLetter(isLower, newLetter);
        }

        return code;
    }

    public String decrypt() {
        String code = "";

        char[] letters = phrase.toCharArray();
        for (char letter : letters) {
            boolean isLower = isLower(letter);
            Character _char = Character.toUpperCase(letter);
            int val = charIndexOf(_char);
            int newVal = (val  + 13) % 26;
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
