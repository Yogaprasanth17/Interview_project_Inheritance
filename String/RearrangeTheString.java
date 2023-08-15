package String;

import java.util.*;

/*
 * Input => H1e was0 t3he Bo2y
 * Output => was He Boy the
*/

public class RearrangeTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to be rearranged : ");
        // Reading the new line string form the user
        String string = sc.nextLine();
        // Spliting the new line string with white space " "
        String[] stringArray = string.split(" ");
        
        // fro loop for iterating the string array -> stringArray[]
        for (int i = 0; i < stringArray.length; i++) {
            // Initializing the variable as zero
            int j = 0, x = 0;
            while(true) {
                // Converting the splitted string array into character array
                // with the respective index (to check the index number present in the string)
                // -> charArray[]
                char[] charArray = stringArray[j].toCharArray();
                // Iterate the character array to get the digit present in it 
                // and store in it a variable -> x
                for (int k = 0; k < charArray.length; k++) {
                    if(Character.isDigit(charArray[k])) {
                        x = charArray[k] - 48;
                    }
                }
                // And then by that variable check that the variable is equal to the "i loop"
                // to print in the correct order
                if(x == i) {
                    for (int l = 0; l < charArray.length; l++) {
                        if(Character.isLetter(charArray[l])) {
                            System.out.print(charArray[l]);
                        }
                    }
                    // Blank space for giving space bettween the two strings
                    System.out.print(" ");
                    break;
                }
                j++; // Iterate the j value so it move to the next index of charArray
            }
        }
    }
}

