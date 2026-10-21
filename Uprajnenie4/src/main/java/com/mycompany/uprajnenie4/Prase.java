/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uprajnenie4;

/**
 *
 * @author students
 */
public class  Prase extends Domashnojivotno {
    public String name;
    public Prase(int kilogrami, String idnomer, String zvuk, String name){
        super(kilogrami, idnomer, zvuk);
        this.name=name;
    }
    @Override void Zvuk(){
        System.out.println(name+"pravi Gruh Gruh");
    }
    @Override void Info(){
        System.out.println("Kilogrami: "+kilogrami);
        System.out.println("Idnomer:" +idnomer);
    }
}
