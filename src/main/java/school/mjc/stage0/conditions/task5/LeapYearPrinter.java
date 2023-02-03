package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        boolean b = (( year % 4 == 0 ) && ( year % 100 != 0 ) ) || ( year % 400 == 0 );
        if (b) {
            System.out.println("leap");
        } else {
            System.out.println("not leap");
        }
    }
}
