/**
 * OOPSBannerApp
 * UC7 – Store Character Pattern in a Class
 */

public class OOPSBannerApp {

    // Static Inner Class
    static class CharacterPattern {

        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter
        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        CharacterPattern o = new CharacterPattern('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        CharacterPattern p = new CharacterPattern('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        CharacterPattern s = new CharacterPattern('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        String word = "OOPS";

        // Loop row by row
        for (int i = 0; i < 5; i++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {

                if (c == 'O') {
                    line.append(o.getPattern()[i]).append("  ");
                } else if (c == 'P') {
                    line.append(p.getPattern()[i]).append("  ");
                } else if (c == 'S') {
                    line.append(s.getPattern()[i]).append("  ");
                }
            }

            System.out.println(line);
        }
    }
}