package com.example.group10_f2019_mad3125_fp;



import com.example.group10_f2019_mad3125_fp.model.employee.Employee;
import com.example.group10_f2019_mad3125_fp.model.employee.employeeType.Intern;
import com.example.group10_f2019_mad3125_fp.model.vehicle.Car;

import java.util.ArrayList;

public class Singleton {
    private static Singleton myObj;
    /**
     * Create private constructor
     */

    ArrayList<Employee> arrayListEmployee = new ArrayList<>();

    private Singleton() {
        Intern i1=new Intern("Ankita",24,"Lambton");
        Car c1=new Car("Swift","ABC123","Red",2018,20,4);
        i1.setVehicle(c1);
        addEmployee(i1);
    }

    /**
     * Create a static method to get instance.
     *
     * @return
     */
    public static Singleton getInstance() {
        if (myObj == null) {
            myObj = new Singleton();
        }
        return myObj;
    }

    public void addEmployee(Employee e) {
        arrayListEmployee.add(e);
    }

    public Employee getEmployeeByIndex(int index) {
        if (index < arrayListEmployee.size()) {
            return arrayListEmployee.get(index);
        }
        return null;
    }

    public ArrayList<Employee> getEmployees() {
        if (arrayListEmployee.size() > 0) {

            return arrayListEmployee;

        }
        return null;
    }


//    public void showdata(){
//        if (arrayListEmployee.size() > 0)
//        {
//            for(int i=0;i<arrayListEmployee.size();i++){
//               // System.out.println(arrayListEmployee.get(i).getVehicle().getPlate());
//            }
//        }
//    }

}
