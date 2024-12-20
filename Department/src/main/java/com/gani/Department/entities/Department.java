package com.gani.Department.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long DepartmentID;
    String DepartmentName;
    String DepartmentAddress;
    String DepartmentCode;

    public Department() {
    }

    public Department(Long departmentID,String departmentName, String departmentAddress, String departmentCode) {
        DepartmentID=departmentID;
        DepartmentName = departmentName;
        DepartmentAddress = departmentAddress;
        DepartmentCode = departmentCode;
    }

    public Long getDepartmentID() {
        return DepartmentID;
    }

    public void setDepartmentID(Long departmentID) {
        DepartmentID = departmentID;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }

    public String getDepartmentAddress() {
        return DepartmentAddress;
    }

    public void setDepartmentAddress(String departmentAddress) {
        DepartmentAddress = departmentAddress;
    }

    public String getDepartmentCode() {
        return DepartmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        DepartmentCode = departmentCode;
    }
    
    

}