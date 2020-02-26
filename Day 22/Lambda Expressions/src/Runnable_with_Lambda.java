
public class Runnable_with_Lambda {

	public static void main(String[] args) {
		// Lambda Expression
		// Can be applied only functional method with maximum one abstract method
//		Runnable r = () -> System.out.println("Hello Runnable");
//		Thread t = new Thread(r);
//		t.start();
		
		Hello h = () -> "Good Morning";
		System.out.println(h.greetings());

	}

}

@FunctionalInterface
interface Hello  // this method returns nothing thus we can use lambda expressions here
{
	String greetings();
	//public void display(); // wont run as it is not abstract
		
	}
