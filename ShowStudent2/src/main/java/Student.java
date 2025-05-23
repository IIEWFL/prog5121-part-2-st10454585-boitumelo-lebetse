/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lab_services_student
 */
public class Student {
    private String IDnumber;
    private double CreditHours;
    private double PointsEarned;
    private double GradePoint;

    public Student(String IDnumber, double CreditHours, double PointsEarned, double GradePoint) {
        this.IDnumber = IDnumber;
        this.CreditHours = CreditHours;
        this.PointsEarned = PointsEarned;
        this.GradePoint = GradePoint;
    }

    public String getIDnumber() {
        return IDnumber;
    }

    public void setIDnumber(String IDnumber) {
        this.IDnumber = IDnumber;
    }

    public double getCreditHours() {
        return CreditHours;
    }

    public void setCreditHours(double CreditHours) {
        this.CreditHours = CreditHours;
    }

    public double getPointsEarned() {
        return PointsEarned;
    }

    public void setPointsEarned(double PointsEarned) {
        this.PointsEarned = PointsEarned;
    }

    public double getGradePoint() {
        return GradePoint;
    }

    public void setGradePoint(double GradePoint) {
        this.GradePoint = GradePoint;
    }
    
    
}
