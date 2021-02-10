/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author hcadavid
 */
public class CountThreadsMain {
    
    public static void main(String a[]){
        Thread proceso1 = new CountThread(0,99,"Hilo 1");
        Thread proceso2 = new CountThread(99,199,"Hilo 2");
        Thread proceso3 = new CountThread(200,299, "Hilo 3");

        proceso1.run();
        proceso2.run();
        proceso3.run();

    }
    
}
