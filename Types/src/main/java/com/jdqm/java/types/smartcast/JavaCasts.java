package com.jdqm.java.types.smartcast;

public class JavaCasts {
    public static void main(String... args) {

        Kotliner kotliner = new Person("benny", 20);
        //通过instanceof判断后，让然需要强转
        if(kotliner instanceof Person){
            System.out.println(((Person) kotliner).name);
        }
    }
}


