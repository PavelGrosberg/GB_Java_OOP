package Family;
import java.util.function.Function;
public class Son extends Tree {
    public Son(String relation, String name, Integer age) {
        super(relation, name, age);
    }

    @Override
    public void greeting() {
        System.out.println("Привет, я сын");
    }

    public static void howOld() {
        Function<Integer, String> func1 = (x) -> ("Мне " + String.valueOf(x) + " года");
        System.out.println(func1.apply(33));
    }
}
