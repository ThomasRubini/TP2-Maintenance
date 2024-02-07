package org.example;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private List<Address> addresses = new ArrayList<Address>();

    public Client(Address addressA) {

    }

    public Client() {
        //To change body of created methods use File | Settings | File Templates.
    }

    public void addAddress(Address address) {
        addresses.add(address);
    }

    public List<Address> getAddresses() {
        return addresses;
    }
}