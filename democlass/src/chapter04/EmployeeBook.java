package chapter04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeBook
{
	 private String Eid;
	 private String Ename;
     private String Dept;
     private String Designation;
     private String DOB;
     private String DOJ;
     private String MS;
     private String DOM;
     public String get_Eid() {
	        return Eid;
	    }

	    public void set_Eid(String Eid) {
	    	System.out.println(" ");
	        this.Eid = Eid;
	    }
	    public String get_Ename() {
	        return Ename;
	    }

	    public void set_Ename(String Ename) {
	    	System.out.println(" ");
	        this.Ename = Ename;
	    }
	    public String get_Dept() {
	        return Dept;
	    }

	    public void set_Dept(String Dept) {
	    	System.out.println(" ");
	        this.Dept = Dept;
	    }
	    public String get_Designation() {
	        return Designation;
	    }

	    public void set_Designation(String Designation) {
	    	System.out.println(" ");
	        this.Designation = Designation;
	    }
	    public String get_DOB() {
	        return DOB;
	    }

	    public void set_DOB(String DOB) {
	    	System.out.println(" ");
	        this.DOB = DOB;
	    }
	    public String get_DOJ() {
	        return DOJ;
	    }

	    public void set_DOJ(String DOJ) {
	    	System.out.println(" ");
	        this.DOJ = DOJ;
	    }
	    public String get_MS() {
	        return MS;
	    }

	    public void set_MS(String MS) {
	    	System.out.println(" ");
	        this.MS = MS;
	    }
	    public String get_DOM() {
	        return DOM;
	    }

	    public void set_DOM(String DOM) {
	    	System.out.println(" ");
	        this.DOM = DOM;
	    }
	    public EmployeeBook(String Eid,String Ename,String Dept,String Designation,String DOB,String DOJ,String MS,String DOM)
	    {
	    	this.Eid=Eid;
	    	this.Ename=Ename;
	    	this.Dept=Dept;
	    	this.Designation=Designation;
	    	this.DOB=DOB;
	    	this.DOJ=DOJ;
	    	this.MS=MS;
	    	this.DOM=DOM;
	    }
}
