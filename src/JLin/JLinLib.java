//Jonathan Lin 9/20/2018
package JLin;

public class JLinLib {
    public static void println(String str)
    {
        System.out.println(str);
    }
    public static void println(int str)
    {
        System.out.println(str);
    }
    public static void println(boolean str)
    {
        System.out.println(str);
    }
    /**
     *
     * @param str
     * @return
     */
    public static boolean isPalindrome(String str) {
        int x = str.length();
        if (x < 2)
        {
            return true;
        }
        else {
            if (str.charAt(0) != str.charAt(x - 1)) {
                System.out.println(false);
            }
            if (str.charAt(0) == str.charAt(x - 1)) {
                System.out.println(true);
                return true;
            }
        }
        return false;
    }
    /**
     *
     * @param str
     * @return
     */
    public static String dateStr(String str)
    {
        String x = str.substring(0,2);// position of the first parameter
        String y = str.substring(3,5);// position of the second paremeter
        String z = str.substring(6,str.length());// lastly postion of the third parameter
        return y + "-" + x + "-" + z;// this returns all the version with dashes
    }
    /**
     *
     * @param mainStr
     * @param subStr
     * @return
     */
        public static String cutOut(String mainStr, String subStr)
        {
            String y = new String("");//makes new string
            y = mainStr.substring(0,mainStr.indexOf(subStr));//makes the cutting out if one word is found within the other.
            mainStr = mainStr.substring(mainStr.indexOf(subStr)+subStr.length());// so this I honestly thought would not work but surprisingly it did. I can't really explain this cause I'm not even sure how it works.
            return y + mainStr ;
        }
    /**
     *
     * @param number
     * @return
     */
    public static int sumUpTo(int number)
        {
            int x = 0;
            for(int i = 0; i <= number; i++) // a for loop to keep adding the numbers
            {
                x = x + i;// adds the number each time so it increments up by 1.
            }
            return x;
        }
    /**
     *
     * @param base
     * @param range
     */
        public static void multiplicationTable(int base, int range)//setting it to void because its a different type of output
        {
            int x = 0;
            for(int i = 0; i <= range; i++)// basically same as sumupto
            {
                x = x + i;
                System.out.println(x);// this is what makes the outputs keep coming.
            }
            return;// i cannot return anything other then nothing.
        }
}
