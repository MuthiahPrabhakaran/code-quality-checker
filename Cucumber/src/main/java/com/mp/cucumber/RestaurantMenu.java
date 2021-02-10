package com.mp.cucumber;

import java.util.ArrayList;
import java.util.List;

public class RestaurantMenu {
    List<RestarauntMenuItem> restarauntMenuItems;

    public RestaurantMenu(){
        restarauntMenuItems = new ArrayList<>();
    }

    public void add(RestarauntMenuItem restaurantMenu){
        this.restarauntMenuItems.add(restaurantMenu);
    }

    public boolean isMenuItemExists(RestarauntMenuItem restaurantMenu){
        return restarauntMenuItems.contains(restaurantMenu)?true:false;
    }
}
