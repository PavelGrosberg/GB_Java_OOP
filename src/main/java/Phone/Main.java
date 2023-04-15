package Phone;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        ArrayList<Phone> listPhone = new ArrayList<>();
        shop.create(listPhone);

        for (Phone temp: listPhone) {
            System.out.println(temp.toString());
        }
        System.out.println("----------------------------------------------------------------------------------------");
        shop.sell(listPhone);

        for (Phone temp: listPhone) {
            System.out.println(temp.toString());
        }
    }
}
