/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

public class People {

    public static void main(String[] args) {
        
        // object Hugo
        Human student = new Human("Hugo", 18, Human.Sex.MAN);
        student.setHeight(1.96f);
        student.setWeight(86);
        
        // obejct Hilda
        Human studentka = new Human("Hilda", 17, Human.Sex.WOMAN);
        studentka.setHeight(1.76f);
        studentka.setWeight(55);
        
        System.out.println(student.toString());
        System.out.println(studentka.toString());
    }
    
}
