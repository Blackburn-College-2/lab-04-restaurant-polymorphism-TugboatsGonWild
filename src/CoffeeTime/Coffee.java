/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoffeeTime;

import edu.blackburn.cs.cs212.restaurantbase.*;

/**
 *
 * @author wesley.mcmillen
 */
public class Coffee extends MenuItem {

    private String name;
    private Money basePrice;

    Coffee(String name, Size size, Money basePrice) {
        super(name, basePrice);
        this.name=name;
        this.basePrice=basePrice;
    }

    public void Drink(String name, Money basePrice) {

    }

    @Override
    public Money getBasePrice() {
        return basePrice;
    }

    @Override
    public String getName() {
        return name;
    }

    public String toPaddedString() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public Money getPrice() {
        return basePrice;
    }

    @Override
    public String getReceiptItem() {
        String name = this.toString();
        String price = ""+this.getPrice().getAmount();
        String item = name + "  " + price;
        System.out.println(name + "    " + price);
        return item;
        
    }

}
