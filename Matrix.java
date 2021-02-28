package com.company;

public class Matrix {
    private int [][] matrix;
    Matrix(int n, int num) {
        matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = num;
            }
        }
    }
    Matrix(int n) {
        matrix = new int[n][n];
        for (int i = 0; i != matrix.length; i++) {
            matrix[i][i] = 1;
        }
    }
    void show() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    Matrix sum(Matrix a) {
        if (this.matrix.length == a.matrix.length) {
            Matrix tmp = new Matrix(a.matrix.length);
            for (int i = 0; i < tmp.matrix.length; i++) {
                for (int j = 0; j < tmp.matrix.length; j++) {
                    tmp.matrix[i][j] = this.matrix[i][j] + a.matrix[i][j];
                }
            }
            return tmp;
        }
        else {
            System.out.println("не могу сложить с а, сложу с единичной матрицей");
            Matrix tmp = new Matrix(this.matrix.length);
            for (int i = 0; i < tmp.matrix.length; i++) {
                for (int j = 0; j < tmp.matrix.length; j++) {
                    tmp.matrix[i][j] = this.matrix[i][j] + tmp.matrix[i][j];
                }
            }
            return tmp;
        }
    }
    Matrix product(Matrix a) {
        if (this.matrix.length != a.matrix.length) {
            System.out.println("разные размеры");
            return this;
        }
        Matrix tmp = new Matrix(this.matrix.length, 0);
        for (int i = 0; i < tmp.matrix.length; i++) {
            for (int j = 0; j < tmp.matrix.length; j++) {
                for (int k = 0; k < tmp.matrix.length; k++) {
                    tmp.matrix[i][j] += this.matrix[i][k] * a.matrix[k][j];
                }
            }
        }
        return tmp;
    }
    void setElement(int row, int column, int value) {
        if ((row < 0 || row >= this.matrix.length) || (column < 0 || column >= this.matrix.length)) {
            System.out.println("выход за границы");
            return;
        }
        else {
            this.matrix[row][column] = value;
        }
    }
    int getElement(int row, int column) {
        if ((row < 0 || row >= this.matrix.length) || (column < 0 || column >= this.matrix.length)) {
            System.out.println("выход за границы");
            return 0;
        }
        else {
            return this.matrix[row][column];
        }
    }
//    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix.length; j++) {
                str.append(this.matrix[i][j] + " ");
            }
            str.append("\n");
        }
        return str.toString();
    }

    public Vector product(Vector v) {
        Vector tmp = new Vector(v.size(), 0);
        if (this.matrix.length != v.size()) {
            System.out.println("разные размеры");
            return tmp;
        }
        else {
            for (int i = 0; i < this.matrix.length; i++) {
                for (int j = 0; j < this.matrix[i].length; j++) {
                    tmp.vector[i] += this.matrix[i][j] * v.vector[i];
                }
            }
        }
        return tmp;
    }
}
