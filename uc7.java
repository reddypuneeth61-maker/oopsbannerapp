import java.util.HashMap;
import java.util.Map;

public class uc7 {

    public static void main(String[] args) {

        Map<Character, CharacterPattern> patternMap = new HashMap<>();

        patternMap.put('O', new CharacterPattern('O', new String[]{
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        }));

        patternMap.put('P', new CharacterPattern('P', new String[]{
                " ******  ",
                "*      * ",
                "*      * ",
                " ******  ",
                "*        ",
                "*        ",
                "*        "
        }));

        patternMap.put('S', new CharacterPattern('S', new String[]{
                "  *****  ",
                " *     * ",
                "*        ",
                "  *****  ",
                "        *",
                " *     * ",
                "  *****  "
        }));

        String word = "OOPS";

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                CharacterPattern cp = patternMap.get(ch);
                line.append(cp.getPattern()[row]).append("   ");
            }

            System.out.println(line);
        }
    }
}
class CharacterPattern {

    private char character;
    private String[] pattern;

    public CharacterPattern(char character, String[] pattern) {
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
