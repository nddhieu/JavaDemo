package topic.patternString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class characterClassDemo {
    /**
     * demo how to use character in  search patern
     */

    public static void main (String[] args){
        // search in the string "123456789" where is the pattern which include 0 to 5 (012345) but not have 3,4,5, --> so pattern will be 012
        getMatcherWithPattern("[0-5&&[^345]]","123456789");

        getMatcherWithPattern("number","NUMBER");

        // (?i) indicate that ignore the case (upper or lower case) of pattern
        getMatcherWithPattern("(?i)number","NUMBER");

    }

    private static void getMatcherWithPattern(String patternWantToSearch, String stringWantToSearch) {
        try {
            Pattern pattern = Pattern.compile(patternWantToSearch); //regex, literal string want to search, any letter from letter a, b,c ... p
            findPattern(pattern.matcher(stringWantToSearch), stringWantToSearch);
        }
        catch(Exception e){
            String output = String.format("no match found \"%s\" in the text \"%s\"",patternWantToSearch,stringWantToSearch);
            System.out.println(output);
            System.out.println("error in getMatcher");
        }


    }

    private static void findPattern(Matcher matcher, String stringWantToSearch)  {
        try {
            matcher.find();

            String output = String.format("" + "found the text \"%s\" in the text \"%s\" beginning at  " + " index %d and ending at index %d.%n", matcher.group(), stringWantToSearch, matcher.start(), matcher.end());
            System.out.println(output);
        }
        catch (IllegalStateException e){
            String output = String.format(" in findPattern no match found \"%s\" in the text \"%s\"",matcher.group(),stringWantToSearch);
            System.out.println(output);
            System.out.println("no match found error in findPattern");


        }
    }
}
