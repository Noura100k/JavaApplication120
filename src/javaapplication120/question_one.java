/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication120;

/**
 *
 * @author msi9
 */
public class question_one {
    
    private String Name;
    private String Postion;
    private int Experience;
    private String Educational;
    private String Time;
    private float Salary;
    
    question_one(String Name,String Postion,float Salary,int Experience,String Educational,String Time)
    {
        this.Name=Name;
        this.Postion=Postion;
        this.Experience=Experience;
        this.Educational=Educational;
        this.Time=Time;
        this.Salary=Salary;
        
        
        
    }
    
  
  void setName (String Name)
            
    {
        this.Name=Name;
    }
  
     void setPostion (String Postion )
            
    {
        this.Postion =Postion ;
    }
   void setExperience (int Experience)
            
    {
        this.Experience=Experience;
    }
    void setSalary(float Salary)
            
    {
        this.Salary=Salary;
    }
      void setEducational (String Educational)
            
    {
        this.Educational=Educational;
      
    }
      
      String getName (String Name)
            
    {
        return Name;
    }
 
     String getPostion (String Postion )
            
    {
       return Postion ;
    }
   int getExperience (int Experience)
            
    {
        return Experience;
    }
      String getEducational (String Educational)
            
    {
        return Educational;
    }
     
      
  
   
      
    void display()
    {
  System.out.println("Name: "+Name);

          if (Educational.equalsIgnoreCase("Bachelor")){
               
    
                
        System.out.println(" the salary is: "+(Salary+(Salary * 0.5 * Experience))+500);
  
            
            
        }
        else if (Educational.equalsIgnoreCase("diploma")){
            
          System.out.println(" the salary is: "+(Salary+(Salary * 0.5 * Experience))+250);
        
        }
        else{
             System.out.println(" the salary is: "+(Salary+(Salary * 0.5 * Experience)));
             
         
        }
         if(Time.equalsIgnoreCase("Full-Time")){
        
           System.out.println(" the Bouns is: "+(Salary+0.3));
        
        }else{
              System.out.println(" the Bouns is: "+(Salary+0.015));
        }
       
    }
  
    
}
