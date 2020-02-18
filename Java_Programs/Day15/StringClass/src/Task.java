public class Task {
        public static boolean isTitleCase(String s) {
            boolean result = false;
            String arr[] = s.split("\\s+");
            for (int i = 0; i < arr.length; i++) {
                char ch = arr[i].charAt(0);
                if (ch >= 65 && ch < 90) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
            return result;
        }

    public static void main(String[] args) {
        String str = "Global Warming";
        // Part A -  display the last four characters
        String lastFourDigits = "";     //substring containing last 4 characters
        if (str.length() > 4)
        {
            lastFourDigits = str.substring(str.length() - 4);
        }
        else
        {
            lastFourDigits = str;
        }
        System.out.println(lastFourDigits);
        // Part B - display the substring starting from index 4 and ending at index 8
        String subs = str.substring(4, 8);
        System.out.println(subs);
        // Part C - check whether string has alphanumeric characters or not
        boolean isAlphaNumeric = (str != null) &&
                str.chars().allMatch(Character::isLetterOrDigit);
        System.out.println(isAlphaNumeric);
        //System.out.println(str.matches("[a-zA-Z0-9]+"));
        // Part D - trim the last four characters from the string
        int len = str.length();
        String trimf4 = str.substring(len-4);
        System.out.println(trimf4);
        // Part E- trim the first four characters from the string.
        String trimmed4space = str.substring(0,4);
        System.out.println(trimmed4space);
        // Part F - display the starting index for the substring "Wa"
        System.out.println(str.indexOf('W'));
        // Part G - change the case of the given string.
        System.out.println(str.toUpperCase());
        // Part H - check if the string is in title case
        char result = str.charAt(0);
        if (result>=65&&result<=90)
        {
            System.out.println("true");
        }
        // Alternative Method
        //String str = 'Global Warming';
        boolean b = isTitleCase(str);
        System.out.println(b);


        // Part I - replace all the occurrences of letter "a" in the string with "*"
        String rplace = str.replace('a','*');
        System.out.println(rplace);
    }
}
