/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoffeeTime;

import edu.blackburn.cs.cs212.restaurantbase.*;
import java.util.ArrayList;

/**
 *
 * @author wesley.mcmillen
 */
public class Sandwich implements Orderable {

    ArrayList<Orderable> addOn = new ArrayList<>();
    public Money basePrice;
    public Money price;

    public Sandwich(Money basePrice) {
        this.basePrice = basePrice;
    }

    /**
     * not used
     *
     * @return
     */
    public Orderable add() {
        for (int i = 0; i < addOn.size(); i++) {
            if (this.addOn.get(i) != null) {

            }
        }
        return null;
    }

    @Override
    public Money getPrice() {

        return basePrice;
    }

    @Override
    public String getReceiptItem() {
        String price = "" + this.getPrice().getAmount();
        String item = price;
        System.out.println("Sandwich: $" + price);
        return item;
    }

}
