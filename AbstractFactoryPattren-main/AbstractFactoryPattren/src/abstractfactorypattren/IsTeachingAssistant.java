package abstractfactorypattren;


public class IsTeachingAssistant implements Staff  {
    private int Salary;
   private int YearsOfWork;

   

    @Override

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    @Override
    public void setYearsOfWork(int YearsOfWork) {
        this.YearsOfWork = YearsOfWork;
    }

    public int getSalary() {
        return Salary;
    }

    public int getYearsOfWork() {
        return YearsOfWork;
    }
    
     @Override
    public void PrintSalary(){
        System.out.println("salaryof IsTeachingAssistant="+getSalary());
    }
     @Override
    public void PrintYearsOfWork(){
        System.out.println("yearsofwork of IsTeachingAssistant="+getYearsOfWork());
    }
}
