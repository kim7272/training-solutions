package week05d02;

import java.util.Arrays;

public class ChangeLetter {

    public String changeWovels(String textForChange) {
        textForChange = textForChange.toLowerCase();
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (char ch : vowels) {
            textForChange = textForChange.replace(ch, '*');
        }
        return textForChange;
    }
}

