// Half-working program to clear blocks of two percentage signs from entered string

import java.util.Scanner;   //import Scanner class

public class Kommentarer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        // strip percentages
        text = strip_percentages(text);

        // strip slashes
        // for (int j = 0; j < text.length() - 1; j++) {
        //        if ((text.charAt(j) == '/') && (text.charAt(j + 1) == '*')) {
        //            text = strip_slashes(text);
        //        }
        //    }

        System.out.println(text);

    }

    private static String strip_percentages(String text) {

        String temp_text = "";      // to store valid letters
        String temp_string = "";    // to store possible leftovers after unfinished %

        boolean skipping = false;   // flag to skip letters
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != '%' && skipping == false) {
                temp_text += String.valueOf(text.charAt(i));
            } else if (text.charAt(i) == '%' && skipping == false) {
                temp_text += temp_string;
                temp_string = "%";
                skipping = true;
            } else if (text.charAt(i) == '%' && skipping == true) {
                temp_string = "";
                skipping = false;
            } else if (text.charAt(i) != '%' && skipping == true) {
                temp_string += String.valueOf(text.charAt(i));
            } else if (text.charAt(i) != '%' && skipping == false) {
                temp_text += String.valueOf(text.charAt(i));
            }
        }

        return temp_text + temp_string;

    }

    private static String strip_slashes(String text) {

        return text;

    }

}
