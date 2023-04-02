package Family;

public abstract class Tree {
    String relation;
    String name;
    Integer age;

    public Tree(String relation, String name, Integer age) {
        this.relation = relation;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Семья {" +
                "кем приходится: '" + relation + '\'' +
                ", имя '" + name + '\'' +
                ", возраст " + age +
                '}';
    }

    public abstract void greeting();
}
