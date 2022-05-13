
package adapterpattern;

import java.math.BigDecimal;


public class MultiPlier implements MultiplyInterface{
    
        public BigDecimal bg1,bg2;    

public  MultiPlier(BigDecimal bg1){
    
    
     this.bg1=bg1;
}

    @Override
    public BigDecimal multiplay(BigDecimal bigdecimal) {
                 bg2 = bg1.multiply(bigdecimal);
         System.out.println("the multiplayof" +bg1 + "and"+ bigdecimal + "=" + bg2);
             return bg2;
    }

   
    
}
