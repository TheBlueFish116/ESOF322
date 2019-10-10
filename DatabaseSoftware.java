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
public abstract class DatabaseSoftware {
    Storetype storetype;
    
    public abstract void display();
    
    public void store(){
        storetype.store();
    }
    
    public void setStoreStrategy(Storetype st){
        storetype = st;
    }
}
