/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUAN_2;

import java.awt.Color;
import java.awt.Container;
import java.awt.LayoutManager;
import java.awt.PopupMenu;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 *
 * @author Admin
 */
public class FlowLayout extends JFrame{
    public static void main(String [] args){
        FlowLayout pnFlow = new FlowLayout();
    }
    private Object pnFlow;
    public FlowLayout(){
        setTitle("First Swing");
        this.setBounds(100,150,200,200);
        this.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel pnFlow = new JPanel();
        pnFlow.setLayout(new java.awt.FlowLayout());
        pnFlow.setBackground(Color.yellow);
        JButton btn1 = new JButton("FlowLayout");
        JButton btn2 = new JButton("Add cac control");
        JButton btn3 = new JButton("Tren mot dong");
        JButton btn4 = new JButton("Het cho chua");
        JButton btn5 = new JButton("Thi xuong dong");
        pnFlow.add(btn1);
        pnFlow.add(btn2);
        pnFlow.add(btn3);
        pnFlow.add(btn4);
        pnFlow.add(btn5);
        Container con = getContentPane();
        con.add(pnFlow);
    }
    
}
