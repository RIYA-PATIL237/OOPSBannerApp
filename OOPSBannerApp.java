/**
 * OOPSBannerApp
 * Prints OOPS to console
 * @author RP
 * @version 1.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {
        printBanner();
    }

    public static void printBanner() {

        // Create banner lines using String.join()
        String topBottom = String.join("",
                "*","*","*","*","*","*","*","*","*","*",
                "*","*","*","*","*","*","*","*","*","*");

        String emptyLine = String.join("", "*", "                  ", "*");

        String oopsLine = String.join("", "*", "      OOPS       ", "*");

        // Store all lines in an array
        String[] banner = {
                topBottom,
                emptyLine,
                oopsLine,
                emptyLine,
                topBottom
        };

        // Enhanced for-loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}