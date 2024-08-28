/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.micxz;
import java.util.Scanner;
/**
 *
 * @author CL3-PC35
 */
public class Micxz {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("[1] - Snacks");
        System.out.println("[2] - Drinks");
         
        System.out.println("Enter your Choice: ");
         int ch1 = input.nextInt();
         
         if (ch1==1)
         {
              System.out.println("Snacks");
              System.out.println("[1] - Piattos");
              System.out.println("[2] - Nova");
                
             System.out.println("Enter your choice");
             int ch2= input.nextInt();
             int pia, nova;
             pia = 20;
             nova = 22;
             
             if (ch2==1)
             {
              System.out.println("[1] Piattos 20.00");
              System.out.println("Would you like drinks? [1]: yes [2]: no");
               int ch3 = input.nextInt();
              
              if (ch3==1)
              { 
                  System.out.println("Drinks");
                  System.out.println("[1] - Coke");
                  System.out.println("[2] - Water");
                  
                  System.out.println("Enter your choice");
                   int ch4 = input.nextInt();
                   int coke , water;
                   coke = 21;
                   water = 27;
                         
                   if(ch4==1)
                   {
                   System.out.println("[1] Coke 21.00");
                   int tot;
                   tot = pia + coke;
                   System.out.println("Total is: " + tot);
                   System.out.println("Enter your Cash");
                    int csh = input.nextInt();
                   
                    while (csh<tot)
                    {
                      System.out.println("Invalid");  
                        System.out.println("Enter your Cash");
                        csh = input.nextInt();
                        
                    }
                    int chng;
                    chng  = csh - tot;
                    System.out.println("change is: " + chng);
                    
                   }
                   
                   //water and piatos
                   else if(ch4==2)
                   {
                   System.out.println("[2] Water 27.00");
                   int tot;
                   tot = pia + water;
                   System.out.println("Total is: " + tot);
                   System.out.println("Enter your Cash");
                    int csh = input.nextInt();
                   
                    while (csh<tot)
                    {
                      System.out.println("Invalid");  
                        System.out.println("Enter your Cash");
                        csh = input.nextInt();
                        
                    }
                    int chng;
                    chng  = csh - tot;
                    System.out.println("change is: " + chng);
                    
                   }
                  

          
                             

              }
              
              
             }
             
             //combinaton nova + coke and nova + water
             
             if (ch2==2)
             {
              System.out.println("[2] Nova 22.00");
              System.out.println("Would you like Drinks? [1]: yes [2]: no");
               int ch3 = input.nextInt();
              
              if (ch3==1)
              { 
                  System.out.println("Drinks");
                  System.out.println("[1] - Coke");
                  System.out.println("[2] - Water");
                  
                  System.out.println("Enter your choice");
                   int ch4 = input.nextInt();
                   int coke , water;
                   coke = 21;
                   water = 27;
                         
                   if(ch4==1)
                   {
                   System.out.println("[1] Coke 21.00");
                   int tot;
                   tot = nova + coke;
                   System.out.println("Total is: " + tot);
                   System.out.println("Enter your Cash");
                    int csh = input.nextInt();
                   
                    while (csh<tot)
                    {
                      System.out.println("Invalid");  
                        System.out.println("Enter your Cash");
                        csh = input.nextInt();
                        
                    }
                    int chng;
                    chng  = csh - tot;
                    System.out.println("change is: " + chng);
                    
                   }
                   
                   //water and piatos
                   else if(ch4==2)
                   {
                   System.out.println("[2] Water 27.00");
                   int tot;
                   tot = nova + water;
                   System.out.println("Total is: " + tot);
                   System.out.println("Enter your Cash");
                    int csh = input.nextInt();
                   
                    while (csh<tot)
                    {
                      System.out.println("Invalid");  
                        System.out.println("Enter your Cash");
                        csh = input.nextInt();
                        
                    }
                    int chng;
                    chng  = csh - tot;
                    System.out.println("change is: " + chng);
                    
                   }
                  

          
                             

              }
              
              
             }

         }
        //drinks main
        
        if (ch1==2)
         {
              System.out.println("Drinks");
              System.out.println("[1] - Coke");
              System.out.println("[2] - Water");
                
             System.out.println("Enter your choice");
             int ch2= input.nextInt();
             int coke, water;
             coke = 21;
             water = 27;
             
             if (ch2==1)
             {
              System.out.println("[1] Coke 21.00");
              System.out.println("Would you like snacks? [1]: yes [2]: no");
               int ch3 = input.nextInt();
              
              if (ch3==1)
              { 
                  System.out.println("Snacks");
                  System.out.println("[1] - Piattos");
                  System.out.println("[2] - Nova");
                  
                  System.out.println("Enter your choice");
                   int ch4 = input.nextInt();
                   int pia , nova;
                   pia = 21;
                   nova= 22;
                         
                   if(ch4==1)
                   {
                   System.out.println("[1] Coke 21.00");
                   int tot;
                   tot = pia + coke;
                   System.out.println("Total is: " + tot);
                   System.out.println("Enter your Cash");
                    int csh = input.nextInt();
                   
                    while (csh<tot)
                    {
                      System.out.println("Invalid");  
                        System.out.println("Enter your Cash");
                        csh = input.nextInt();
                        
                    }
                    int chng;
                    chng  = csh - tot;
                    System.out.println("change is: " + chng);
                    
                   }
                   
                   //water and piatos
                   else if(ch4==2)
                   {
                   System.out.println("[2] Water 27.00");
                   int tot;
                   tot = pia + water;
                   System.out.println("Total is: " + tot);
                   System.out.println("Enter your Cash");
                    int csh = input.nextInt();
                   
                    while (csh<tot)
                    {
                      System.out.println("Invalid");  
                        System.out.println("Enter your Cash");
                        csh = input.nextInt();
                        
                    }
                    int chng;
                    chng  = csh - tot;
                    System.out.println("change is: " + chng);
                    
                   }
                  

          
                             

              }
              
              
             }
             
             //combinaton nova + coke and nova + water
             
             if (ch2==2)
             {
              System.out.println("[2] Coke 21.00");
              System.out.println("Would you like Snacks? [1]: yes [2]: no");
               int ch3 = input.nextInt();
              
              if (ch3==1)
              { 
                  System.out.println("Snacks");
                  System.out.println("[1] -Piattos ");
                  System.out.println("[2] - Nova");
                  
                  System.out.println("Enter your choice");
                   int ch4 = input.nextInt();
                   int pia , nova;
                   pia = 20;
                   nova = 22;
                         
                   if(ch4==1)
                   {
                   System.out.println("[1] Coke 21.00");
                   int tot;
                   tot = nova + coke;
                   System.out.println("Total is: " + tot);
                   System.out.println("Enter your Cash");
                    int csh = input.nextInt();
                   
                    while (csh<tot)
                    {
                      System.out.println("Invalid");  
                        System.out.println("Enter your Cash");
                        csh = input.nextInt();
                        
                    }
                    int chng;
                    chng  = csh - tot;
                    System.out.println("change is: " + chng);
                    
                   }
                   
                   //water and piatos
                   else if(ch4==2)
                   {
                   System.out.println("[2] Water 27.00");
                   int tot;
                   tot = nova + water;
                   System.out.println("Total is: " + tot);
                   System.out.println("Enter your Cash");
                    int csh = input.nextInt();
                   
                    while (csh<tot)
                    {
                      System.out.println("Invalid");  
                        System.out.println("Enter your Cash");
                        csh = input.nextInt();
                        
                    }
                    int chng;
                    chng  = csh - tot;
                    System.out.println("change is: " + chng);
                    
                   }
                  

          
                             

              }
              
              
             }

         }
        
        
         
         
         }
         }
    

