
package abstractfactorypattren;


public class AbstractFactoryPattern {
    public static void main(String[] args){
        AbstractFactory abs =FactoryProducer.getFactory("ISFACTORY");
        
        Staff stf1=abs.getStaff("ISDOCTOR");
        stf1.setSalary(2500);
        stf1.setYearsOfWork(4);
        stf1.PrintSalary();
        stf1.PrintYearsOfWork();
        
        AbstractFactory abd =FactoryProducer.getFactory("CSFACTORY");
        
        Staff stf=abd.getStaff("CSTEACHINGASSITANT");
        stf.setSalary(3000);
        stf.setYearsOfWork(5);
        stf.PrintSalary();
        stf.PrintYearsOfWork();
        AbstractFactory l =FactoryProducer.getFactory("ITFACTORY");
        
        Staff stf3=l.getStaff("ITDOCTOR");
        stf3.setSalary(500);
        stf3.setYearsOfWork(2);
        stf3.PrintSalary();
        stf3.PrintYearsOfWork();
    }
}
