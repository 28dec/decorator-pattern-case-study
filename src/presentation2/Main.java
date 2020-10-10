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
        Order order = new Order();
        order.add(new LemonTea());
        order.add(new LemonTea());
        order.add(new SunflowerSeed());
        System.out.println(order.getOrderDetails());
    }
}
