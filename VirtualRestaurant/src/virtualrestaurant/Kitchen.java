/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package virtualrestaurant;
import java.util.*;
import java.io.*;
/**
 *
 * @author littercow, Cattail
 */
public class Kitchen {
    //create a Hashmap to store the dish name and cooking time.
    HashMap<String, Integer> menu = new HashMap<String, Integer>();
    String dish;
    List<Boolean> stoves = new ArrayList<>();

    public Kitchen(String dish, Integer stove, List orders) {
        createStove(stove);
    }

    //use dish name to find the timer.
    private int getTimer(String dish){
        return menu.get(dish);
    }

    //create a list of stoves;
    private void createStove(int number){  
        for(int i = 0; i< number; i++){
            stoves.add(i,true);
        }
    }
    //check method to check if the stove currently open.
    public int openStove(){
        int x = 0;
        for(int i = 0; i < stoves.size(); i++){
            if(stoves.equals(true)){
                return x;
            }else{
                x++;
            }
        }
        return 0;
    }


    
    public Kitchen() {
    }

}
