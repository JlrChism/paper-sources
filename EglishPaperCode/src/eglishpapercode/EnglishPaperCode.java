/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eglishpapercode;

/**
 *
 * @author Josiah Chism
 */
public class EnglishPaperCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        grade g1 = new grade();
        
        g1.setGrade1(73);
        g1.setGrade2(95);
        g1.setGrade3(56);
        
        g1.setAverage(g1.getGrade1()+g1.getGrade2()+g1.getGrade3()/3);
        
     System.out.println("The grade of " + g1.getStudent1() + " is " + g1.getGrade1());   
     System.out.println("The grade of " + g1.getStudent2() + " is " + g1.getGrade2());  
     System.out.println("The grade of " + g1.getStudent3() + " is " + g1.getGrade3());
     System.out.println("The class average is " + g1.getAverage());  
     
        }
    }
    

