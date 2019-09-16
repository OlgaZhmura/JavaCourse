package enm;

public class EnumExample {

    private final Day day;

    public EnumExample(Day day) {
        this.day = day;
    }

    public void tellItLikeItIs() {
        switch (day) {
            case MONDAY:
                System.out.println("Понедельник - это плохо :( .");
                break;

            case FRIDAY:
                System.out.println("Пятница - класс!");
                break;

            case SATURDAY:
            case SUNDAY:
                System.out.println("Выходные - урра!.");
                break;

            default:
                System.out.println("Работать, работать и еще раз работать!");
                break;
        }
    }

    public static void main(String[] args) {
        EnumExample firstDay = new EnumExample(Day.MONDAY);
        firstDay.tellItLikeItIs();

        EnumExample thirdDay = new EnumExample(Day.WEDNESDAY);
        thirdDay.tellItLikeItIs();

        EnumExample fifthDay = new EnumExample(Day.FRIDAY);
        fifthDay.tellItLikeItIs();

        EnumExample sixthDay = new EnumExample(Day.SATURDAY);
        sixthDay.tellItLikeItIs();

        EnumExample seventhDay = new EnumExample(Day.SUNDAY);
        seventhDay.tellItLikeItIs();
    }
}
