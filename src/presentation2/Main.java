/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation2;

/**
 *
 * @author longnh
 */
public class Main {
    public static void main(String[] args) {
        makeOrder();
    }

    static void makeOrder(){
        Order order = new Order();
        Item beverage1 = new LemonTea();
        beverage1.addTopping(new AloeVera()); // thêm nha đam

        Item beverage2 = new LemonTea();
        beverage2.addTopping(new WhitePearl()); // thêm trân châu trắng

        Item snack1 = new SunflowerSeed();

        order.add(beverage1);
        order.add(beverage2);
        order.add(snack1);

        //print bill
        order.printBill();
    }
}
