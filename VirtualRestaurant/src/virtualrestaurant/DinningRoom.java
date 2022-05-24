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
public class DinningRoom {

    ArrayList<Integer> tables = new ArrayList<Integer>();
    int table;
    int chair;
    String order;
    Customer customers;

    public DinningRoom(int table, int chairs, String order) {
        this.table = table;
        this.chair = chairs;
        this.order = order;
    }

    //create a table in the table array;
    private void creatTable(int size) {
        tables.add(size);
    }

    //return the total number of tables.
    private int getTotalTableNumber() {
        return tables.size();
    }

    public DinningRoom() {
    }

}
