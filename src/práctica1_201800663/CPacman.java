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
public abstract class CPacman extends CJuego implements InterJuego {
    private int iDireccion;
    private boolean isEat=true;
    private JLabel CPacman=new JLabel("V");
    
    CPacman(int iX,int iY, int iDirec){
        super.iPosX=iX;
        super.iPosY=iY;
        
    }
    
    CPacman(){
        super.iPosX=0;
        super.iPosY=0;
    }
    public void setX(int PosX){
        super.iPosX=PosX;
    }
    public void setY(int PosY){
        super.iPosY=PosY;
    }
    public int getX(){
        return(iPosX/25);
    }
    public int getY(){
        return(iPosY/25);
    }
    
    public void setDireccion(int iDirec){
        iDireccion=iDirec;
        
    }
    public int getDireccion(){
        return iDireccion;
    }

    /**
     *
     * @param g
     */
    @Override
    public void paintElements(Graphics g){
        switch(iDireccion){
            case DER:
                if(isEat){
                    g.setColor(Color.ORANGE);isEat=false; 
                }else{
                    g.setColor(Color.ORANGE);isEat=true;
                }
                    g.setColor(Color.BLACK);
                break;
            case IZQ:
                if(isEat){
                    g.setColor(Color.ORANGE);isEat=false;
                }else{
                    g.setColor(Color.ORANGE);isEat=true;
                }
                    g.setColor(Color.BLACK);
                break;
            case PA:
                if(isEat){
                    g.setColor(Color.ORANGE);isEat=false;
                }else{
                    g.setColor(Color.ORANGE);isEat=true;
                }
                    g.setColor(Color.BLACK);
                break;
            case PB:
                if(isEat){
                    g.setColor(Color.ORANGE);isEat=false;
                }else{
                    g.setColor(Color.ORANGE);isEat=true;
                }
                    g.setColor(Color.BLACK);
                break;    
        }
        
        
    }
    public void moverElement(int iEstado){
        switch(iEstado){
            case DER:
                this.iPosX +=25;
                break;
            case IZQ:
                this.iPosX -=25;
                break;    
            case PA:
                this.iPosY -=25;
                break;    
            case PB:
                this.iPosY +=25;
                break;    
        }
    }
    
    
}
