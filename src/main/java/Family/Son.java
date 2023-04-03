package Family;

public class Son extends Tree {
    public Son(String relation, String name, Integer age) {
        super(relation, name, age);
    }

    @Override
    public void greeting() {
        System.out.println("Привет, я сын");
    }
}
