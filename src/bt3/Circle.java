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
  
    @Override
    public String draw() {
        setBrush("But chi");
        setFrame("Hinh Tron");
        setPaper("Giay vo");
       return getBrush()+"-" + getPaper()+"-" + getFrame();
    }
    


    
    
}
