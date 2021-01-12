package com.zyt.dpbook.templemethod;

public class Main {
    public static void main(String[] args) {
        System.out.println("hi~ bobie");
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("hello,world.");
        AbstractDisplay d3= new StringDisplay("你好,世界.");
        d1.display();
        d2.display();
        d3.display();
    }
}
