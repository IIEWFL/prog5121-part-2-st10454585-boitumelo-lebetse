/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.varsity.employeesystem;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class EmployeeSystem {

    public static void main(String[] args) {
        
        Employee emp1 = new Employee();

        String empNumber = JOptionPane.showInputDialog("Please give me an employee number =>");
        emp1.setEmpNumber(empNumber);
        
        String emailAddress = JOptionPane.showInputDialog("Please give me an employee email address =>");
        emp1.setEmailAdress(emailAddress);
        
        String salary = JOptionPane.showInputDialog("Please give me an employee salary =>");
        double salaryValue = Double.parseDouble(salary);
        emp1.setSalary(salaryValue);
        
        String title = JOptionPane.showInputDialog("Please give me employee title =>");
        emp1.setTitle(title);
        
        String name = JOptionPane.showInputDialog("Please enter employee name =>");
        emp1.setName(name);
        
        String surname = JOptionPane.showInputDialog("Please enter employee surname =>");
        emp1.setSurname(surname);
        
        String phoneNumber = JOptionPane.showInputDialog("Please enter employee number =>");
        emp1.setPhoneNumber(phoneNumber);
        
        String age = JOptionPane.showInputDialog("Please enter employee age =>");
        int ageValue = Integer.parseInt(age);
        emp1.setAge(ageValue);
        
        String gender =  JOptionPane.showInputDialog("Please give mr an employee gender =>");
        char genderValue = gender.charAt(0);
        emp1.setGender(genderValue);
        
        String seniority = JOptionPane.showInputDialog("Please give me an employee seniority =>");
        boolean isSenior = Boolean.valueOf(seniority);
        emp1.setIsSenior(isSenior);
        
        //Display the values
        JOptionPane.showConfirmDialog(null, "Employee number :: " + emp1.getEmpNumber() +
                "Employee Email Adress :: " + emp1.getEmailAddress() +
                "Employee salary :: " + emp1.getSalary() +
                "Employee Title :: " + emp1.getTitle() +
                "Employee Name :: " + emp1.getName() +
                "Employee Surname :: " + emp1.getSurname() +
                "Employee Phone Number :: " + emp1.getPhoneNumber() +
                "Employee Age :: " + emp1.getAge() +
                "Employee Gender :: " + emp1.getGender() +
                "Employee Seniority :: " + emp1.isIsSenior());
        
                
                
  
    }
}