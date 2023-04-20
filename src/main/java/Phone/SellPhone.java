package Phone;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class SellPhone implements IntSellPhone {
    public static ArrayList<Phone> sell(ArrayList<Phone> listPhone) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Какой телефон купили: ");
        String buyPhone = sc.next();
        sc.close();
        ArrayList<Phone> temp = new ArrayList<>();
        for (Phone phone : listPhone) {
            if (!buyPhone.equals(phone.getNameFactory())) {
                temp.add(phone);
            }
        }
        listPhone.clear();
        listPhone.addAll(temp);
        return listPhone;
    }
}