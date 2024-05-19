package manoj;

public class ex2 {
    public static void main(String[] args) {
        ex1 one = new ex1(4,"Bruno",10000);
        ex1 two = new ex1(4,"Bruno",10000);
        ex1 three = new ex1(4,"Bruno",10900);

        System.out.println(ex1.population);
        greeting();
    }
    static void greeting()
    {
        System.out.println("Hi madan h k");
    }
}
