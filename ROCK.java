/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.workingwithclasses;

/**
 *
 * @author lilly
 */
public class ROCK {
   private String texture;
   private String color;
   private double size;

    public String getTexture() {
        return texture;
    }

    public String getColor() {
        return color;
    }

    public double getSize() {
        return size;
    }
    public void setTexture(String texture) {
        this.texture = texture;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "ROCK{" + "texture=" + texture + ", color=" + color + ", size=" + size + '}';
    }

    public ROCK() {
    }

    public ROCK(String texture) {
        this.texture = texture;
    }
  
}
