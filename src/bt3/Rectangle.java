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
    //Shape shape;
    

    
    @Override
    public String draw() {
        setBrush("But long");
        setPaper("giay a1");
        setFrame("Hinh chu nhat");
        return getBrush()+"-" + getPaper()+"-" + getFrame();
    }
    
}
