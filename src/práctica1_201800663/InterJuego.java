/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica1_201800663;

import static java.awt.PageAttributes.MediaType.D;
import javafx.scene.input.KeyCode;
import static javafx.scene.input.KeyCode.S;
import static javafx.scene.input.KeyCode.W;

/**
 *
 * @author v
 */
public interface InterJuego {
    //movimiento de los personajes
    
    KeyCode PA=W;
    KeyCode PB=S;
    KeyCode IZQ=A;
    KeyCode DER= D;
    
    
    //Metodo para mover 
    void moverElemento(int iEstado);
    
}
