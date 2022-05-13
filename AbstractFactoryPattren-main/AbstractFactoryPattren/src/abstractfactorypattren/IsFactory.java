
package abstractfactorypattren;


public class IsFactory extends AbstractFactory {
    
    @Override
    public  Staff getStaff(String StaffType){
        
        if(StaffType.equalsIgnoreCase("ISDOCTOR"))
        {
            return new IsDoctor();
        }
        else if(StaffType.equalsIgnoreCase("ISTEACHINGASSITANT"))
                {
                return new IsTeachingAssistant();
                }
                  return null;
    }
}
