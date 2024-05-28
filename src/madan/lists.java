package madan;

import java.util.ArrayList;
import java.util.List;

public class lists {
    public static void main(String[] args) {
        List<Integer> StudName = new ArrayList<>();
        StudName.add(11);
        StudName.add(22);
        StudName.add(33);
        StudName.add(44);

        System.out.println(StudName);
       StudName.add(55);
        System.out.println(StudName);


    List<Integer> StudRN=new ArrayList<>();
    StudRN.add(1);
        StudRN.add(0,2);
        StudRN.add(03);
        StudRN.add(04);
        StudRN.add(05);
        StudName.addAll(StudRN);
        System.out.println(StudName);
        System.out.println(StudName.get(3));



    }
}
