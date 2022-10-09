package com.gl.fssd.department.hr;
import com.gl.fssd.department.Department;
public class HrDepartment extends Department {
   /**
    * The strDeptName to use to store the department name
    */
    public String strDeptName = " HR Department ";
    /**
    * The strTodaysWork to use to store the todays work
    */
    public String strTodaysWork = " Fill today’s timesheet and mark your attendance ";
    /**
    * The strWorkDeadLine to use to store the work dead line 
    */
    public String strWorkDeadLine = " Complete by EOD ";
    /**
    * The strActivity to use to store the technical stack information
    */
    public String strActivity = " team Lunch ";
    /** 
    * Class constructor.
    */
    public HrDepartment(){
        super();
    }//End of constructor
    /**
    * Returns a department name in string  that can then be used by caller to know the department name 
    * <p>
    * This method always returns immediately, whether or not the 
    * department name empty / null.
    * 
    * @return  strDeptName    the departmentName
    * 
    */
    public String departmentName(){
        return strDeptName;
    }//End of departmentName()
    /**
    * Returns a todays work  in string  that can then be used by caller to know the todays work. 
    * <p>
    * This method always returns immediately, whether or not the 
    * strTodaysWork / null.
    * 
    * @return   strTodaysWork   the Todays work
    * 
    */
    public String getTodaysWork(){
        return strTodaysWork;
    }//End of getTodaysWork()
    /**
    * Returns a work deadline   in string  that can then be used by caller to know the  work deadline.
    * <p>
    * This method always returns immediately, whether or not the 
    * strWorkDeadLine / null.
    * 
    * @return   strWorkDeadLine   the work deadline
    * 
    */    
    public String getWorkDeadline(){
        return strWorkDeadLine;
    }//End of getWorkDeadline()    
    /**
    * Returns the activity   in string  that can then be used by caller to know the activity to be performed
    * <p>
    * This method always returns immediately, whether or not the 
    * strActivity / null.
    * 
    * @return   strActivity   the activity to be done
    * 
    */     
    public String doActivity(){
        return strActivity;
    }//End of doActivity()
}//End of HrDepartment
