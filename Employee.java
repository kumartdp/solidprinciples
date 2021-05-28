package solidprinciplesincluded;

public class Employee {

    int salary;
    int bonus;
    int experience;
    Ionboarding instance;
    public void eonboarding(Ionboarding obj, String name)
    {
        instance=obj;
        instance.onboard(name);
    }
    public void responsibility()
    {
        System.out.println("employee");

    }

}
