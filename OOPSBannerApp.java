/**
 * OOPSBannerApp
 * Prints OOPS to console
 * @author RP
 * @version 1.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Declare and initialize array in one step
        String[] banner = {

                String.join("",
                        "*","*","*","*","*","*","*","*","*","*",
                        "*","*","*","*","*","*","*","*","*","*"),

                String.join("", "*", "                  ", "*"),

                String.join("", "*", "      OOPS       ", "*"),

                String.join("", "*", "                  ", "*"),

                String.join("",
                        "*","*","*","*","*","*","*","*","*","*",
                        "*","*","*","*","*","*","*","*","*","*")
        };

        // Enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}