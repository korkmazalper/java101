package anagrams;

import java.util.Scanner;

public class AnagramStrings {



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

    /**
     * This code was written without the use of Arrays.sort() method
     * By converting both strings to character arrays, to sort both the resulted arrays and finally
     * compare them is widely used method
     * @param a String
     * @param b String
     * @return boolean if a nad b are anagrams
     */
    static boolean isAnagram(String a, String b) {
        // Complete the function
        String a1 = a.replace("\\s", "").toLowerCase();
        String b1 = b.replace("\\s", "").toLowerCase();
        if (a1.length() != b1.length()) {
            return false;
        } else {
            StringBuilder sbB = new StringBuilder(b1);
            for (int i = 0; i < a1.length(); i++) {
                int indexOfCharacter = sbB.indexOf("" + a1.charAt(i));
                if (indexOfCharacter != -1) {
                    sbB.deleteCharAt(indexOfCharacter);
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}


