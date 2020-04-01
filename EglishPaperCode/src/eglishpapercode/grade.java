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
public class grade extends EnglishPaperCode {
   public int grade1 = 0;
   public int grade2 = 0;
   public int grade3 = 0;

     String student1 = "Mary";
    String student2 = "John";
    String student3 = "Jamie";
    int average = 0;
    
    public int getGrade2() {
        return grade2;
    }

    public void setGrade2(int grade2) {
        this.grade2 = grade2;
    }

    public int getGrade3() {
        return grade3;
    }

    public void setGrade3(int grade3) {
        this.grade3 = grade3;
    }
    
    public int getGrade1() {
        return grade1;
    }

    public void setGrade1(int grade1) {
        this.grade1 = grade1;
    }

    public String getStudent1() {
        return student1;
    }

    public String getStudent2() {
        return student2;
    }
   
    public String getStudent3() {
        return student3;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }
    
}
