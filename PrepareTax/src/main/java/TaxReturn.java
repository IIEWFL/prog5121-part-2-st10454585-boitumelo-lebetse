/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.preparetax;

/**
 *
 * @author lab_services_student
 */
public class TaxReturn {
    private String SocialSecurity;
    private String LastName;
    private String FirstName;
    private String StreetAddress;
    private String City;
    private String State;
    private String ZipCode;
    private double AnnualIncome;
    private String MaritalStatus;
    private double TaxLiability;

    public TaxReturn() {
    }
    
    

    public String getSocialSecurity() {
        return SocialSecurity;
    }

    public void setSocialSecurity(String SocialSecurity) {
        this.SocialSecurity = SocialSecurity;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getStreetAddress() {
        return StreetAddress;
    }

    public void setStreetAddress(String StreetAddress) {
        this.StreetAddress = StreetAddress;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String ZipCode) {
        this.ZipCode = ZipCode;
    }

    public double getAnnualIncome() {
        return AnnualIncome;
    }

    public void setAnnualIncome(double AnnualIncome) {
        this.AnnualIncome = AnnualIncome;
    }

    public String getMaritalStatus() {
        return MaritalStatus;
    }

    public void setMaritalStatus(String MaritalStatus) {
        this.MaritalStatus = MaritalStatus;
    }

    public TaxReturn(String SocialSecurity, String LastName, String FirstName, String StreetAddress, String City, String State, String ZipCode, double AnnualIncome, String MaritalStatus) {
        this.SocialSecurity = SocialSecurity;
        this.LastName = LastName;
        this.FirstName = FirstName;
        this.StreetAddress = StreetAddress;
        this.City = City;
        this.State = State;
        this.ZipCode = ZipCode;
        this.AnnualIncome = AnnualIncome;
        this.MaritalStatus = MaritalStatus;
        
        
        this.TaxLiability = CalculateTax();
        
        
    }
    private double CalculateTax () {
        
        if (AnnualIncome <= 0 && AnnualIncome >= 20000){
            
        }
        
    }
        
    
}