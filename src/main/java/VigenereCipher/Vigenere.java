package VigenereCipher;

public class Vigenere {

   private String phare;
   private  String key;

   public Vigenere () {
       phare = "";
   }
   public Vigenere (String text, String key) {
       this.phare = text;
       this.key = key;
   }

   public String encrypt () {
       String encode = "";
       phare = phare.toUpperCase();
       for (int i = 0, j = 0; i < phare.length(); i++)
       {
           char c = phare.charAt(i);
           if (c < 'A' || c > 'Z')
               continue;
           encode += (char) ((c + key.charAt(j) - 2 * 'A') % 26 + 'A');
           j = ++j % key.length();
       }
       return encode;
   }


    public String decrypt() {
        String decode = "";
        phare = phare.toUpperCase();
        for (int i = 0, j = 0; i < phare.length(); i++) {
            char c = phare.charAt(i);
            if (c < 'A' || c > 'Z') continue;
            decode += (char)((c - key.charAt(j) + 26) % 26 + 'A');
            j = ++j % key.length();
        }
        return decode;
    }
}
