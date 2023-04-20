package Phone;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class AddPhone implements IntAddPhone {
    public static ArrayList<Phone> addPhone(ArrayList<Phone> listPhone) {
        ArrayList<Phone> temp = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название производителя: ");
        String factory = sc.next();
        System.out.println("Введите модель телефона: ");
        String model = sc.next();
        System.out.println("Введите размер экрана");
        double size = sc.nextDouble();
        System.out.println("Введите емкость батареи: ");
        int quantity = sc.nextInt();
        System.out.println("Введите тип операцонной системы: ");
        String os = sc.next();
        System.out.println("Введите цену телефона: ");
        double price = sc.nextDouble();
        sc.close();
        return listPhone;
    }
}
