public class Flamingo extends Bird
{
    private int amtShrimpAte;

    public Flamingo(String name, double weight,int amtShrimpAte) {
        super(name, weight);
        this.amtShrimpAte=amtShrimpAte;
    }

    public void flew()
    {
        System.out.println("The flamingo flew!");
    }
}
