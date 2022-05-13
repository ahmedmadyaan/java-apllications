
package adapterpattern;

import java.math.BigDecimal;


public class DivideAdapter implements DivideInterface {
    MultiplyInterface opject;
    
public DivideAdapter(BigDecimal bg1){
    
     
       opject= new MultiPlier( bg1) ;
}

    @Override
    public BigDecimal divide(BigDecimal bigdecimal, String operation) {
       if(operation.equalsIgnoreCase("multiplier")){

             return  opject.multiplay( bigdecimal);
            }
        else return null;
    }
    
}
