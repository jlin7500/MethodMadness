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

    //public static String isPalindrome(String str)
      //  {
        //    String x = "";
          //  for(int i = str.length(); i >= 0; i--)
              //  {
            //        String y = str.substring(i-1,i);
                //    x += y;
                    //if(x.equals(y))
                  //  {
                      //  return "true";
                    //}
                 //   return "false";
               // }
              //  return "false";
       // }

    public static boolean isPalindrome(String str) {
        int length = str.length();
        if (length < 2)
        {
            return true;
        }
        else {
            if (str.charAt(0) != str.charAt(length - 1)) {
                System.out.println(false);
            }
            if (str.charAt(0) == str.charAt(length - 1)) {
                System.out.println(true);
                return true;
            }
        }
        return false;
    }
    public static String dateStr(String str)
    {
        String x = str.substring(0,2);
        String y = str.substring(3,5);
        String z = str.substring(6,str.length());
        return y + "-" + x + "-" + z;
    }
    public static boolean isFibonnaci(int num)
    {
        int input = num;
        int x = 0;
        int y = 1;
        int z = 0;

        for(z = 0; z < input; z++)
        {
            z = x + y;//num +
            x = y;
            y = z;
        }
        if (z != input)
        {
            System.out.println(false);
        }

        else if(z == input)
        {
            System.out.println(true);
            return true;
        }
        return false;
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
        public static int sumUpTo(int number)
        {
            int x = 0;
            for(int i = 0; i <= number; i++)
            {
                x = x + i;

            }
            return x;
        }
        public static int multiplicationTable(int base, int range)
        {
            int x = 0;
            for(int i = 0; i <= range; i++)
            {
                x = x + i;

            }
            return x;
        }



}
