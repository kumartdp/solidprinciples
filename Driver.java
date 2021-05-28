package solidprinciplesincluded;


import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args)
    {
        Employee dev=new Developer();
        dev.responsibility();
        Employee man=new Manager();
        man.responsibility();
        Ionboarding o=new Onboarding();

        ArrayList<Bonus> l1=new ArrayList<Bonus>();
        Tester e1=new Tester();
        Fullstackdev e2=new Fullstackdev(5);
        l1.add(e1);
        l1.add(e2);

        ArrayList<Fixedcompensation> l2=new ArrayList<Fixedcompensation>();
        Temporarydev e3=new Temporarydev();
        l2.add(e3);
        for (Bonus obj:l1)
        {
            obj.salary();
            obj.bonus();


        }
        for (Fixedcompensation obj1:l2)
        {
            obj1.salary();


        }
        e1.projectdev();
        dev.eonboarding(o,"Sai");
        man.eonboarding(o,"kumar");














    }
}
