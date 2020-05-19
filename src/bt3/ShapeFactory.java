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
public class ShapeFactory {
    private static ShapeFactory instance;
    
    private ShapeFactory()
    {
        
    }
    public static ShapeFactory getInstance()
    {
        if (instance == null)
            instance = new ShapeFactory();
        return instance;
    }
    public Shape createShape(ShapeType shapeType)
    {
        
        switch(shapeType)
        {
            case hcn: return new Rectangle();
        
            case tron: return new Circle();
            
            case tg: return new Traingle();
                       
        }
        return null;
    }
    
}

