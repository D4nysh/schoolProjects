/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package people;

/* Class Human */
public class Human {
    
    /* Own selection type */
    public enum Sex{
        MAN, WOMAN
    }
    
    /* Attributes of this class */
    private String name;
    private int age = 20;
    private int weight = 70;
    private float height = (float) 1.80;
    private Sex sex = Sex.MAN;
             
    /* Methods of the class Human */
    // Contructor of Human class
    public Human(String sign){
        this.name = sign;
    }
    
    public Human(String sign, int age, Sex sex){
        this.name = sign;
        this.setAge(age);
        this.setSex(sex);
    }
    
    // Getters & Setters
    public int getAge(){
        return this.age;
    }
    
    public void setAge(int age){
        try{
            if(age > 0 && age < 130) this.age = age;
        } catch(Exception e){
            System.out.println("Age was not set correctly.");
            this.age = 0;
        }
        /*do{
           
        }while(this.age == 0);*/
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
    
    public String toString() {
        String output = "My name is " + this.name + "\n";
        output += "I am " + this.getSex() + "\n";
        output += "Age: " + this.getAge() + " years old \n";
        output += "Height: " + this.getHeight() + " m \n";
        output += "Weight: " + this.getWeight() + " kg \n";
        output += "BMI: " + this.getBMI() + " \n";
        return output;
    }
    
    public double getBMI(){
        return Math.round((this.getWeight() / Math.pow(this.getHeight(),2)) * 100.0) / 100.0;
    }
}
