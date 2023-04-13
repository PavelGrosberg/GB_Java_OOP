package Family;

public class TreeMain {
    public static void main(String[] args) {
        Son son = new Son("сын", "Павел", 33);
        System.out.println(son.toString());
        son.greeting();
        son.print();
        Son.howOld();
        Mother mom = new Mother("мать", "Лиля", 60);
        System.out.println(mom.toString());
        mom.greeting();
        mom.print();
        Mother.howOld();
        Diff diff = new Diff<>(mom.getAge(), son.getAge());
        System.out.println("У мамы с сыном разница в " + diff.getDiff() + " лет");
        diff.getDate();
    }
}
