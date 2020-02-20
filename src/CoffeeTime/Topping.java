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
 *
 */
public class Topping implements Orderable {

    String type;
    Money price;

    public Topping(String type, Money price) {
        this.type = type;
        this.price = price;
    }

    /**
     * pulls price of topping
     *
     * @return
     */
    @Override
    public Money getPrice() {
        return price;
    }

    /**
     * prints receipts items
     *
     * @return
     */
    @Override
    public String getReceiptItem() {
        String name = "    " + this.type;
        String price = "" + this.getPrice().getAmount();
        String item = name + "  " + price;
        System.out.println(name + "    $" + price);
        return item;
    }

}
