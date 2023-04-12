package Family;

import java.time.Year;

public class Diff<T extends Number, V extends Number> {

    T diffAge;
    V diffAge2;

    public Diff(T diffAge, V diffAge2) {
        this.diffAge = diffAge;
        this.diffAge2 = diffAge2;
    }

    Integer getDiff() {
        return diffAge.intValue() - diffAge2.intValue();
    }

    public void getDate() {
        int year = Year.now().getValue();
        int momBD = year - diffAge.intValue();
        int sonBD = year - diffAge2.intValue();
        System.out.println("Мама родилась в " + momBD + " году");
        System.out.println("Сын родился в " + sonBD + " году");
    }
}
