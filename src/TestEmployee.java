/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin-jiahie
 */
public class TestEmployee {
       
    public static void main(String [] args){
        
        Employee emp1 = new Employee("JIAHIE", 1000.00);
        Employee emp2 = new Employee("WEIJIA");
        emp2.setSalary(4000.00);
        
        //part(c)
        if(emp1.getSalary()>emp2.getSalary()){
            System.out.println(emp1.getName() + "\t\t" +emp1.getSalary());
        }
        else{
            System.out.println(emp2.getName() +"\t"+emp2.getSalary());
        }
        
        System.out.println("Total :" + emp1.getSalary() + " + " + emp2.getSalary() + " = " + (emp1.getSalary() + emp2.getSalary())); 
        
        
        //System.out.println("Salary :" + emp1.salary);//Q1(a)
        System.out.println("Salary :" + emp1.getSalary());//Q1(b)
        emp1.raiseSalary(8.0);
        //System.out.println("Salary :" + emp1.salary);Q1(a)
        System.out.println("Salary :" + emp1.getSalary());//Q1(b)
        
        
        
        
    }
}
