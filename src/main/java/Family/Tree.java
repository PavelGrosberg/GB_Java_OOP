package Family;

public abstract class Tree {
    String relation;
    private String name;
    private Integer age;

    public Tree(String relation, String name, Integer age) {
        this.relation = relation;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
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


    public void print() {
        System.out.printf("%s (%d) \n", name, age);
    }
}
