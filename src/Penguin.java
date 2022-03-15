public class Penguin extends Bird
{
    private int amtFishAte;
    public Penguin(String name, double weight,int amtFishAte) {
        super(name, weight);
        this.amtFishAte=amtFishAte;
    }

    public void swam()
    {
        System.out.println("The penguin swam!");
    }
}
