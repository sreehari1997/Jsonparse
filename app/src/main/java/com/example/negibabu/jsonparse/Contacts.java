package com.example.negibabu.jsonparse;

import java.util.SimpleTimeZone;

/**
 * Created by negibabu on 2/25/17.
 */

public class Contacts {
    private String item,price;

    public Contacts(String item, String price)
    {
        this.setItem(item);
        this.setPrice(price);

    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


}
