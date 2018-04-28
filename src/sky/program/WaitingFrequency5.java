package sky.program;

public interface WaitingFrequency5
{
    public Schedulable5 hour();

    public WaitingFrequency5 hourAnd(int i);

    public Schedulable5 minute();

    public WaitingFrequency5 minuteAnd(int i);

    public Schedulable5 second();
}
