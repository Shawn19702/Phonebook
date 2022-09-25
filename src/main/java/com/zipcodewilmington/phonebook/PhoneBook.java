package com.zipcodewilmington.phonebook;

import java.util.*;
//import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {

    private final Map<String, List<String>> phonebook;

    public PhoneBook(Map<String, List<String>> map) {
        this.phonebook = new HashMap<String, List<String>>(map);
    }

    public PhoneBook() {
        this.phonebook = new HashMap<String, List<String>>();
    }

    public void add(String name, String phoneNumber) {
        this.phonebook.put(name, new ArrayList<String>(Arrays.asList(phoneNumber)));
    }

    public void addAll(String name, String... phoneNumbers) {
        this.phonebook.put(name, Arrays.asList(phoneNumbers));

    }

    public void remove(String name) {
        this.phonebook.remove(name);
    }

    public Boolean hasEntry(String name, String phoneNumber) {
        if (phonebook.containsKey(name)) {
            return true;
        }
        return false;
    }


    public List<String> lookup(String name) {
        return this.phonebook.get(name);
    }

    public String reverseLookup(String phoneNumber) {

        for (Map.Entry<String, List<String>> entry : phonebook.entrySet()) {
            if (entry.getValue().contains(phoneNumber)) {
                return entry.getKey();
            }
        }
        return "";
    }

    public List<String> getAllContactNames() {
        ArrayList<String> allNames = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : phonebook.entrySet()) {
        }
        return allNames;
    }

    public Map<String, List<String>> getMap() {
        return this.phonebook;

    }
}


