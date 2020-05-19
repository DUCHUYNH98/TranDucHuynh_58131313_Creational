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
public class Circle extends Shape{
    public Shape setBrush(String brush) {
        this.brush = brush;
        return this;
    }

    public Shape setPaper(String paper) {
        this.paper = paper;
        return this;
    }

    public Shape setFrame(String frame) {
        this.frame = frame;
        return this;
    }
    
   
    
    @Override
    public String draw() {
        setBrush("But chi");
        setFrame("Hinh Tron");
        setPaper("Giay vo");
       return "Hinh tron";
    }
    


    
    
}
