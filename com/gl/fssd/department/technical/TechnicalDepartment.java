package com.gl.fssd.department.technical;
import com.gl.fssd.department.Department;
public class TechnicalDepartment extends Department {
    /**
    * The strDeptName to use to store the department name
    */
    public String strDeptName = " Tech Department ";
    /**
    * The strTodaysWork to use to store the todays work
    */
    public String strTodaysWork = " Complete coding of module 1 ";
    /**
    * The strWorkDeadLine to use to store the work dead line 
    */
    public String strWorkDeadLine = " Complete by EOD ";
    /**
    * The strTechStackInfo to use to store the technical stack information
    */
    public String strTechStackInfo = " core Java ";
    /** 
    * Class constructor.
    */
    public TechnicalDepartment(){
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
    * Returns the technical stack information  in string  that can then be used by caller to know the technical stacck information
    * <p>
    * This method always returns immediately, whether or not the 
    * strTechStackInfo / null.
    * 
    * @return   strTechStackInfo   the technical stack information
    * 
    */     
    public String getTechStackInformation(){
        return strTechStackInfo;
    }//End of getTechStackInformation()
}//End of TechnicalDepartment class
