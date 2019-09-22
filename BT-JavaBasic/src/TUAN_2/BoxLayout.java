/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUAN_2;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;

/**
 *
 * @author Admin
 */
public class BoxLayout extends JFrame{
    public static void main(String[] args){
        BoxLayout pnBox = new BoxLayout ();
    }
    private Object pnBox;
    public BoxLayout(){
        setTitle("Second Swing");
        this.setBounds(100,150,200,200);
        this.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel pnBox = new JPanel();
        pnBox.setLayout(new BoxLayout(pnBox, BoxLayout.X_AXIS));
        JButton btn1 = new JButton("BoxLayout");
        btn1.setForeground(Color.RED);
        Font font = new Font("Arial", Font.BOLD / Font.ITALIC,25);
        btn1.setFont(font);
        pnBox.add( btn1);
        JButton btn2 = new JButton("X_AXIS");
        btn2.setForeground(Color.RED);
         btn2.setFont(font);
        pnBox.add( btn2);
        JButton btn3 = new JButton("X_AXIS");
        btn3.setForeground(Color.ORANGE);
         btn3.setFont(font);
        pnBox.add( btn3);
        
        Container con = getContentPane();
        con.add(pnBox);
        
    }
}
