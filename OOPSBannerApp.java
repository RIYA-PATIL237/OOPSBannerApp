/**
 * OOPSBannerApp
 * Prints OOPS using static helper methods
 * @author RP
 * @version 1.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] o = buildO();
        String[] p = buildP();
        String[] s = buildS();

        // Loop row by row
        for (int i = 0; i < o.length; i++) {
            System.out.println(o[i] + "  " + o[i] + "  " + p[i] + "  " + s[i]);
        }
    }

    // Method to build O
    public static String[] buildO() {
        return new String[] {
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };
    }

    // Method to build P
    public static String[] buildP() {
        return new String[] {
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        };
    }

    // Method to build S
    public static String[] buildS() {
        return new String[] {
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        };
    }
}