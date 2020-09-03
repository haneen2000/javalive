package com.company;

public class Fruit {

    // class and objects
    int apple;
    int orange;


    //methods

    public void myMethod(){
        int a =20;
        System.out.println("hello");

    }
    public int m2(){
        int b= 20;
        System.out.println("hello");
        return b;
    }

    public String name(char a){
        if (a=='a'){return "apple";}
        if (a=='o'){return "orange";}
        return "false";
    }

    //modifier
    static void myStaticMethod() {
        System.out.println("hello static world");}

        private int myPrivate=10;



    //Encapsulation

    private String name;
    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }

}
