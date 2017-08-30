/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainthread;

import mainthread.enity.Customer;

/**
 *11111
 * @author Administrator
 */
public class MainThread {

   
    public static void main(String[] args) {
        Customer customer1=new Customer("D01","Mạnh Hùng","manhhung@gmail.com","10/10/1995",10000000,"kaka.jpg",1);
        customer1.selectProduct(" AK47");
        customer1.checkOut();
        System.out.println(customer1.toString());
    }
    
}
