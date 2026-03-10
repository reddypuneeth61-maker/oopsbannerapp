public class uc6 {

    public static void main(String[] args) {

        String[] lines = {
                String.join("   ", buildO()[0], buildO()[0], buildP()[0], buildS()[0]),
                String.join("   ", buildO()[1], buildO()[1], buildP()[1], buildS()[1]),
                String.join("   ", buildO()[2], buildO()[2], buildP()[2], buildS()[2]),
                String.join("   ", buildO()[3], buildO()[3], buildP()[3], buildS()[3]),
                String.join("   ", buildO()[4], buildO()[4], buildP()[4], buildS()[4]),
                String.join("   ", buildO()[5], buildO()[5], buildP()[5], buildS()[5]),
                String.join("   ", buildO()[6], buildO()[6], buildP()[6], buildS()[6])
        };

        for (String line : lines) {
            System.out.println(line);
        }
    }

    public static String[] buildO() {
        return new String[] {
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        };
    }

    public static String[] buildP() {
        return new String[] {
                " ******  ",
                "*      * ",
                "*      * ",
                " ******  ",
                "*        ",
                "*        ",
                "*        "
        };
    }

    public static String[] buildS() {
        return new String[] {
                "  *****  ",
                " *     * ",
                "*        ",
                "  *****  ",
                "        *",
                " *     * ",
                "  *****  "
        };
    }
}
