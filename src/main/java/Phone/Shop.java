package Phone;

import java.util.ArrayList;

public class Shop implements IntCreatePhone {

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
}
