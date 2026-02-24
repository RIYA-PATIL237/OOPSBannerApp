/**
 * OOPSBannerApp
 * Prints OOPS to console
 * @author RP
 * @version 1.0
 */

public class OOPSBanner {

    public static void main(String[] args) {
        printBanner();
    }

    // Static method to print full banner
    public static void printBanner() {

        System.out.println(createTopBottom());
        System.out.println(createEmptyLine());
        System.out.println(createOOPSLine());
        System.out.println(createEmptyLine());
        System.out.println(createTopBottom());
    }

    // Creates top and bottom border
    public static String createTopBottom() {
        return String.join("",
                "*","*","*","*","*","*","*","*","*","*",
                "*","*","*","*","*","*","*","*","*","*");
    }

    // Creates empty line with borders
    public static String createEmptyLine() {
        return String.join("", "*", "                  ", "*");
    }

    // Creates OOPS text line
    public static String createOOPSLine() {
        return String.join("", "*", "      OOPS       ", "*");
    }
}