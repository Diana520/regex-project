package org.example;

import java.util.regex.Pattern;

public class Validation {

  private Validation() {

  }

  public static boolean validateString(String str, int length) {
    if (str.length() > length) {
      return false;
    }
    return Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!\"#$%&'()*+,\\-./:;<=>?@\\[\\]^_`{\\\\|}~].*).+$")
                  .matcher(str)
                  .find() && !Pattern.compile("\\s")
                                     .matcher(str)
                                     .find();
  }
}
