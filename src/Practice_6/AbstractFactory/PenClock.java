package Practice_6.AbstractFactory;

public class PenClock implements ClockFactory{
    public NicaClock(){
        System.out.println("Фабрика часов Пена");
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
