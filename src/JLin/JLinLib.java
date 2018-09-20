//Jonathan Lin 9/20/2018
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
                    String y = str.substring(i-1,i);
                    x += y;
                    if(x.equalsIgnoreCase(y))
                    {
                        return "true";
                    }
                    return "false";
                }
                return "false";
        }

    /**
     *
     * @param mainStr
     * @param subStr
     * @return
     */
        public static String cutOut(String mainStr, String subStr)
        {
            String y = new String("");
            y = mainStr.substring(0,mainStr.indexOf(subStr));
            mainStr = mainStr.substring(mainStr.indexOf(subStr)+subStr.length());
            return y + mainStr ;
        }



}
