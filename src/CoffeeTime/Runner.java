/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoffeeTime;

import edu.blackburn.cs.cs212.restaurantbase.Measurement;
import edu.blackburn.cs.cs212.restaurantbase.Money;
import edu.blackburn.cs.cs212.restaurantbase.Receipt;

/**
 *
 * @author wesley.mcmillen
 */
public class Runner {

    /**
     * @param args the command line arguments
     * ESTIMATE 2.5 hours
     * Current 1.75
     */
    public static void main(String[] args) {
        Measurement measurement;
        Money money;
        Coffee coffee1 = new Coffee("Java", new Size("Medium"), new Money(6));
        Coffee coffee2 = new Coffee("C++", new Size("Medium"), new Money(15));
        Coffee coffee3 = new Coffee("JavaScript", new Size("Medium"), new Money(4));
        Coffee coffee4 = new Coffee("Python", new Size("Medium"), new Money(5));
        Coffee coffee5 = new Coffee("Obama", new Size("Large"), new Money(420));
        Receipt receipt = new Receipt();
        receipt.add(coffee1);
        receipt.add(coffee2);
        receipt.add(coffee3);
        receipt.add(coffee4);
        receipt.add(coffee5);
        receipt.prepare();
    }
    
}
