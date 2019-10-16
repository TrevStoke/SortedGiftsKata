/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giftsorter;

import java.util.InputMismatchException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author trevor
 */
public class GiftSorterTest {
    
    
    @Test
    public void testBlankInput() {
        assertEquals("", GiftSorter.sortGiftCode(""));
    }
    
    @Test
    public void testOrderedInputString(){
        String expected = "abcdef";
        String actual = GiftSorter.sortGiftCode("abcdef");
        assertEquals(expected, actual);
    }
    
    @Test
    public void testUnorderedInputString(){
        String expected = "kpqsuvy";
        String actual = GiftSorter.sortGiftCode("pqksuvy");
        assertEquals(expected, actual);
    }
    
    @Test(expected = InputMismatchException.class)
    public void testInputTooLong()
    {
        String input = "zyxwvutsrqponmlkjihgfedcbaxyz";
        String result = GiftSorter.sortGiftCode(input);
    }
    
    @Test(expected = InputMismatchException.class)
    public void testInputWithDuplicateCharacters()
    {
        String input = "abcdefga";
        String result = GiftSorter.sortGiftCode(input);
    }
}
