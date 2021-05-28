package solidprinciplesincluded;

public class Tester extends Developer implements Bonus, Projectdevelopment
{
    Tester()
    {
        System.out.println("tester extended from developer");
    }

    public void salary()
    {
        System.out.println("tester awarded salary 5000");

    }
    public void bonus()
    {
        System.out.println("tester awarded bonus 500");


    }
    public void projectdev()
    {
        System.out.println("project  development");

    }
}

