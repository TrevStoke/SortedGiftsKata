/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giftsorter;

import java.util.Arrays;
import java.util.InputMismatchException;

/**
 *
 * @author trevor
 */
public class GiftSorter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] inputs = {
            "abcdef",
            "kpqsuvy",
            "zyxwvutsrqponmlkjihgfedcba"
        };
        
        for (String input : inputs) {
            printSortedGifts(input);
        }
    }
    
    public static String sortGiftCode(String gifts)
    {
        validateGifts(gifts);
        return sortCharactersAscending(gifts);
    }
    
    private static void validateGifts(String gifts)
    {
        validateGiftsLength(gifts);
        validateGiftsUnique(gifts);
    }

    private static void validateGiftsLength(String gifts) 
            throws InputMismatchException {
        if(gifts.length() > 26) {
            throw new
                InputMismatchException("Cannot be greater than 26 characters.");
        }
    }
    
    private static void validateGiftsUnique(String gifts) 
            throws InputMismatchException
    {
        for(int i = 0; i < gifts.length(); i++)
        {
            for(int j = i+1; j < gifts.length(); j++)
            {
                if(gifts.charAt(i) == gifts.charAt(j))
                    throw new 
        InputMismatchException("Should contain unique characters.");
            }
        }
    }
    
    private static String sortCharactersAscending(String gifts) {
        char[] chars = gifts.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
    
    private static void printSortedGifts(String gifts)
    {
        System.out.printf("Input: %s\nYields: %s\n", 
                gifts,
                sortGiftCode(gifts));
    }
}
