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
public class Meat implements Orderable {

    public String name;
    public Money price;

    public Meat(String name, Money price) {
        this.name = name;
        this.price = price;
    }

    /**
     * gets the price of the meat
     *
     * @return
     */
    @Override
    public Money getPrice() {
        return price;
    }

    /**
     * prints items for receipt
     *
     * @return
     */
    @Override
    public String getReceiptItem() {
        String name = "    " + this.name;
        String price = "" + this.getPrice().getAmount();
        String item = name + "  " + price;
        System.out.println(name + "    $" + price);
        return item;
    }

}
