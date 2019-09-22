/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUAN_2;

/**
 *
 * @author Admin
 */
public class giaiPTB2 {
    private float a;
    private float b;
    private float c;

    public giaiPTB2(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public String giaiPt(){
        String nghiem = "";
        if(a == 0){
            nghiem = "Phương trình có nghiệm x = " + (-a/b);
        }else{
             float denta = b*b - 4*a*c;  
             if(denta > 0){
                 nghiem = "X1 = "+ (-b + Math.sqrt(denta))/(2*a) + " X2 =" + (-b - Math.sqrt(denta))/(2*a); 
             }else if(denta == 0 ){
                 nghiem = "X1 = X2 = "+ (-b/(2*a));
             }else{
                 nghiem = "Phương trình vô nghiệm!";
             }
                }
            
            return nghiem;    
    }
}
