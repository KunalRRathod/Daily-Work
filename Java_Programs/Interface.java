public interface Add  { 
    int add (int a, int b);
    default int multi(final a,b) //interface allows default methods
    {
        return a*b;
    }

    static int div(final int a, final int b)
}

interface sub extends Add {
    int sub(int a, int b);
}

class Div {
    public int Div(final int a, final int b) {
        return a / b;
    }
}

class implementation extends Div implements Subs {
    @Override
    public int add(final int a, final int b) {
        return a + b;
    }

    public int sub(int a, int b);

    {
        if (a > b)
            return a - b;
        else
            return b - a;
    }
}

class Testing1 {
    public static void main(final String[] args) {
        final Subs s = new implementation();
        System.out.println(s.add(3,9));
        System.out.println(s.sub(9,16));
        final implementation a = new implementation()
    }
}