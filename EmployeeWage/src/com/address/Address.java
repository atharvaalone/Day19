package com.address;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Address {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zip;
    private long phone;
    private String email;

    public Address(String firstName, String lastName, String address, String city, String state, int zip, long phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Address{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
}

class AddressBook {
    private List<Address> addressList = new ArrayList<>();
    ;


    public void addDetails(Address address) {
        addressList.add(address);
    }

    public void editDetails(int index, Address newAddress) {
//List<Address> list=new ArrayList<>();
        addressList.set(index, newAddress);


    }
public List<Address> delateDetails(Address address){

    Iterator<Address> iterator = addressList.iterator();
    while (iterator.hasNext()) {
        Address ad = iterator.next();
        if (ad.getFirstName().toLowerCase().equals("Olivia".toLowerCase())) {
            iterator.remove();
        }
    }
    return addressList;
}
    public List<Address> getAddressList() {
        return addressList;
    }

    public static void main(String[] args) {
        Address address1 = new Address("Atharva", "Alone", "bang", "jhgfd", "Maharashtra", 604, 9868665, "Jadu@ybl");

        Address address2 = new Address("John", "Doe", "123 Main St", "Apt 4B", "New York", 10001, 5551234, "john.doe@example.com");

        Address address3 = new Address("Emma", "Smith", "456 Oak Ave", "", "Los Angeles", 90001, 5555678, "emma.smith@example.com");

        Address address4 = new Address("Michael", "Johnson", "789 Elm Rd", "Unit 12", "Chicago", 60601, 5559876, "michael.johnson@example.com");

        Address address5 = new Address("Sophia", "Brown", "321 Maple Ln", "", "San Francisco", 94101, 5554321, "sophia.brown@example.com");

        Address address6 = new Address("Daniel", "Wilson", "987 Pine St", "Suite 3C", "Houston", 77001, 5558765, "daniel.wilson@example.com");
        //  Address address12 = new Address("Roshan","Kolar","mano","jwerd");
        AddressBook addressBook = new AddressBook();
        addressBook.addDetails(address1);
        addressBook.addDetails(address2);
        addressBook.addDetails(address3);
        addressBook.addDetails(address4);
        addressBook.addDetails(address5);
        addressBook.addDetails(address6);

        //  addressBook.addDetails(address12);
        List<Address> addressList1 = addressBook.getAddressList();
        for (Address ad : addressList1) {
            System.out.println(ad);
        }
        int indexToEdit = 0; // Index of the address to edit
        Address newAddress = new Address("Olivia", "Davis", "234 Cherry Ave", "", "Seattle", 98101, 5557890, "olivia.davis@example.com");
        addressBook.editDetails(indexToEdit, newAddress);
        System.out.println("Edited details");
        List<Address> addressList2 = addressBook.getAddressList();
        for (Address ad2 : addressList2) {
            System.out.println(ad2);
        }

        System.out.println("Delated using name");
        List<Address> addressList3=addressBook.delateDetails(address2);
        for (Address ad3:addressList3){
            System.out.println(ad3);
        }

    }
}