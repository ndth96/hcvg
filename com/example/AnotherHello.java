package com.example;

// vn.hvcg.HelloWorld
import vn.hvcg.HelloWorld;

public class AnotherHello{
    public static void main(String[] args) {
        System.out.println("Hello " + args[0] +". Tuoi: " +args[1]);
        HelloWorld.sub(args);
    }

    public static void sub(String[] args){
        System.out.println("Hello " + args[0] +". Tuoi: " +args[1]);
    }
}