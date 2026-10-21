/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uprajnenie4;

/**
 *
 * @author students
 */
public abstract class Domashnojivotno {
    public int kilogrami;
    public String idnomer;
    public String zvuk;
    
    public Domashnojivotno(int kilogrami, String idnomer, String zvuk){
        this.kilogrami=kilogrami;
        this.idnomer=idnomer;
        this.zvuk=zvuk;
    }
    abstract void Zvuk();
    abstract void Info();
    
        
}
