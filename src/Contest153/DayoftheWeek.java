package Contest153;

public class DayoftheWeek {
    public String dayOfTheWeek(int day, int month, int year) {
        int total = 0;
        int extra = (year - 1971 + 2)/4;
        total += extra * 366 + (year - 1971 - extra) * 365;
        int[] k1 = new int[12];
        k1[0] = 31;
        if (year % 4 == 0 && year != 2100) {
            k1[1] = 29;
        } else {
            k1[1] = 28;
        }
        k1[2] = 31;
        k1[3] = 30;
        k1[4] = 31;
        k1[5] = 30;
        k1[6] = 31;
        k1[7] = 31;
        k1[8] = 30;
        k1[9] = 31;
        k1[10] = 30;
        k1[11] = 31;
        for(int i = 0; i < month - 1; i++) {
            total += k1[i];
        }
        total += day - 1;
        int particular = total % 7;
        String theDay;
        if (particular == 0) {
            theDay = "Friday";
        } else if (particular == 1) {
            theDay = "Saturday";
        } else if (particular == 2) {
            theDay = "Sunday";
        }else if (particular == 3) {
            theDay = "Monday";
        }else if (particular == 4) {
            theDay = "Tuesday";
        }else if (particular == 5) {
            theDay = "Wednesday";
        }else {
            theDay = "Thursday";
        }
        return theDay;
    }
}
