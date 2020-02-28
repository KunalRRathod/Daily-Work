
public class Calculator_with_Lambda {

	public static void main(String[] args) {
		// Calculator calls
		Add add = (a,b) -> a+b;
		Subtract subtract = (a,b) -> a-b;
		Multiply multiply = (a,b) -> a*b;
		Divide divide = (a,b) -> a/b;
		System.out.println(add.add(5,6));
		System.out.println(subtract.subtract(5,6));
		System.out.println(multiply.multiply(5,6));
		System.out.println(divide.divide(7, 9));

	}

}
@FunctionalInterface
interface Add {
	double add(double a, double b);
}
interface Subtract {
	double subtract(double a, double b);
}
interface Multiply {
	double multiply(double a, double b);
}
interface Divide {
	double divide(double a, double b);
}
