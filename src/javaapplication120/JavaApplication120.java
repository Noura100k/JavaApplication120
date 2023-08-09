/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication120;

/**
 *
 * @author msi9
 */
public class JavaApplication120 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        question_one employee1,employee2,employee3;
        employee1=new question_one("mohammed","manager",22,3,"Bachelor","Full-Time");
        employee2=new question_one("Noura","UI/UX",100,5,"diploma","Part-Time");
        employee3=new question_one("Omar","Digital Developement",90,2,"master","Full-Time");
        
        
        System.out.println("\nthe Employee information :\n");
        employee1.display();
        System.out.println("---------------------");
        employee2.display();
         System.out.println("---------------------");
         employee3.display();
         System.out.println("---------------------");
        
        
    }
    
}
