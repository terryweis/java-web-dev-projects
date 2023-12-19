package org.launchcode;

public class MenuItem {

    private double price;
    private String description;
    private String catagory;

    private boolean New;



    public MenuItem(double price,String description, boolean newItem ){
        this.price = price;
        this.description = description;
        this.New = new;
    }
    public void setNew(boolean aNew) {
        New = aNew;
    }

    public boolean isNew() {
        return New;
    }
    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCatagory() {
        return catagory;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }



}
