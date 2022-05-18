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
public class CustomerGenerator {

    //random generator
    int customer;
    String group;

    public CustomerGenerator(int customer, String group) {
        this.customer = customer;
        this.group = group;
    }

    public Random getCustomer() {
        Random x = new Random();
        return x;
    }

    public CustomerGenerator() {
    }

}
