package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (isLeapYear(year) && month == 2) {
            System.out.println(29);
        } else {
            amountOfDays(month, year);
        }
    }

    private boolean isLeapYear(int year) {
        if (
                (year % 400 == 0 && year % 100 == 0) ||
                        (year % 4 == 0 && year % 100 != 0)
        ) {
            return true;
        } else {
            return false;
        }
    }

    private void amountOfDays(int month, int year) {
        if (month < 1 || month > 12) {
            System.out.println("wrong number!");
        }

        if (month == 2) {
            System.out.println(28);
        }

        if (month == 2 && isLeapYear(year)) {
            System.out.println(29);
        }

        if (((month >= 1 && month <= 7) && month % 2 != 0) ||
                (month >= 8 && month <= 12) && month % 2 == 0) {
            System.out.println(31);
        }

        if ((month >= 4 && month <= 6) && month % 2 == 0) {
            System.out.println(30);
        }

    }
}
