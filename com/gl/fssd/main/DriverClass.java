package com.gl.fssd.main;
import com.gl.fssd.department.hr.*;
import com.gl.fssd.department.admin.*;
import com.gl.fssd.department.technical.*;

public class DriverClass {
    public static void main(String[] args) {
        System.out.println("\n -------------------------------\n"); 
        AdminDepartment admin = new AdminDepartment();
        System.out.println(" Welcome to"+ admin.departmentName());
        System.out.println(admin.getTodaysWork());
        System.out.println(admin.getWorkDeadline());
        System.out.println(admin.isTodayAHoliday());
        System.out.println("\n -------------------------------\n"); 

        HrDepartment hrd = new HrDepartment();
        System.out.println(" Welcome to"+ hrd.departmentName());
        System.out.println(hrd.doActivity());
        System.out.println(hrd.getTodaysWork());
        System.out.println(hrd.getWorkDeadline());
        System.out.println(hrd.isTodayAHoliday());
        System.out.println("\n -------------------------------\n"); 

        TechnicalDepartment tech = new TechnicalDepartment();
        System.out.println(" Welcome to"+ tech.departmentName());  
        System.out.println(tech.getTodaysWork());
        System.out.println(tech.getWorkDeadline());  
        System.out.println(tech.getTechStackInformation());
        System.out.println(tech.isTodayAHoliday());
        System.out.println("\n -------------------------------\n"); 

    }//End of main method
}//End of DriverClass
