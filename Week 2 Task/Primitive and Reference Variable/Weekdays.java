class Main {
    public enum DaysOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }

    public static void main(String[] args) {
        DaysOfWeek day = DaysOfWeek.SUNDAY;

        if (isHoliday(day)) {
            System.out.println(day + " is a Holiday");
        } else {
            System.out.println(day + " is Not a Holiday");
        }
    }

    public static boolean isHoliday(DaysOfWeek day) {
        return day == DaysOfWeek.SATURDAY || day == DaysOfWeek.SUNDAY;
    }
}
