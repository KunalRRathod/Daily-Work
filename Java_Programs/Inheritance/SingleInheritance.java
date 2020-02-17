class A
{
  void show ()
    { 
         System.out.println("Hello from A");
     }
  }
class B extends A
  {
    void display ()
     {
        System.out.println ("Hello from B");
      }
   }   
class SingleInheritance
{
 public static void main (String args [])
   {
      a1=new A();
      b1=new B();
      a1.show();
      b1.show();
      b1.display();
    }
  }