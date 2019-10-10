/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esof.pkg2;

/**
 *
 * @author dylan
 */
public class Graph extends DatabaseSoftware {
    public Graph(){
        storetype = new NodeStore();
    }
    public void display(){
        System.out.println("You chose Graph");
    }
}
