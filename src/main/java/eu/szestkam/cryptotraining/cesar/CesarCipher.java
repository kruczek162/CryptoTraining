package eu.szestkam.cryptotraining.cesar;

public class CesarCipher {

    private final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private String phrase;

    CesarCipher(String text) {
        this.phrase = text;
    }

    CesarCipher() {
        phrase = "";
    }

    String encode() {
        String code = "";

        char[] letters = phrase.toCharArray();
        for (char letter : letters) {
            boolean isLower = Character.isLowerCase(letter);
            Character _char = Character.toUpperCase(letter);
            int val = ALPHABET.indexOf(_char);
            int newVal = (val + 3) % 26;
            String newLetter = String.valueOf(ALPHABET.charAt(newVal));
            code += (isLower) ? newLetter.toLowerCase() : newLetter.toUpperCase();
        }

        return code;
    }

    String decrypt() {
        String code = "";

        char[] letters = phrase.toCharArray();
        for (char letter : letters) {
            boolean isLower = Character.isLowerCase(letter);
            Character _char = Character.toUpperCase(letter);
            int val = ALPHABET.indexOf(_char);
            int newVal = (val + 23) % 26;
            String newLetter = String.valueOf(ALPHABET.charAt(newVal));
            code += (isLower) ? newLetter.toLowerCase() : newLetter.toUpperCase();
        }

        return code;
    }

}
