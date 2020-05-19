/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt2;

/**
 *
 * @author FPT_2-4
 */
public class StringBuilder {
    String str;
    public static class MyStringBuilder
    {
        String str;
        String s;
        float f;
        boolean b;
        public MyStringBuilder()
        {
            
        }
        public MyStringBuilder addString (String s)
        {
            this.s = s;
            return this;
        }
        public MyStringBuilder addFloat (float f)
        {
            this.f = f;
            return this;
        }
        public MyStringBuilder addBool (boolean b)
        {
            this.b = b;
            return this;
        }
        public StringBuilder myStringBuilder()
        {
            return new StringBuilder(this);
        }
    }

    public StringBuilder(MyStringBuilder myStringBuilder) {
        this.str = myStringBuilder.str;
    }
    
}
