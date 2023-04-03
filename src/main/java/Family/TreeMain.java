package Family;

public class TreeMain {
    public static void main(String[] args) {
        Son son = new Son("сын", "Павел", 33);
        System.out.println(son.toString());
        son.greeting();
        Mother mom = new Mother("мать", "Лиля", 60);
        System.out.println(mom.toString());
        mom.greeting();

    }
}
