package qhy.example.bean.util;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;

public class MatchUtil {

    public static boolean match(String text, String regex) {

        if (StringUtils.isBlank(text) || StringUtils.isBlank(regex)) {

            return false;

        }
        return Pattern.compile(regex).matcher(text).matches();

    }
}
