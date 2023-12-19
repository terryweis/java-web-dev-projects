package org.launchcode;

import java.util.ArrayList;
public class Menu {

    public static void theMenu(String[] args) {
        ArrayList<MenuItem> items = new ArrayList<>();

        MenuItem macNCheese = new MenuItem(11.00, "cheesy pasta", true);
        MenuItem porkChops = new MenuItem(16.00, "Pork chop and green beans", true);

        items.add(macNCheese);
        items.add(porkChops);

    }
}