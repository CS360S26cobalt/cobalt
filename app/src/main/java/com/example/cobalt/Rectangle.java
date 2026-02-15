package com.example.cobalt;

import androidx.activity.BackEventCompat;

public class Rectangle extends Shape {
    private int width;
    private int height;
    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
