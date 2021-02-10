/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.blacklistvalidator;

import java.util.ArrayList;
import java.util.List;
import java.lang.Runtime;
/**
 *
 * @author hcadavid
 */
public class Main {
    
    public static void main(String a[]) throws InterruptedException {

        HostBlackListsValidator hblv=new HostBlackListsValidator();

        //List<Integer> blackListOcurrences=hblv.checkHost("200.24.34.55",40);
        //System.out.println("The host \"200.24.34.55\" was found in the following blacklists:"+blackListOcurrences);


        List<Integer>  blackListOcurrences=hblv.checkHost("202.24.34.55",100);
        System.out.println("The host \"202.24.34.55\" was found in the following blacklists:"+blackListOcurrences);

        //List<Integer>  blackListOcurrences=hblv.checkHost("212.24.24.55",43);
        //System.out.println("The host \"212.24.24.55\" was found in the following blacklists:"+blackListOcurrences);


    }
    
}
