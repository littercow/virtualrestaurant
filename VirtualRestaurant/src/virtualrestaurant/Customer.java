/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package virtualrestaurant;

import java.util.Random;

/**
 *
 * @author littercow
 */
public class Customer {

    int quantity;

    public Customer() {
        customerGenerator();
    }

    public Customer(int quantity) {
        this.quantity = quantity;
    }

    public int customerGenerator() {
        Random rdm = new Random();

        quantity = rdm.nextInt(6) + 1;
        return quantity;

    }

    @Override
    public String toString() {
        return "Customer{" + "quantity=" + quantity + '}';
    }

}
