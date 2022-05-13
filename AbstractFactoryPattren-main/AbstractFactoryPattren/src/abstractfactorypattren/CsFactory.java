package abstractfactorypattren;


public class CsFactory extends AbstractFactory {
    
    @Override
    public  Staff getStaff(String StaffType){
        
        if(StaffType.equalsIgnoreCase("CSDOCTOR"))
        {
            return new CsDoctor();
        }
        else if(StaffType.equalsIgnoreCase("CSTEACHINGASSITANT"))
                {
                return new CsTeachingAssistant();
                }     
                  return null;
    }
}
