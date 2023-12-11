public class Airplane extends Transport{

    private int capacity;
    private int speed;

    public Airplane(String type, int capacity, int speed) {
        super(type);
        this.capacity = capacity;
        this.speed = speed;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public boolean print() {
        System.out.println("Where is it moving: " + getType() +"    "+ "Passengers: "+ capacity+
                "    "+ "Speed: "+ speed);
        return false;
    }
}
