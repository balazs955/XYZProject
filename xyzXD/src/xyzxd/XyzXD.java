/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xyzxd;
import java.util.Scanner;
/**
 *
 * @author user3
 */
public class XyzXD {

    /**
     * @param args the command line arguments
     */
    
    //t�rfogat
    public static double terfogat(double sugar, double magassag) {
        
        double terf = sugar*sugar * Math.PI * magassag;
        return terf;
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myObj = new Scanner(System.in);
        System.out.println("K�rem a henger sugar�t: ");
        int sugar = myObj.nextInt();
        System.out.println("K�rem a henger magass�g�t: ");
        int magassag = myObj.nextInt();
        
        
        
        
        //t�rfogat
        
        
       
    }
    
}
