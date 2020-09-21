/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class EncapDemo {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        //this.age = age;
        if (newAge >= 18 && newAge <= 30) {
            age = newAge;
        } else {
            System.out.println("Umur tidak sesuai ketentuan");
            //age = newAge;
        }
    }
}
