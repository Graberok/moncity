package com.graber.moncity;

import java.util.ArrayList;

class ProductType {
    String title;
    String description;
    String curency;
    long price;
    ArrayList<String> images;
    ProductType(){
        this.title = "Товар";
        this.description = "Описание товара: при хорошем отношении тут будет много полезного текста о товаре";
        this.curency = "UAH";
        this.price = 12357;
        this.images = new ArrayList<>();
    }







}
