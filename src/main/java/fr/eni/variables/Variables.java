/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fr.eni.variables;

import java.util.Arrays;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

/**
 *
 * @author erwan
 */
public class Variables {

    public static void main(String[] args) {
        // ---------------------int--------------------------
        int intA = 20;
        int intB = 15;
        System.out.println(intA);
        System.out.println(intB); 
        // --------------------------------------------------
        
        // ---------------------reel-------------------------
        float fltA = 10.5f;
        double dblA = 10.5;
        System.out.println(fltA);
        System.out.println(dblA);
        // --------------------------------------------------
        
        // ---------------------bool-------------------------
        boolean boolA = true; 
        boolean boolB = false;
        boolean boolAandB = boolA&boolB;
        boolean boolAorB = boolA|boolB;
        System.out.println(boolAandB);
        System.out.println(boolAorB);       
        // --------------------------------------------------
        
        // -------------------scanner------------------------
        Scanner scanInput  = new Scanner(System.in);
        System.out.print("Saisir une chaîne A : ");
        String strA = scanInput.next();
        repet(intA, strA);
        System.out.print("Saisir une chaîne B : ");
        String strB = scanInput.next();
        String strAplusB = strA + " " + strB;
        System.out.println(strAplusB); 
        // --------------------------------------------------
        
/*
        System.out.println("Saisir une str");
        String STRA = scanInput.next();
        System.out.println("Saisir le nombre de fois que tu veux saisir ton nombre");
        int int1 = Integer.parseInt(scanInput.next());
        repet(int1, STRA);
        //String resultat4 = repet(STRA,int1);
        //System.out.println(resultat4);
*/        
        
        strA = scanInput.next();

        repet(intA, strA);
        strA = scanInput.next();
        repet(intA, strA);
        strA = scanInput.next();
        repet(intA, strA);
        strA = scanInput.next();
        repet(intA, strA);

        
        // -------------------liste--------------------------
        String[] arrStrA = {"a", "b", "c", "d"};
        int[] arrIntA = {10 , 20, 30, 40};
        double[] arrDblA = {1.1, 1.2, 1.3, 1.4};
        System.out.println(arrStrA[0]);
        System.out.println(arrIntA[0]);
        System.out.println(arrDblA[0]);
        
        int intTailleArrStrA = arrStrA.length;
        System.out.println(intTailleArrStrA);
        
        arrStrA[1] = "e";
        System.out.println(Arrays.toString(arrStrA));
        arrDblA[0] = 0;
        System.out.println(Arrays.toString(arrDblA));
        // --------------------------------------------------
        
    }
    
    public static void repet(int nbRepet,String chaineRepet)
    {
        int i = 0;        
        while(i <= nbRepet)
        {
            System.out.println(chaineRepet);
            i++;
        }
        
    }
   /* public static void repet(int a, String b)
    {

        int compteur = 0; 
        while(compteur != 10)
        {
            System.out.println(i);
            i= i+1; 
            
            
        }
    }
    */
}
