
public class Person {
	String name, address;
	int age;
	
	Person(String name, String address, int age){
		this.name = name;
		this.address = address;
		this.age = age;
		
	}
	 void display() {
		 System.out.println("name \t"+name+"address"+address+"age"+age);
	 }

}
