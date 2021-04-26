package Practice_6.AbstractFactory;

public class NicaClock implements ClockFactory{
    public NicaClock(){
        System.out.println("Фабрика часов Пейна");
    }

    @Override
    public Clock createMechanicClock() {
        return new MechClock();
    }

    @Override
    public Clock createQuartzClock() {
        return new QuartzClock();
    }
}
