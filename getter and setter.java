public class GetterSetterExample   
{  
    public salary;  
      
    public storeSalaryDB(int salary)  
    {  
        // code for storing the salary in the database  
    }  
      
    // main method  
    public static void main(String argvs[])   
    {  
      GetterSetterExample obj = new GetterSetterExample();      
        
      obj.salary = 100000;  
        
      // storing salary in database  
      obj.storeSalaryDB(salary);  
  
    }  
}  