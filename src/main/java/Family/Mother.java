package Family;

import java.util.function.Function;

public class Mother extends Tree {
    public Mother(String relation, String name, Integer age) {
        super(relation, name, age);
    }

    @Override
    public void greeting() {
        System.out.println("Привет, я мама");
    }

    public static void howOld() {
        Function<Integer, String> func1 = (x) -> ("Мне " + String.valueOf(x) + " лет");
        System.out.println(func1.apply(60));
    }
}
