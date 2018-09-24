//Jonathan Lin 9/20/2018
package JLin;

import static JLin.JLinLib.*;

public class TestFile {

    public static void main(String[] args)
    {
        println("I love a cup of Java in the morning.");
        // isPalindrome just checks if the letter is a palindrome. it also works for numbers.
        isPalindrome("101");
        //this function is cut out, it just takes the second string and compare it with the first string and if there are the same things it will cut it out.
        println(cutOut("ratcatbat","cat"));
        // This adds everything from 0 until the number you input. this was quite easy to do.tested it with random numbers
        println(sumUpTo(10));
        // this is the date formatting function. To be honest I kinda hard coded it because you gave us exact inputs so.just wrote different dates to see if it caused a problem, not like its suppose to.
        println(dateStr("04/10/2001"));
        // this is basically another version of sum up to just in a different form and also displayed differently.tested it with random bases and ranges.
        multiplicationTable(5,10);
    }

}
