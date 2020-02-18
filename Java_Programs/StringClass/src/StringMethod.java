public class StringMethod {
    public static void main(String[] args) {
        String str = "I am an engineer ";
        String msg = "of 2019";
        // Since sting is immutable so we cannot manipulate a string directly
        // so we create a new string and save it in an another variable called sg
        String sg = str.concat(msg); // concataenation of two strings
        String subs = sg.substring(3, 10); // creates substring of the given string class
        //String charpos = sg.charAt();
        System.out.println(sg);
        System.out.println(subs);
    }
}
