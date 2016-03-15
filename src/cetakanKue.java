/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guest-Js778L
 */

public class cetakanKue {
    public static void main(String[] args) {
        cetakan jajan = new cetakan();
        jajan.display();
        
       u cetakan jajan2 = new cetakan(250,"onde - onde");
        jajan2.setBanyakKue(10);
        jajan2.display();
        jajan2.setBanyakKue(1000);
        
        System.out.println("total hari ini adalah "+ cetakan.jumlah);
    
    }
}
