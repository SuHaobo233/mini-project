/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package homework;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author de'l'l
 */
public class Homework {
//My task is a hairbrush i want this object could chesck the humans age and then depend this human's age gives different service
    /**
     * @param args the command line arguments
     */

 
 
      public static  void judgehairgrade(){
       //char grade = args[0].charAt(0);
       char  grade = 'C';
  
       switch(grade)
       {
          case 'A' :
             System.out.println("exelent"); 
             break;
          case 'B' :
          case 'C' :
             System.out.println("good");
             break;
          case 'D' :
             System.out.println("not bad");
             break;
          case 'F' :
             System.out.println("you have to pay more attention for you hair");
             break;
          default :
             System.out.println("unknow");
       }
       System.out.println("you hair level is " + grade);
    }

      public static void hairtemperature(){
        Integer x = 36;
        for(Integer i = 15;i<36;i++){
        if (x == i){
        continue;
        }
        System.out.println("i = "+i);
         }
      System.out.println("you hair temperature is equal 36 I have stop the heating function thanks four your using");
      }
       
      
              public static void main(String[] args) {
         
          Scanner scanner=new Scanner(System.in);
              System.out.println("please write down you age:");
              Integer age=scanner.nextInt();
                if(age<18){//to check the user is adult or not
                    System.out.print("you are to young you can not use this hairbrush");
                }else{
                    System.out.print("Thanks for your undestand you are adult you can use our hairbrush");
                }
              
                judgehairgrade();
                hairtemperature(); 

      }
         
  }


