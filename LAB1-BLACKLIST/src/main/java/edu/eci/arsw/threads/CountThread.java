/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

import edu.eci.arsw.spamkeywordsdatasource.HostBlacklistsDataSourceFacade;

import java.util.LinkedList;

/**
 *
 * @author hcadavid
 */
public class CountThread extends Thread {

    int A;
    int B;
    String nombre;

    public CountThread(int a, int b, String nombre){
        this.A = a;
        this.B = b;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        for (int i = A;i<=B;i++){
            System.out.println(i + " " + nombre);
        }
    }

}
