package mobilePhone;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contact> myContacts;
    private String myNumber;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }
    public boolean addNewContact(Contact contact){
        if(null == contact || null == contact.getName() || null == contact.getPhoneNumber())
            return false;
        if(myContacts.contains(contact)){
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldcontact, Contact newcontact){
        if(null == oldcontact || null == oldcontact.getName() || null == oldcontact.getPhoneNumber())
            return false;
        if(myContacts.contains(oldcontact)){
            myContacts.set(myContacts.indexOf(oldcontact),newcontact);
            return true;

        }
        return false;
    }
    public boolean removeContact(Contact contact){
        if(myContacts.contains(contact)){
            myContacts.remove(contact);
            return true;
        }

        return false;
    }

    public int findContact(Contact contact) {
            return myContacts.indexOf(contact);

    }
    public int findContact(String contactName) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equalsIgnoreCase(contactName)) {
                return i;
            }
        }
        return -1;
    }
    public Contact queryContact(String contactName) {
        int index = findContact(contactName);
        if (index >= 0) {
            return myContacts.get(index);
        }
        return null;
    }
    public void printContacts() {
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            System.out.println((i + 1) + "->" + contact.getName() + "->" + contact.getPhoneNumber());
        }
    }
}
