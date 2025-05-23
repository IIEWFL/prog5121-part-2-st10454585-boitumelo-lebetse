/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.compositioneg;

/**
 *
 * @author lab_services_student
 */
public class address {
    private String streetname;
    private int streetnumber;
    private String postalcode;
    private String province;
    private String country;

    public address() {
    }

    public address(String streetname, int streetnumber, String postalcode, String province, String country) {
        this.streetname = streetname;
        this.streetnumber = streetnumber;
        this.postalcode = postalcode;
        this.province = province;
        this.country = country;
    }

    
    
    public String getStreetname() {
        return streetname;
    }

    public void setStreetname(String streetname) {
        this.streetname = streetname;
    }

    public int getStreetnumber() {
        return streetnumber;
    }

    public void setStreetnumber(int streetnumber) {
        this.streetnumber = streetnumber;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "address{" + "streetname=" + streetname + ", streetnumber=" + streetnumber + ", postalcode=" + postalcode + ", province=" + province + ", country=" + country + '}';
    }
    
    
    
}
