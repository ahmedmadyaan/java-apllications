
package abstractfactorypattren;


public class FactoryProducer {
    public static AbstractFactory getFactory (String Factory){
        if(Factory.equalsIgnoreCase("ITFACTORY"))
        {
            return new ItFactory();
        }
        else if(Factory.equalsIgnoreCase("ISFACTORY"))
                {
                return new IsFactory();
                }
         else if(Factory.equalsIgnoreCase("CSFACTORY"))
                {
                return new CsFactory();
                }
                  return null;
    }
}
        

