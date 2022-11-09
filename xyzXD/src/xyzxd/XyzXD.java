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
    public static double felszin(int sugar, int magassag)
    {
        double felszin = (2 * (sugar * sugar) * Math.PI) + (2 * sugar * Math.PI * magassag);  
        return felszin;
    } 
    public static double terfogat(double sugar, double magassag) {
        
        double terf = sugar*sugar * Math.PI * magassag;
        return terf;
        
    }    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myObj = new Scanner(System.in);
        System.out.println("Kérem a henger sugarát: ");
        int s = myObj.nextInt();
        System.out.println("Kérem a henger magasságát: ");
        int m = myObj.nextInt();
        System.out.println("A henger térfogata: " + terfogat(s,m));
        System.out.println("A henger felszíne: " + felszin(s,m));
    }
    
}
