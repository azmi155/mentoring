/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author azmim
 */
public class NewClass {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        Scanner in = new Scanner(System.in);
        
        
        System.out.print("Input Nama: ");
        arr.add(in.next());
        System.out.print("Input Prodi: ");
        arr.add(in.next());
        
        System.out.println(arr);
        System.out.println(arr.get(1));
        arr.remove(in.next());
        System.out.println(arr);
    }
}
