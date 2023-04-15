package Phone;

import java.util.ArrayList;

public interface SellPhone {

    ArrayList<Phone> create(ArrayList<Phone> listTelefon);
    ArrayList<Phone> sell(ArrayList<Phone> listTelefon);
    ArrayList<Phone> addPhone(ArrayList<Phone> listTelefon);
}