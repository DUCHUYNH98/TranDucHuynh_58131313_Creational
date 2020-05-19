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
    String str = "";
    public static class MyStringBuilder
    {
        String str = "bai2";
        public MyStringBuilder()
        {
            
        }
        public MyStringBuilder addString (String s)
        {
            this.str = this.str.concat(s);
            return this;
        }
        public MyStringBuilder addFloat (float f)
        {
            String s = f +"";
            this.str = this.str.concat(s);
            return this;
        }
        public MyStringBuilder addBool (boolean b)
        {
            String s = b + "";
            this.str = this.str.concat(s);
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

    @Override
    public String toString() {
        return "StringBuilder{" + "str=" + str + '}';
    }
    
    
}
