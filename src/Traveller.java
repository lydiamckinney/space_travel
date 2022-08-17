import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Traveller {
    private final String birthdate;
    private final int currentWeight;
    private final Planet planet;

public Traveller(String birthdate, int weight, Planet planet){
    this.birthdate = birthdate;
    this.currentWeight = weight;
    this.planet = planet;
}

public String getBirthdate(){
    return this.birthdate;
}

public int currentWeight(){
    return this.currentWeight;
}

public double getNewWeight(){
   return (double)(currentWeight * this.planet.getGravity());
}

public double getNewAge(){
    LocalDate age = LocalDate.parse(birthdate);
    LocalDate today = LocalDate.now();
    long numDays = ChronoUnit.DAYS.between(age, today);
    return (double) numDays / this.planet.getDaysToOrbit();
    }

public void output(){
    System.out.format("You have travelled " + this.planet.getAu() + " astronomical units to reach your destination. \n" +
    "You are now " + getNewAge() + " years old and weigh " + getNewWeight() + " pounds.");
    }
}
