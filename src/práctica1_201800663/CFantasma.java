/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica1_201800663;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author v
 */
public abstract class CFantasma extends CJuego implements InterJuego{
    private Color cColor;
    private int iDireccion;
    
    CFantasma(Color cFondo, int posX, int posY){
        cColor = cFondo;
        super.iPosX = posX;
        super.iPosY = posY;
    }
    CFantasma(){
    }
    
    public void setDireccion(int iDirec){
        iDireccion=iDirec;
    }
    public int getDireccion(){
        return iDireccion;
    }
     public void setX(int PosX)
    {
      super.iPosX = PosX;
    }
    
    public void setY(int PosY){
      super.iPosY = PosY;
    }
    
    public int getX()
    {
        return (iPosX/25);
    }
    
    public int getY()
    {
        return (iPosY/25);
    }
    @Override
    public void paintElements(Graphics g) {
        g.setColor(cColor);
    }
    @Override
    public void moverElemento(int iEstado) {
         switch (iEstado){
             case PB:
                 this.iPosY +=25;
                 break;
             case PA: 
                 this.iPosY -=25;
                 break;
             case PA: 
                 this.iPosX -=25;
                 break;
             case PA:
                 this.iPosX += 25;
                 break;
         }

         
         
             
     }
        
    
}
    
    
    
    
    
    

