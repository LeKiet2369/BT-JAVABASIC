/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUAN_2;
import java.awt.*;
/**
 *
 * @author Admin
 */
public class inTerface extends Frame{
    public inTerface(String title){
        super(title);
        this.setBounds(100,150,200,200);
        this.setVisible(true);
        
    }
    public static void main(String [] args){
        new inTerface("First App");
    }
    
            
    
}
