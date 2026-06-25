public class multipleswitchcase {
    public static void main(String[] args) {
        String day = "Monday";
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("weekdays");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("weekend");
                break;
            default:
                System.out.println("Invalid day");

        }
    }

}
