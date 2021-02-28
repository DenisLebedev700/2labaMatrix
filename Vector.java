package com.company;

public class Vector {
    public int [] vector;
    public int size;
    Vector() {
        size = 2;
        vector = new int[size];
    }

    public Vector(int size) {
        this.size = size;
        vector = new int[size];
    }
    public Vector(int size, int value) {
        this.size = size;
        vector = new int[size];
        for (int i = 0; i < size; i++) {
            vector[i] = value;
        }
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < size; i++) {
            str.append(vector[i] + "\n");
        }
        return str.toString();
    }
    public int size() {
        return this.size;
    }
}
