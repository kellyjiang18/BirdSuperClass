public class Bird
{
    private String name;
    private double weight;

    public Bird(String name,double weight)
    {
        this.name=name;
        this.weight=weight;
    }

    public void ate()
    {
        System.out.println("The bird was fed");
    }
}
