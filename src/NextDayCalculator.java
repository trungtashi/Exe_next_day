public class NextDayCalculator {

    public static final String CONCATENATION = "/";
    public static final String FIRSTOFMONTH = "1";

    public static String getNextDay(int dayTest, int monthTest, int yearTest) {
        String result;
        int lastOfMonth = getLastOfMonth(monthTest);
        if (dayTest== lastOfMonth){
            result = FIRSTOFMONTH + CONCATENATION + (++monthTest) + CONCATENATION + yearTest;
        }
        else {
            result = ++dayTest + CONCATENATION + monthTest + CONCATENATION + yearTest;
        }
        return result;
    }

    private static int getLastOfMonth(int monthTest) {
        int lastOfMonth =0;
        switch (monthTest){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                lastOfMonth=31;
                break;
            default:
                lastOfMonth=30;

        }
        return lastOfMonth;
    }
}
