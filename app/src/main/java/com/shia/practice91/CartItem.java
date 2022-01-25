package com.shia.practice91;

public class CartItem {

    private int userAvatar;
    private String userName;

    public CartItem(int userAvatar, String userName) {
        this.userAvatar = userAvatar;
        this.userName = userName;
    }

    public int getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(int userAvatar) {
        this.userAvatar = userAvatar;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
