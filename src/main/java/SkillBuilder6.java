
/**
 * SkillBuilder6 is a class for completing this Skill
 * Builder assignment in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class SkillBuilder6 {

    private boolean containsT;
    private boolean containsY;

    public static String findTYPattern(String s)
    {
        String result = "";
        String temp;

        if (s.contains("T")) {
            if (s.substring(s.indexOf("T")).contains("Y")) {
                temp = s.substring(s.indexOf("T"));
                result = temp.substring(0, temp.indexOf("Y")+1);
            } else if (s.substring(s.indexOf("T")).contains("y")) {
                temp = s.substring(s.indexOf("T"));
                result = temp.substring(0, temp.indexOf("y")+1);
            }
        } else if (s.contains("t")) {
            if (s.substring(s.indexOf("t")).contains("Y")) {
                temp = s.substring(s.indexOf("t"));
                result = temp.substring(0, temp.indexOf("Y")+1);
            } else if (s.substring(s.indexOf("t")).contains("y")) {
                temp = s.substring(s.indexOf("t"));
                result = temp.substring(0, temp.indexOf("y")+1);
            }
        }

        return result;
    }
}
