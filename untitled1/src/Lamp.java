public class Lamp {
    private int power;

    Lamp(int power)
    {
        this.power=power;
    }

    public void switchPower() {
        if(power==0)
    {
        System.out.println("Your power is turn off");
    }

        if(power>0)
    {
        System.out.println("Your lamp is turn on");
    }
}

}
