package org.example;

import java.util.regex.Pattern;

public class Validation {

  public static boolean validateString(String str, int length) {
    if (str.length() > length) {
      return false;
    }
    if (!Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!\"#$%&'()*+,\\-./:;<=>?@\\[\\]^_`{\\\\|}~].*).+$")
                .matcher(str)
                .find()) {
      return false;
    }
    if (Pattern.compile("\\s")
               .matcher(str)
               .find()) {
      return false;
    }
    return true;
  }
}
