package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (month == 2) {
            if (isLeapYear(year) == true) {
                System.out.println(29);
            } else System.out.println(28);
        } else {
            amountOfDays(month);
        }

    }

    public boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 > 0) {
                return true;
            } else if (year % 400 == 0) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }
    }

    public void amountOfDays(int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(31);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30);
                break;
            default:
                System.out.println("invalid date");

        }
    }
}
