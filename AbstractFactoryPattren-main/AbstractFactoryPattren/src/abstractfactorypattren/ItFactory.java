package abstractfactorypattren;


public class ItFactory extends AbstractFactory {
    
    @Override
    public  Staff getStaff(String StaffType){
        
        if(StaffType.equalsIgnoreCase("ITDOCTOR"))
        {
            return new ItDoctor();
        }
        else if(StaffType.equalsIgnoreCase("ITTEACHINGASSISTANT"))
                {
                return new ItTeachingAssistant();
                }
                  return null;
    }
}

