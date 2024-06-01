package madan;

public class subclass extends mClass{
    int weight;
    public subclass(int number, String name,int weight) {
        super(number, name);
        this.weight=weight;
    }
    public void printt()
    {
        System.out.println("This is in the Sub class");
    }
}
