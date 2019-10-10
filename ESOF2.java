/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esof.pkg2;

import java.util.Scanner;

/**
 *
 * @author dylan
 */
public class ESOF2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //client program
        
        //asks and records what software the user wants
        System.out.println("What is your selection of software.");
        Scanner admin = new Scanner(System.in);
        String selection = admin.nextLine();
        selection = selection.toLowerCase();
        DatabaseSoftware software;
        
        //this is to see which software you pick
        int i;
        
        
        //implements the software
        if(selection.equals("relational")){
            software = new Relational();
            i=0;
        }else if(selection.equals("nosql")){
            software = new NoSQL();
            i=1;
        }else{
            software = new Graph();
            i=2;
        }
        
        software.store();
        
        //This is the new strategy
        Storetype strategy;
        
        //this makes sure that the new strategy isn't the same as the old one
        //since I dont know what you'll pick.
        if(i == 0){
            strategy = new DocumentStore();
        }else{
            strategy = new TableStore();
        }
        
        
        software.setStoreStrategy(strategy);
          
        software.store();
        
    }
    
}
