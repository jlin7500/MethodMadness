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
    public static String datStr(String str)
    {
        
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



}
