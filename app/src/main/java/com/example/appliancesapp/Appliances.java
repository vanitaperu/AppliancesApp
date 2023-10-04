package com.example.appliancesapp;


public class Appliances {
    private String name;
    private String desc;
    private Double price;
    private int imageID;



    public static final Appliances[] appliances={
            new Appliances("Retrigerator", "Small", 500,R.drawable.img_1),
            new Appliances("Washer Dryer", "Med", 450,R.drawable.img_2),
            new Appliances("Cooktop", "Large", 650,R.drawable.img_3)

    };
    private Appliances(String name, String desc, double price, int imageID){
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.imageID = imageID;
    }
    public String getName() {
        return name;
    }
    public String getDesc(){
        return desc;
    }
    public double getPrice(){
        return price;
    }
    public int getImageID(){
        return imageID;
    }

    public String toString(){
        return name;
    }

}



