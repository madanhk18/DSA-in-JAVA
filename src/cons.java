class stud{
    int rol;
    String nam;
    float mark;

    stud(int rol, String nam, float mark)
    {
        this.rol=rol;
        this.nam=nam;
        this.mark=mark;
    }
    stud(int roll , String n, int mrks )
    {
        rol=roll;
        nam=n;
    }
    stud()
    {
        this(44,"Bruno",3);
    }
}

public class cons {
    public static void main (String args []){
        stud maddy =new stud(75 , "Madan",97);
        stud manoj=new stud(77 , " manoj",6);
        stud gp = new stud();
//        System.out.println("My name is "+ maddy.nam + " Having a roll number of "+ maddy.rol + " Of marks "+ maddy.mark );
//        System.out.println("My name is "+ manoj.nam + " Having a roll number of "+ manoj.rol );
        System.out.println(gp.nam);

    }
}
