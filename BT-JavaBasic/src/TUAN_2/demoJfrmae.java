/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUAN_2;

import javax.swing.JFrame;


/**
 *
 * @author Admin
 */
public class demoJfrmae extends JFrame{
    public demoJfrmae(){
        setTitle("First Swing");
        this.setBounds(100,150,200,200);
        this.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
       
    }
    public static void main(String[] args) {
        demoJfrmae objFrame = new demoJfrmae();
        
    }    
        
    
}
