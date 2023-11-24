public class Solution{
    public static String gimmeTheLetters(String s){
        StringBuilder builder = new StringBuilder();
        char firstL = s.charAt(0);
        char lastL = s.charAt(2);
        while (firstL <= lastL){
            builder.append(firstL);
            firstL++;
        }
        return builder.toString();
    }
}