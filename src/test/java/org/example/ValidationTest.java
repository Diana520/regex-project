package org.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ValidationTest {

  @Test
  public void testHasAtLeastOneUpperLowerDigitSpecialReturnTrue() {
    boolean result = Validation.validateString("Ul3<", 10);
    assertTrue(result);
  }

  @Test
  public void testHasMoreThanOneUpperLowerDigitSpecialReturnTrue() {
    boolean result = Validation.validateString("lF34BgF3<", 10);
    assertTrue(result);
  }

  @Test
  public void testNotHaveUpperReturnFalse() {
    boolean result = Validation.validateString("ul3:", 10);
    assertFalse(result);
  }

  @Test
  public void testNotHaveLowerReturnFalse() {
    boolean result = Validation.validateString("UD3]", 10);
    assertFalse(result);
  }

  @Test
  public void testNotHaveDigitReturnFalse() {
    boolean result = Validation.validateString("Ufl.", 10);
    assertFalse(result);
  }

  @Test
  public void testNotHaveSpecialReturnFalse() {
    boolean result = Validation.validateString("Uf7", 10);
    assertFalse(result);
  }

  @Test
  public void testHasSpaceReturnFalse() {
    boolean result = Validation.validateString("Uf7> ", 10);
    assertFalse(result);
  }

  @Test
  public void testHasTabReturnFalse() {
    boolean result = Validation.validateString("Uf7>  ", 10);
    assertFalse(result);
  }

  @Test
  public void testHasNewLineReturnFalse() {
    boolean result = Validation.validateString("Uf7>\n", 10);
    assertFalse(result);
  }

  @Test
  public void testStringMoreThanLengthReturnFalse() {
    boolean result = Validation.validateString("Uf7>", 1);
    assertFalse(result);
  }

}