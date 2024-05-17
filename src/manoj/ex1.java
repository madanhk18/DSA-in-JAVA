package manoj;
public class ex1 {
    int age;
    String name;
    float salar;
     static long population;

     ex1(int age, String name, float salar )
    {
        this.age = age;
        this.name = name;
        this.salar = salar;
        ex1.population +=1;
    }
}
