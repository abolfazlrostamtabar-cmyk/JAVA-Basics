import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year, month, day;

        System.out.print("Enter year: ");
        year = input.nextInt();
        System.out.print("Enter month: ");
        month = input.nextInt();
        System.out.print("Enter day: ");
        day = input.nextInt();

        boolean leap = isLeapYear(year);
        System.out.println("Leap year = " + leap);

        int daysInThisMonth = daysInMonth(month, year);
        System.out.println("Days in month = " + daysInThisMonth);

        int dayInYear = dayOfYear(day, month, year);
        System.out.println("Day in year = " + dayInYear);

        input.close();
    }

    public static boolean isLeapYear(int year) {
       
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    
    public static int daysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 0; 
        }
    }

    
    public static int dayOfYear(int day, int month, int year) {
        int totalDays = 0;
        for (int i = 1; i < month; i++) {
            totalDays += daysInMonth(i, year);
        }
        totalDays += day;
        return totalDays;
    }
}
