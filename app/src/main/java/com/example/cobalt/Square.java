package com.example.cobalt;

public class Square extends Shape {
    private int side;
    public Square(int x, int y, int side) {
        super(x, y);
        this.side = side;
        }
    public int getSide() {
        return side;
    }

}
