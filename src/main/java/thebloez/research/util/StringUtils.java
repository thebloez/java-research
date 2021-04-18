package thebloez.research.util;

public class StringUtils {
    public static boolean isLowerCase(String value){
        for (char c : value.toCharArray()){
            if (Character.isLetter(c)){
                if (!Character.isLowerCase(c)){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isLower(String value){
        for (char c : value.toCharArray()){
            if (Character.isLetter(c)){
                if (!Character.isLowerCase(c)){
                    return false;
                }
            }
        }
        return true;
    }
}
