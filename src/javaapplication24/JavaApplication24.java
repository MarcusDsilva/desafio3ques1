/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class JavaApplication24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int x;

       Scanner ler = new Scanner(System.in);

       System.out.println("Valor de X:");
       x = ler.nextInt();

       if (x % 2 == 0){ 
           System.out.println("O valor de X é par");
       } else {
           System.out.println("O valor de X é impar");
       }


    }
}

