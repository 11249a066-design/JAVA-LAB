
import java.util.GregorianCalendar;

class GregorianDemo {
    public static void main(String[] args) {
        GregorianCalendar g = new GregorianCalendar();

        System.out.println("Year: " + g.get(GregorianCalendar.YEAR));
        System.out.println("Month: " + (g.get(GregorianCalendar.MONTH) + 1));
        System.out.println("Day: " + g.get(GregorianCalendar.DAY_OF_MONTH));
        System.out.println("Hour: " + g.get(GregorianCalendar.HOUR_OF_DAY));
        System.out.println("Minute: " + g.get(GregorianCalendar.MINUTE));
    }
}
