package Phone;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop implements SellPhone {

    private ArrayList<Phone> listPhone;

    @Override
    public ArrayList<Phone> create(ArrayList<Phone> listPhone) {

        Phone nokia = new Phone("Nokia", "3310", 6.14, 4500, "Android", 12000);
        Phone samsung = new Phone("Samsung", "5460", 5.5, 3000, "Android", 22000);
        Phone apple = new Phone("Apple", "13Pro", 6.14, 2500, "iOS", 100000);
        Phone oppo = new Phone("Oppo", "120+", 5.45, 6000, "Android", 54000);

        listPhone.add(nokia);
        listPhone.add(samsung);
        listPhone.add(apple);
        listPhone.add(oppo);

        return listPhone;
    }

    @Override
    public ArrayList<Phone> sell(ArrayList<Phone> listPhone) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Какой телефон купили: ");
        String buyPhone = sc.next();
        sc.close();

        ArrayList<Phone> templist = new ArrayList<>();

        for (Phone phone: listPhone){
            if (!buyPhone.equals(phone.getNameFactory())){
                templist.add(phone);
            }
        }
        listPhone.clear();
        listPhone.addAll(templist);
        return listPhone;
    }

    @Override
    public ArrayList<Phone> addPhone(ArrayList<Phone> listPhone) {

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



        return null;
    }


}