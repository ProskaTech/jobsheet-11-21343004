/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1_inheritance;

/**
 *
 * @author Azzahra Putri
 */
public class kedua extends pertama {
    private int b = 8;
    
    protected void BacaSuper(){
        System.out.println("Nilai b = " + b);
        terprotek();
        info();
    }
}
