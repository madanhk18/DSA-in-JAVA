package manoj;

public class sta {
    static int a=7;
    static int b;

    static {
        System.out.println("I am gud");
        b=a*4;
    }

    public static void main(String[] args) {
        //sta obj =new sta();
        System.out.println(sta.a + " "+ sta.b);
    }
}
