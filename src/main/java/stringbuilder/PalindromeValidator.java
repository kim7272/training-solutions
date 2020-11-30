package stringbuilder;

public class PalindromeValidator {

    public boolean isPalindrome(String word){
        if (word == null){
            throw new IllegalArgumentException("Text must not be null!");
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sbBack = new StringBuilder();
        sb.append(word);
        sb2.append(word);
        sb2.reverse();
        if (word == "" || word.trim() == "") {
            return true;
        }
        else if (sb.toString().equalsIgnoreCase(sb2.toString())){
            return true;
        }
            return false;
        }
    }


