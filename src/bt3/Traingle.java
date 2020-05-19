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
public class Traingle extends Shape{

    @Override
    public String draw() {
        setBrush("but chi");
        setPaper("Giay a4");
        setFrame("Hinh tam giac");
        return getBrush()+"-" + getPaper()+"-" + getFrame();
    }
    
}
