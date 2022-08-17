public class Planet {
    String name;
    int daysToOrbit;
    double gravity;
    double au;

    public Planet(String name, int daysToOrbit, double gravity, double au) {
        this.name = name;
        this.daysToOrbit = daysToOrbit;
        this.gravity = gravity;
        this.au = au;
    }

    public String getName(){
        return name;
    }

    public int getDaysToOrbit(){
        return daysToOrbit;
    }

    public double getGravity(){
        return gravity;
    }

    public double getAu(){
        return au;
    }
}
