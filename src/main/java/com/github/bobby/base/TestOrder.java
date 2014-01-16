package com.github.bobby.base;

public class TestOrder {   
    // ��̬����   
    public static TestA a = new TestA();   
       
    // ��̬��ʼ����   
    static {   
    	//System.out.println(temp);
        System.out.println("��̬��ʼ����");   
    }   
    
    //public static String temp = "temp";
    
    // ��̬����   
    public static TestB b = new TestB();   
  
    public static void main(String[] args) {   
        new TestOrder();   
    }   
}   
  
class TestA {   
    public TestA() {   
        System.out.println("Test--A");   
    }   
}   
  
class TestB {   
    public TestB() {   
        System.out.println("Test--B");   
    }   
}  