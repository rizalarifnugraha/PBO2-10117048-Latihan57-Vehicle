/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117048.latihan57.vehicle;

/**
 *
 * @author 
 * Nama : Rizal Arif Nugraha 
 * Nim : 10117048 
 * Kelas : PBO2 
 * Deskripsi Program : Program ini berisi tentang vehicle berupa bicycle dan
 *                     skateboard.
 */
public class Vehicle {
    private String myBrand;
    private String myModel;
    
    public Vehicle(){
        
    }

    public String getBrand() {
        return myBrand;
    }

    public String getModel() {
        return myModel;
    }

    public void setBrand(String myBrand) {
        this.myBrand = myBrand;
    }

    public void setModel(String myModel) {
        this.myModel = myModel;
    }
    
    
}
