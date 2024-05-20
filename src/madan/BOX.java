package madan;

class box_peri{
    double length;
    double bredth;
    double weight;
    double height;

    public box_peri(double length, double bredth, double weight,double height) {
        this.length = length;
        this.bredth = bredth;
        this.weight = weight;
        this.height = height;
    }
}
 class boxx extends box_peri {
    double perimeter;

    public boxx(double length, double bredth, double weight, double height,double perimeter) {
        super(length,bredth,weight,height);
        this.perimeter = perimeter;
    }
}

public class BOX{
    public static void main(String[] args) {
        box_peri obj =new box_peri(3,5,6,7);
        box_peri obj2 = new boxx(2,4,5,6,7);
        System.out.println(obj.height);
        System.out.println(obj2.length);

    }
}
