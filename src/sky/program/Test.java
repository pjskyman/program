package sky.program;

public class Test
{
    public static void main(String[] args)
    {
        Program.every(3).second().doThis(()->ceci());//1
        Program.at(20).hourAnd(38).minute().doThis(()->ceci());//2
        Program.at(20).hourAnd(38).minute().doThis(()->ceci())//2+3
                .andAt(21).hourAnd(17).minute().doThis(()->cela());
        Program.at(20).hourAnd(38).minute().doThis(()->ceci())//2+4
                .andAfter(38).minuteAnd(31).second().doThis(()->cela());
        Program.at(20).hourAnd(38).minute().doThis(()->ceci())//2+5
                .every(5).minuteAnd(46).second();
        Program.at(20).hourAnd(38).minute().doThis(()->ceci())//2+5+6
                .every(5).minuteAnd(46).second()
                .until(21).hourAnd(56).minute();
    }

    private static void ceci()
    {
    }

    private static void cela()
    {
    }
}
