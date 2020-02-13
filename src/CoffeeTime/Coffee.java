/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoffeeTime;

import edu.blackburn.cs.cs212.restaurantbase.MenuItem;
import edu.blackburn.cs.cs212.restaurantbase.Money;

/**
 *
 * @author wesley.mcmillen
 */
public class Coffee extends MenuItem {

    private String name;
    private Money basePrice;

    public Coffee(String name, Money basePrice) {
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Money getPrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getReceiptItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
