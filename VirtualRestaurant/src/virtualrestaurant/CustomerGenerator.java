/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package virtualrestaurant;

import java.util.*;

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

    //create a random group size between 1 and 6;
    public int getCustomer(){
        Random  x = new Random();
        int customerSize = 6;
        int size = x.nextInt(customerSize);
        if(size > 0){
            return size;
        }else{
            return 1;
        }
    }
    
    public CustomerGenerator() {
    }

}
