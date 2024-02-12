package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        boolean leap = false;

        // A year divisible by 4 is a leap year
        if (year % 4 == 0) {
            // It is a century year if the value is divisible by 100 with no remainder
            if (year % 100 == 0) {
                // A century year is a leap year only if it is divisible by 400
                if (year % 400 == 0)
                    leap = true;
            } else {
                leap = true;
            }
        }
        if (leap) {System.out.println("leap");}
        else  {System.out.println("not leap");}
    }
}
