
package adapterpattern;

import java.math.BigDecimal;

public class adapterpatterndemo {
    public static void main(String args[]){
        BigDecimal a = new BigDecimal("0.10");
        BigDecimal b = new BigDecimal("0.5");
       

     Divider opj=new Divider(a) ;  
       opj.divide(b,"Divider");
       opj.divide(b,"multiPlier");

    }
}
