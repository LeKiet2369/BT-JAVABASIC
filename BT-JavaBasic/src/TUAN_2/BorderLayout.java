/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUAN_2;

import java.awt.Color;
import java.awt.LayoutManager;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class BorderLayout extends JFrame{
    public static void main(String [] args){
        BorderLayout pnBorder = new BorderLayout();
        pnBorder.setSize(400,300);
        pnBorder.setLocationRelativeTo(null);
        pnBorder.setVisible(true);
        
        
    }
    public BorderLayout(){
        super("Demo Window");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel uiBorder = new JPanel();
        uiBorder.setLayout((LayoutManager) new BorderLayout());
        JPanel pnNorth = new JPanel();
        pnNorth.setBackgound(Color.RED);
    }
    
}
