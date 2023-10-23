/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.revision;

/**
 *
 * @author amrra
 */
public class TestStudent {
    
    
    public static void main(String[] args){
        Student s1 = new Student("Amr");
        Student s2 = new Student("Btngan");
        Student s3 = new Student("Abdo");
        
        Student[] students = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        
        for(Student s: students){
            System.out.println(s.getName());
        }
        System.out.prinln("Update");
    }
}
