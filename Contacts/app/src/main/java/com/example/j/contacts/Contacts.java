package com.example.j.tp2_adapteur;

import java.util.ArrayList;

/**
 * Created by J on 03/02/2016.
 */
public class Contacts {
    private ArrayList<Contact> contacts;
    private static Contacts ourInstance = new Contacts();

    public static Contacts getInstance() {
        return ourInstance;
    }

    private Contacts() {
        contacts = new ArrayList<>();
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void add(Contact contact){
        contacts.add(contact);
    }
}
