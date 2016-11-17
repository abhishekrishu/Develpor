package com.example.android.develpor;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by android on 11/17/2016.
 */

public class inheritance extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inheritance);
    }
}
class Animal {

    public Animal() {

        System.out.println("A new animal has been created!");

    }



    public void sleep() {

        System.out.println("An animal sleeps...");

    }



    public void eat() {

        System.out.println("An animal eats...");

    }

}
class Bird extends Animal {

    public Bird() {

        super();

        System.out.println("A new bird has been created!");

    }





    public void sleep() {

        System.out.println("A bird sleeps...");

    }





    public void eat() {

        System.out.println("A bird eats...");

    }

}

class Cow extends Animal {

    public Cow() {

        super();

        System.out.println("A new cow has been created!");

    }





    public void sleep() {

        System.out.println("A cow sleeps...");

    }





    public void eat() {

        System.out.println("A cow eats...");

    }

}
class MainClass {

    public static void main(String[] args) {

        Animal animal = new Animal();

        Bird bird = new Bird();

        Cow cow = new Cow();



        System.out.println();



        animal.sleep();

        animal.eat();



        bird.sleep();

        bird.eat();



        cow.sleep();

        cow.eat();

    }

}


