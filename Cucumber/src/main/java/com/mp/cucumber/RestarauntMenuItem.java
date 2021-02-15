package com.mp.cucumber;

import java.util.Objects;

public class RestarauntMenuItem {

    private String menuItemName;
    private String description;
    private int price;

    public RestarauntMenuItem(String menuItemName, String description, int price) {
        this.menuItemName = menuItemName;
        this.description = description;
        this.price = price;
    }

    public String getMenuItemName() {
        return menuItemName;
    }

    public void setMenuItemName(String menuItemName) {
        this.menuItemName = menuItemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RestarauntMenuItem that = (RestarauntMenuItem) o;
        return price == that.price &&
                Objects.equals(menuItemName, that.menuItemName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuItemName, price);
    }
}
