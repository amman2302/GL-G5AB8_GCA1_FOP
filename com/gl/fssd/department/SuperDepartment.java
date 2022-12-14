package com.gl.fssd.department;
/**
* Department is the superclass for all departments, 
* which allow all other department classes to extend 
* @author      group - GL-G5AB8
*/
public class  SuperDepartment {
    /**
    * The strDeptName to use to store the department name
    */
    private String strDeptName = " Super Department ";
    /**
    * The strTodaysWork to use to store the todays work
    */
    private String strTodaysWork = " No Work as of now ";
    /**
    * The strWorkDeadLine to use to store the work dead line 
    */
    private String strWorkDeadLine = " Nil ";
    /**
    * The strTodayAHoliday to use to store whether today is holiday or not
    */
    private String strTodayAHoliday = " Today is not a holiday ";
    /** 
    * Class constructor.
    */
    public SuperDepartment(){
  
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
    * Returns a todays holiday   in string  that can then be used by caller to know the  whether todays is holiday or not.
    * <p>
    * This method always returns immediately, whether or not the 
    * strTodayAHoliday / null.
    * 
    * @return   strTodayAHoliday   the work deadline
    * 
    */     
    public String isTodayAHoliday(){
        return strTodayAHoliday;
    }//End of isTodayAHoliday()
}//End of SuperDepartment class
