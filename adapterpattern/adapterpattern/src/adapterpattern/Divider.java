
package adapterpattern;

import java.math.BigDecimal;

public class Divider implements DivideInterface {
    public BigDecimal bg1,bg2;    

    public  Divider(BigDecimal bg1){
     this.bg1=bg1;
}
    DivideAdapter obj;
     @Override
    public BigDecimal divide(BigDecimal bigdecimal, String operation) {
         if(operation.equalsIgnoreCase("divider")){
               bg2 = bg1.divide(bigdecimal);
         System.out.println("the dividerof" +bg1 + "and"+ bigdecimal + "=" + bg2);
             return bg2;
            }
        else if(operation.equalsIgnoreCase("multiplier")){
            obj=new DivideAdapter(bg1);
             return  obj.divide(bigdecimal,operation);
            }
        else return null;
    }
}
