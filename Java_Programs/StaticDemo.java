public class StaticDemo{
    int x = 10;
    static int y = 20;
    public void show()
    {
        System.out.println(y);
        System.out.println(x);
    }
}
class Staticvar {
    public static void main(String[] args) {
        StaticDemo d = new StaticDemo();
        System.out.println(d.x);
        System.out.println(StaticDemo.y);
        StaticDemo d1 = new StaticDemo();
        StaticDemo d2 = new StaticDemo();
        System.out.println(d.y);
        d1.x = 50;
        d2.y = 30;
        System.out.println(d1.x);
        System.out.println(d2.y);
    }
}