package com.mycompany.uprajnenie4;

public class Uprajnenie4 {

    public static void main(String[] args) {
       Krava krava = new Krava(200, "nomer2", "Muuu", "Penka");
       krava.Info();
       krava.Zvuk();
       
       Prase prase = new Prase(80, "nomer3", "Gruh Gruh", "Todor");
       prase.Info();
       prase.Zvuk();
       
       Kokoshka kokoshka = new Kokoshka(25, "nomer4", "Ko-ko-ko", "Koko");
       kokoshka.Info();
       kokoshka.Zvuk();
    }
}
