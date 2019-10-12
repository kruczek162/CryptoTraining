package eu.szestkam.cryptotraining.cesar;

public class CesarCipher {
    private String phrase;

    CesarCipher(String text) {  
        this.phrase = text;
    }

    CesarCipher() {
        phrase = "";
    }

    String encode() {
        return phrase;
    }

}
