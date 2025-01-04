package Enum.Weekday_Weekend;
public class Weekday_Weekend {
    public static void Daycheck(Day day)
    {
        switch(day)
        {
            case Saturday:
            case Sunday:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Weekday");
        }
    }
    public static void main(String[] args) {
        Daycheck(Day.Sunday);
        Daycheck(Day.Thursday);
    }
}
