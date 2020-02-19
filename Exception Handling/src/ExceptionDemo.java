public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Start the process");
        try {
            int number = Integer.parseInt(args[0]); // args[0] is command line input from user
            // Integer.parseInt() is used to typecast string into integer
            System.out.println("Value Accepted from User");
            int result = 10/(10-number);
            System.out.println("The result is : "+result);
            String message = "Good Morning"; // Output
            message = null;
            System.out.println("The message length" +message.length()); // Returns length of the string
            System.out.println("End of Process");
        }
        // Instead of writing so many catch blocks//
        // Use pipe "|" operator to input multiple exceptions in one catch statement
        catch (ArithmeticException | NullPointerException| ArrayIndexOutOfBoundsException| NumberFormatException ex) {
            System.out.println(ex.getMessage()); //.getMessage() will get message from respective exception block
        }
        finally {
            System.out.println("It will always execute");
        }
        /*catch (NumberFormatException ex)
        {
            System.out.println("Please enter a number");
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Enter at least one number");
        }
        catch (NullPointerException ex){
            System.out.println("The object is Null");
        }
        catch (Exception ex) {
            System.out.println("Check your cod3e");
        }

         */
    }
}
