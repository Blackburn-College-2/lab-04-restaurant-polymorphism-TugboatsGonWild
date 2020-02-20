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
public class Syrup implements Orderable {

    public String flavor;
    public Money price;

    public Syrup(String flavor, Money price) {
        this.price = price;
        this.flavor = flavor;
    }

    /**
     * pulls price of the syrup
     *
     * @return
     */
    @Override
    public Money getPrice() {
        return price;
    }

    /**
     * prints the receipts items
     *
     * @return
     */
    @Override
    public String getReceiptItem() {
        String name = "    " + this.flavor;
        String price = "" + this.getPrice().getAmount();
        String item = name + "  " + price;
        System.out.println(name + "    $" + price);
        return item;
    }

}
