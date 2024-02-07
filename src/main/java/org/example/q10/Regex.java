package org.example.q10;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static final Pattern p = Pattern.compile("\\d{3}");

    public static String[] threeDigitNumbers(String source) {
        ArrayList<String> retVal = new ArrayList<String>();
        Matcher m = p.matcher(source);
        while (m.find()) {
            retVal.add(m.group());
        }
        String[] retValArray = new String[retVal.size()];
        return retVal.toArray(retValArray);
    }
}