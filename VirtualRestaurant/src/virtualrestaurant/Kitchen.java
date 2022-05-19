/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package virtualrestaurant;
import java.util.*;
/**
 *
 * @author littercow, Cattail
 */
public class Kitchen {
    //create a Hashmap to store the dish name and cooking time.
    HashMap<String, Integer> menu = new HashMap<String, Integer>();
    String dish;
    boolean stove = true;

    public Kitchen(String dish, Integer stove) {
        this.stove = stove;
    }

    //use dish name to find the timer.
    private int getTimer(String dish){
        return menu.get(dish);
    }

    //check method to check if the stove currently open.
    public boolean isStoveOpen(){
        return stove;
    }

    
    public Kitchen() {
    }

}
