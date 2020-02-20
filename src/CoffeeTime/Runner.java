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
     * @param args the command line arguments ESTIMATE 4 hours Current
     */
    public static void main(String[] args) {
        Measurement measurement;
        Money money;
        FancyCoffee coffee1 = new FancyCoffee("HotMama", new Size("Medium"),
                new Money(7.75));
        FancyCoffee coffee2 = new FancyCoffee("ColdDaddy", new Size("X-Small"),
                new Money(4));
        Syrup syrup1 = new Syrup("Chocolate drizzle", new Money(.75));
        Syrup syrup2 = new Syrup("Caramel", new Money(.75));
        Receipt receipt = new Receipt();
        receipt.add(coffee1);
        receipt.add(coffee2);
        receipt.add(syrup1);
        receipt.add(syrup2);
        receipt.prepare();
        System.out.println("Total: $" + receipt.getTotalPrice().getAmount());
        System.out.println("");
        Sandwich sandwich1 = new Sandwich(new Money(5));
        Sandwich sandwich2 = new Sandwich(new Money(5));
        Topping topping = new Topping("BBQ sauce", new Money(1));
        Meat meat = new Meat("Bacon", new Money(1.25));
        Receipt receipt2 = new Receipt();
        receipt2.add(sandwich1);
        receipt2.add(sandwich2);
        receipt2.add(meat);
        receipt2.add(topping);
        receipt2.prepare();
        System.out.println("Total: $" + receipt2.getTotalPrice().getAmount());

    }

}
