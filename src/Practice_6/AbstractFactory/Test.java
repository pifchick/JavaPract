package Practice_6.AbstractFactory;

public class Test {
    public static void main(String[] args) {
        penClock nicaClock = new NicaClock();
        penClock.createMechanicClock();
        penClock.createQuartzClock();
    }
}
