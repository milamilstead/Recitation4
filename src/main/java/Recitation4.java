public class Recitation4 {

    /**
     * Returns a string generated from word by duplicating
     * each letter in the string based on the character's position. Digits
     * are duplicated by the value of their digit. Any other character
     * considered non-alphanumeric will result in all characters being
     * appended to the result, up to but not including the non-alphanumeric
     * character.
     *
     * @param word a string that is to be exploded
     * @return a string generated from word by duplicating
     *        each letter in the string based on the character's position. Digits
     *        are duplicated by the value of their digit. Any other character
     *        considered non-alphanumeric will result in all characters being
     *        appended to the result, up to but not including the non-alphanumeric
     *        character
     */
    public static String explode(String word){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length();i++){
            char ch = word.charAt(i);

                if (Character.isLetter(ch)){
                    for(int j = 0; j <= i ; j++){
                        sb.append(ch);
                    }
                }else if(Character.isDigit(ch)){
                    int num = Character.getNumericValue(ch);
                    for (int s = 0; s < num; s++ )
                    sb.append(ch);
                }else {
                    sb.append(word.substring(0,i));
                }
            }

        return sb.toString();
    }
}
/*
TODO: Replace this line with your algorithm
*/
