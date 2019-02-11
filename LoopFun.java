 

public class LoopFun {

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
       int result;

        if(number==1)
         return 1;

       result = factorial(number-1) * number;
       return result;
      
      }
      

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
         String sentence = "Ruby on Rails";
         String[] words = sentence.split("");
         String result = "";
            for (int i = 0; i < words.length; i++){
                String isolatedWord = words[i];
                char firstLetter = isolatedWord.charAt(0);
                String letterResult = Character.toString(firstLetter);
                String capitalizedFirstLetter = letterResult.toUpperCase();
                result = result + capitalizedFirstLetter;
            }
            return result;
          
          
      }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) {
          String stringOfAlphabets = "abcdefghijklmnopqrstuvwxyz";
          String result = "";
            for(int i = 0; i < word.length(); i++) {
                char wordChar = word.charAt(i);
                if(Character.isLetter(wordChar)) {
                    int charIndex = stringOfAlphabets.indexOf(wordChar);
                    int charIndexPlus3 = charIndex + 3;
                    if(charIndexPlus3 > 25) {
                        int difference = (charIndexPlus3 - 25) - 1;
                        char charResult = stringOfAlphabets.charAt(charIndexPlus3);
                        result = Character.toString(charResult);
                    }else{
                        char charResult = stringOfAlphabets.charAt(charIndexPlus3);
                        result = Character.toString(charResult); 
                    }
                }
            }
            return result;
        }
}
