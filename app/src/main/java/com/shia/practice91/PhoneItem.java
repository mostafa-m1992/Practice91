package com.shia.practice91;

public class PhoneItem {

    private int avatar;
    private String name;
    private String message;
    private String price;

    public PhoneItem(int avatar, String name, String message, String price) {
        this.avatar = avatar;
        this.name = name;
        this.message = message;
        this.price = price;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
