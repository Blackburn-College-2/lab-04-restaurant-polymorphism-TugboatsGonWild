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
public class FancyCoffee extends Coffee {

    ArrayList<Orderable> addOn = new ArrayList<>();

    public FancyCoffee(String string, Size size, Money money) {
        super(string, size, money);

    }

    /**
     * not used
     *
     * @return
     */
    public Orderable add() {
        for (int i = 0; i < addOn.size(); i++) {
            if (this.addOn.get(i) == null) {

            }
        }
        return null;
    }

    /**
     * prints items on receipt
     *
     * @return
     */
    @Override
    public String getReceiptItem() {
        String name = this.toString();
        String price = "" + this.getPrice().getAmount();
        String item = name + "  " + price;
        System.out.println(name + "    $" + price);
        return item;

    }
}
