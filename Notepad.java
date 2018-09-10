package com.epam.mentoring.devices;

import java.util.HashMap;


public class Notepad implements Battery {
    private int batteryCharge;


    public void setBatteryCharge(int batteryCharge) {
        this.batteryCharge = batteryCharge;
    }

    public int getBatteryCharge() {
        return batteryCharge;
    }

    private HashMap<String, String> phonesBook;

    public HashMap<String, String> getPhonesBook() {
        return phonesBook;
    }

    public Notepad() {
        phonesBook = new HashMap<String, String>();
    }

    // получить номер по имени

    public String getPhoneNumber(String name) {
        try {
            if (this.phonesBook.containsKey(name)) {
                System.out.println(name + " номер телефона: " + this.phonesBook.get(name));
                return this.phonesBook.get(name);
            } else {
                throw new NoSuchContactException();
            }
        } catch (NoSuchContactException ex) {
            System.out.println("В списке нет контакта с указанным именем");
            return null;
        }
    }
//эксепшн, если нет такого имени в списке

    public class NoSuchContactException extends Exception {

        public NoSuchContactException() {

        }

    }
    //добавить новое значение в книгу

    public String addNewValue(String name, String number) {

        try {
            if (!this.phonesBook.containsKey(name)) {
                phonesBook.put(name, number);
                System.out.println("Добавлен новый контакт:" + name + number);
                return this.phonesBook.get(name);
            } else {
                throw new DuplicateContactException();
            }
        } catch (DuplicateContactException ex) {
            System.out.println("В списке уже есть контакт с указанным именем");
            return null;
        }
    }

    //эксепшн для уже существующего контакта

    public class DuplicateContactException extends Exception {
        public DuplicateContactException() {
        }
    }

    public static void main(String[] args) {
        Notepad notepad1 = new Notepad();
        notepad1.getPhonesBook().put("Anna", "+375291234567");
        notepad1.getPhonesBook().put("Iryna", "+375292345678");
        notepad1.getPhoneNumber("Anna");
        notepad1.getPhoneNumber("Iryna");

        notepad1.addNewValue("Tatyana", "+375293456789");
        notepad1.addNewValue("Igor", "+375295678901");
        System.out.println(notepad1.phonesBook);
    }
}
