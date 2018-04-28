package sky.program;

public interface Schedulable2 extends Schedulable
{
    public WaitingHourThenMinuteThenAction3 andAt(int i);

    public WaitingDurationThenAction4 andAfter(int i);

    public WaitingFrequency5 every(int i);
}
