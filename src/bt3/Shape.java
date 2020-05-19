/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3;

/**
 *
 * @author FPT_2-4
 */
public abstract class Shape {
    String brush;
    String paper;
    String frame;

    public String getBrush() {
        return brush;
    }

    public String getPaper() {
        return paper;
    }

    public String getFrame() {
        return frame;
    }

    @Override
    public String toString() {
        return "Shape{" + "brush=" + brush + ", paper=" + paper + ", frame=" + frame + '}';
    }
 
    public abstract String draw();
}
