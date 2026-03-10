import java.util.HashMap;
import java.util.Map;

public class uc8 {

    public static void main(String[] args) {

        Map<Character, BannerCharacter> bannerMap = new HashMap<>();

        bannerMap.put('O', new BannerCharacter('O', new String[]{
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        }));

        bannerMap.put('P', new BannerCharacter('P', new String[]{
                " ******  ",
                "*      * ",
                "*      * ",
                " ******  ",
                "*        ",
                "*        ",
                "*        "
        }));

        bannerMap.put('S', new BannerCharacter('S', new String[]{
                "  *****  ",
                " *     * ",
                "*        ",
                "  *****  ",
                "        *",
                " *     * ",
                "  *****  "
        }));

        String word = "OOPS";

        renderBanner(word, bannerMap);
    }
    public static void renderBanner(String word, Map<Character, BannerCharacter> bannerMap) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                BannerCharacter bc = bannerMap.get(ch);
                line.append(bc.getPattern()[row]).append("   ");
            }

            System.out.println(line);
        }
    }
}

class BannerCharacter {

    private char character;
    private String[] pattern;

    public BannerCharacter(char character, String[] pattern) {
        this.character = character;
        this.pattern = pattern;
    }

    public char getCharacter() {
        return character;
    }

    public String[] getPattern() {
        return pattern;
    }
}
