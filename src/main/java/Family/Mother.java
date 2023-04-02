package Family;

public class Mother extends Tree {
    public Mother(String relation, String name, Integer age) {
        super(relation, name, age);
    }

    @Override
    public void greeting() {
        System.out.println("Привет, я мама");
    }
}
