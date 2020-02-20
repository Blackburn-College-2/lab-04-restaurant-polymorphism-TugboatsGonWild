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
        this.name = name;
        this.basePrice = basePrice;
    }

    public void Drink(String name, Money basePrice) {

    }

    /**
     * pulls price of the drink
     *
     * @return
     */
    @Override
    public Money getBasePrice() {
        return basePrice;
    }

    /**
     * pulls name of the drink
     *
     * @return
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * not used
     *
     * @return
     */
    public String toPaddedString() {
        return name;
    }

    /**
     * gives back name of drink
     *
     * @return
     */
    @Override
    public String toString() {
        return name;
    }

    /**
     * gives back price of the drink
     *
     * @return
     */
    @Override
    public Money getPrice() {
        return basePrice;
    }

    /**
     * prints out the items in receipt
     *
     * @return
     */
    @Override
    public String getReceiptItem() {
        String name = this.toString();
        String price = "" + this.getPrice().getAmount();
        String item = name + "  " + price;
        System.out.println(name + "    " + price);
        return item;

    }

}
