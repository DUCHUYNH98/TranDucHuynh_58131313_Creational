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
public class Mainbt3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShapeFactory shapeFactory = ShapeFactory.getInstance();
        Shape s = shapeFactory.createShape(ShapeType.tron);
        System.out.println(s.draw());
        Shape s1 = shapeFactory.createShape(ShapeType.hcn);
        System.out.println(s1.draw());
        Shape s2 = shapeFactory.createShape(ShapeType.tg);
        System.out.println(s2.draw());
        
    }
    
}
