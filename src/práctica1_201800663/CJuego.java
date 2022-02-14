/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica1_201800663;

import java.awt.Graphics;

/**
 *
 * @author v
 */
public abstract class CJuego {
    int iPosX;
    int iPosY;
    int iDireccion;
    
    public abstract void paintElements(Graphics g);
}
