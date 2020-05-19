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
public class Rectangle extends Shape{
    Shape shape;
    
    @Override
    public String draw() {
        shape.setBrush("But long");
        shape.setPaper("Giay A4");
        shape.setFrame("Hinh Vuong");
        return shape.getBrush() + "\n" + shape.getPaper()+"\n" + shape.getFrame();
    }
    
}
