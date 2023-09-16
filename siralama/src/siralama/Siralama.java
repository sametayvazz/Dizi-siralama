/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siralama;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Siralama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner deger=new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz: ");
        int boyut=deger.nextInt();       
        Random rnd=new Random();
        int dizi[]=new int[boyut];
        for (int i = 0; i < boyut; i++) 
        {
            dizi[i]=rnd.nextInt(1000);
        }                         
        //secmeli_siralama(dizi);
       //kabarcik_siralama(dizi);     
      // eklemeli_siralama(dizi);
        for (int i = 0; i < boyut; i++) {
            System.out.println(dizi[i]);
        }
        
    }
    public static int[] secmeli_siralama(int[] dizi)
    {
        for (int i = 0; i < dizi.length - 1; i++) 
        {
            int indis = i;
            for (int j = i+1; j < dizi.length; j++) 
            {
                if (dizi[j]<dizi[indis]) 
                {
                    indis=j;
                }
            }
            int eks=dizi[indis];
            dizi[indis]=dizi[i];
            dizi[i]=eks;            
        }        
        return dizi;
        
    }
    private static int[] kabarcik_siralama(int[] dizi)
    {
        int n = dizi.length;
        int gecici = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = 1; j < (n-i); j++)
            {
                if (dizi[j-1]>dizi[i])
                {
                    gecici=dizi[j-1];
                    dizi[j-1]=dizi[i];
                    dizi[j]=gecici;
                }
            }
        }        
        return dizi;    
    }
    private static int[] eklemeli_siralama(int[] dizi)    
    {
        int n = dizi.length;     
        for (int i = 1; i < n; i++)
        {
            int pivot=dizi[i];
            int j = i - 1;
            while(j>=0 && dizi[j]>pivot)
            {
                dizi[j+1]=dizi[j];
                j=j-1;
            }
            dizi[j+1]=pivot;
        }        
        return dizi;    
    }
    }
    

