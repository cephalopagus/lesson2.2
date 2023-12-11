
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Object object = createObject("Car");
        Object object2 = createObject("Airplane");
        Object object3 = createObject("Ship");

    }

    public static Object createObject (String className) {
        Scanner in = new Scanner(System.in);
        Printable[] printables = new Printable[3];
        switch (className){
            case "Car":
                System.out.print("Type: ");
                String tp = in.nextLine();

                System.out.print("Capacity: ");
                int cap = in.nextInt();

                System.out.print("Speed: ");
                int sp = in.nextInt();

                Car car = new Car(tp, cap, sp);
                printables[0] = car;
                break;
            case "Airplane":

                System.out.print("Type: ");
                String tp1 = in.nextLine();

                System.out.print("Capacity: ");
                int cap1 = in.nextInt();

                System.out.print("Speed: ");
                int sp1 = in.nextInt();

                Airplane airplane = new Airplane(tp1, cap1, sp1);
                printables[1] = airplane;
                break;
            case "Ship":

                System.out.print("Type: ");
                String tp2 = in.nextLine();

                System.out.print("Capacity: ");
                int cap2 = in.nextInt();

                System.out.print("Speed: ");
                int sp2 = in.nextInt();

                Ship ship = new Ship(tp2, cap2, sp2);
                printables[2] = ship;
                break;

        }

        for (int i = 0; i < printables.length; i++) {
            System.out.println(
                    ((Transport) printables[i]).print());
        }
        return null;
    }

}