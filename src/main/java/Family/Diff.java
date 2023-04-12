package Family;

public class Diff<T extends Number, V extends Number> {

    T diffAge;
    V diffAge1;

    public Diff(T diffAge, V diffAge1) {
        this.diffAge = diffAge;
        this.diffAge1 = diffAge1;
    }

    Integer getDiff() {
        return diffAge.intValue() - diffAge1.intValue();
    }
}

