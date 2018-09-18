package JLin;

public class JLinLib {

    public static void println(String str)
    {
        System.out.println(str);
    }
    public static String isPalindrome(String str)
        {
            String x = new String("");
            for(int i = str.length(); i > 0; i--)
                {
                    String y = str.substring(i,i-1
                    );
                    x = x + y;
                    if(x.equals(y))
                    {
                        return "true";
                    }
                    return "false";
                }
                return "false";
        }
}
