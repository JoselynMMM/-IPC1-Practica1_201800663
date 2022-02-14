/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica1_201800663;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;

/**
 *
 * @author v
 */
public abstract class CMoneda2 extends CJuego {
    
    private JLabel CMoneda2=new JLabel("@");
    
   CMoneda2(int X, int Y){
       super.iPosX=X;
       super.iPosY=Y;
   }
   CMoneda2(){
   }
   
   
   public void setX(int PosX){
       super.iPosX=PosX;
       
   }
   public void setY(int PosY){
       super.iPosY=PosY;
      
   }
   
   public int getX(){
       return (iPosX/25);
   }
   public int getY(){
       return (iPosY/25);
   }
   public void painElements(Graphics g){
     g.setColor(Color.YELLOW);
     
   }
}

