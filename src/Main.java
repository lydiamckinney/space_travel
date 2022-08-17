import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Planet earth = new Planet("Earth", 1, 1, 1);
        Planet mercury = new Planet("Mercury", 88, 0.38, .61);
        Planet venus = new Planet("Venus", 225, 0.91, .28);
        Planet mars = new Planet("Mars", 687, 0.38, .52);
        Planet jupiter = new Planet("Jupiter", 4307, 2.34, 4.2);
        Planet saturn = new Planet("Saturn", 10731, 1.06, 8.52);
        Planet uranus = new Planet("Uranus", 30660, 0.92, 18.21);
        Planet neptune = new Planet("Neptune", 59860, 1.19, 29.09);
        Planet pluto = new Planet("Pluto", 90520, 0.06, 40);

        Planet[] planets = {earth, mercury, venus, mars, jupiter, saturn, uranus, neptune, pluto};

        System.out.println("*----- Welcome to Space Travel -----*");

        while (true) { System.out.println("Where would you like to travel to? Please enter the number.\n" + 
            "1. Mercury\n" +
            "2. Venus\n" +
            "3. Mars\n" +
            "4. Jupiter\n" +
            "5. Saturn\n" +
            "6. Uranus\n" +
            "7. Neptune\n" +
            "8. Pluto\n");

            int planetChoice = scanner.nextInt();

            System.out.println();

            System.out.println("Enter your birthdate (YEAR-MM-DD):");
            String birthdate = scanner.next();
        
            System.out.println("Enter your weight (in LBS):");
            int weight = scanner.nextInt();

            System.out.println();

            Traveller traveller = new Traveller(birthdate, weight, planets[planetChoice]);
            traveller.output();

            System.out.println();

            System.out.println("Would you like to travel to another planet? (y/n)");
            String travel = scanner.next().toLowerCase();

            System.out.println();

            if (travel.equals("n")) {
                System.out.println("Goodbye!");
                break;
            }
        }
        scanner.close();
    }
}
