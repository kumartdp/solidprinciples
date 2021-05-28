package solidprinciplesincluded;

public class Fullstackdev extends Developer implements Bonus,Projectdevelopment {

    Fullstackdev(int experience)
    {

        System.out.println("fullstack developer extended from developer");
        salary=experience*1000;


    }

    public void salary()
    {
        System.out.println("full stackdev awarded salary "+this.salary);

    }
    public void bonus()
    {
        System.out.println("fullstackdev awarded bonus 1000");

    }
    public void projectdev()
    {
        System.out.println("project development");

    }
}
