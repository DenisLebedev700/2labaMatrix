package com.company;

public class Main {

    public static void main(String[] args) {
        Matrix test = new Matrix(2, 1);
        System.out.println(test);
        test.setElement(1, 1, 0);
	    test.setElement(0, 1, 1);
	    test.setElement(1, 0, 1);
        test.show();
        Matrix test2 = new Matrix(2);
        test.setElement(0, 1, 1);
        for (int i = 0; i < 10; i++) {
            test2 = test.product(test2);
            test2.show();
        }
        Vector test1 = new Vector(3, -2);
        System.out.println(test1);
        System.out.println(test.product(test1));
    }
}
