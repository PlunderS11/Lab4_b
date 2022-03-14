package com.example.tuan4b;

public class HangDienTu {
    private String name;
    private int rate;
    private String newPrice;
    private String peopleRate;
    private int imageThing;
    private String reducePercent;

    public HangDienTu(String name, int rate, String newPrice, String peopleRate, int imageThing, String reducePercent) {
        this.name = name;
        this.rate = rate;
        this.newPrice = newPrice;
        this.peopleRate = peopleRate;
        this.imageThing = imageThing;
        this.reducePercent = reducePercent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(String newPrice) {
        this.newPrice = newPrice;
    }

    public String getPeopleRate() {
        return peopleRate;
    }

    public void setPeopleRate(String peopleRate) {
        this.peopleRate = peopleRate;
    }

    public int getImageThing() {
        return imageThing;
    }

    public void setImageThing(int imageThing) {
        this.imageThing = imageThing;
    }

    public String getReducePercent() {
        return reducePercent;
    }

    public void setReducePercent(String reducePercent) {
        this.reducePercent = reducePercent;
    }
}
