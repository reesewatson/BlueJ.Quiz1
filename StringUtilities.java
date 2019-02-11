
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue + valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        StringBuilder builder = new StringBuilder(valueToBeReversed);
        String result = builder.reverse().toString();
        return result;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        char result;
        int numOfChars = word.length() % 2;
        int compareTo = word.length() % 2;
        //if it's even
        if(compareTo == 0) {
            int index = (word.length() / 2) - 1;
            result = word.charAt(index);
        }
        //if it's odd
        else {
            int index = word.length() / 2;
            result = word.charAt(index);
        }
        return result;
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
      
        
        if (value.charAt(value.length()-1)=='X'){
        value = value.replace(value.substring(value.length()-1), "");
        return value;
        } else {
        return value;
        }
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String testString = "sentence";
        String[] parts = testString.split(" ");
        String lastWord = parts[parts.length - 1];
        System.out.println(lastWord); 
        return lastWord;
    }
}
