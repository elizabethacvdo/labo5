/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo5threats;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author LN710Q
 */
public class animalthreats extends Thread{
    private String nombre;
    private int limite ,x,y;
    private JLabel animal;
    
    
    public animalthreats(){
        
    }

    public animalthreats(String nombre, int limite, int x, int y, JLabel animal) {
        this.nombre = nombre;
        this.limite = limite;
        this.x = x;
        this.y = y;
        this.animal = animal;
    }

    @Override
    public void run() {
        if (!"tortuga".equals(this.nombre)){
        for (int i=x;i<=this.limite;i+=10){
            System.out.println(this.nombre+"avanza");
           
                
            
            this.animal.setLocation(i,y);
            try{
                sleep(100);
            } catch (InterruptedException ex) {
            ex.printStackTrace();            }
            
        
        System.out.println(this.nombre+"ha llegado a la meta");
        
        yield();
        }
        for (int i=limite;i>=x;i-=10){
            System.out.println(this.nombre+"avanza");
            this.animal.setLocation(i,y);
            try{
                sleep(100);
            } catch (InterruptedException ex) {
            ex.printStackTrace();            }
            
        
        System.out.println(this.nombre+"ha llegado a la meta");
        
        yield();
        }}else{
         for (int i=x;i<=this.limite;i+=5){
            System.out.println(this.nombre+"avanza");
           
                
            
            this.animal.setLocation(i,y);
            try{
                sleep(100);
            } catch (InterruptedException ex) {
            ex.printStackTrace();            }
            
        
        System.out.println(this.nombre+"ha llegado a la meta");
        
        yield();
        }
        for (int i=limite;i>=x;i-=5){
            System.out.println(this.nombre+"avanza");
            this.animal.setLocation(i,y);
            try{
                sleep(100);
            } catch (InterruptedException ex) {
            ex.printStackTrace();            }
            
        
        System.out.println(this.nombre+"ha llegado a la meta");
        
        yield();   
        }
    }}
    
    
    
    
}
