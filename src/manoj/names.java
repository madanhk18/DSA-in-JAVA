package manoj;

public class names {
    static class a {
        static String name;

        public a(String name) {
            a.name = name;
        }
    }


    public static void main(String[] args) {
        a obj =new a("manoj");
        a obj1 =new a("madan");
        System.out.println(obj.name);
        System.out.println(obj1.name);

    }
}
