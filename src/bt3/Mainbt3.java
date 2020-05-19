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
        // TODO code application logic here
        ShapeFactory s1 = ShapeFactory.getInstance(); 
        Shape s = s1.ve(ShapeType.tron);
        System.out.println(s.toString());
        
    }
    
}
