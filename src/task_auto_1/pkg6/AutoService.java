/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task_auto_1.pkg6;


public class AutoService{
    
    String brand;

    public AutoService(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return brand;
    }

    public void setName(String name) {
        this.brand = brand;
    }  
      
    String initBrand;
    
    public String modify()
    {
        initBrand = this.brand; 
        brand = brand.toLowerCase().replaceAll("a", "o").replaceAll("i", "e");
        return brand;
    }

    @Override
    public String toString() {
        return ("Изначальное название: " + initBrand + 
                ", измененное название: " + brand);
    }
}