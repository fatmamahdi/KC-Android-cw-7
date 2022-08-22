package com.example.myapplication;

import java.io.Serializable;

public class shapes implements Serializable {
    private String shapesName; //textView
    private int shapesImage;   //ImageView
    private String shapeColor;


    public shapes(String shapesName, int shapesImage, String shapeColor) {
        this.shapesName = shapesName;
        this.shapesImage = shapesImage;
        this.shapeColor = shapeColor;
    }

    public String getShapesName() {
        return shapesName;
    }

    public void setShapesName(String shapesName) {
        this.shapesName = shapesName;
    }

    public int getShapesImage() {
        return shapesImage;
    }

    public void setShapesImage(int shapesImage) {
        this.shapesImage = shapesImage;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }
}
