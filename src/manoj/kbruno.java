package manoj;
class invisible
{
    int y;
    invisible(int year)
    {
        y=year;
    }
    void tell()
    {
        System.out.println("The year is "+ y);
    }
}
public class kbruno {
    public static void main(String[] args) {
        invisible i=new invisible(45);
        i.tell();
    }
}
