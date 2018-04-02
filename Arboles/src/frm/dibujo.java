package frm;

/**
 *
 * @author Erwin Geovani de Leon Chamam
 * Fecha de Creación 19/09/2011, 07:50:04 PM
 * Fecha de Ultima Modificación: 01/10/2011, 22:10
 * 
 * Clase: dibujo
 * Realiza la tarea de dibujar en un elemento Canvas 
 * la figura del ahorcado a pasos. 
 */

import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public class dibujo extends Canvas{
    //Variable parte: maneja los elementos a dibujar en Canvas
    private int parte = 4;
    
    //Variable ac(vector): almacena las partes activadas a dibujar
    //en canvas
    private int[] ac = new int[7];

    //Constructor de la Clase.
    public dibujo()
    {
        this.setSize (450, 450);
        Reset();
    }

    public void paint(Graphics g)
    {
        Color c;
        if (parte==1 || ac[1]==1)
        {
            ac[1]=1;
            //Marco del Ahorcado
            g.setColor(Color.black);
            g.fillRect(10,299,499,10 );
            g.fillRect(399,20,10,279 );
        }
        
        if (parte==2 || ac[2]==1)
        {
            ac[2]=1;
            //Marco del Ahorcado
            g.fillRect(200,50,200,10 );
            
        }
        
        if (parte==3 || ac[3]==1)
        {
            ac[3]=1;
            //Marco del Ahorcado
            g.fillRect(230,50,3,50 );
        }
        //Cuerpo del Ahorcado
            g.setColor(Color.BLUE);
            Graphics2D g2d = (Graphics2D)g;
            int width = 3;
            g2d.setStroke(new BasicStroke(width));

        if (parte==4 || ac[4]==1)
        {
            ac[4]=1;
            //Cabeza y Cuerpo
            g2d.drawOval(215, 100, 30, 30);
            g.fillRect(230,130,4,80 );
        }

        if (parte==5 || ac[5]==1)
        {
            ac[5]=1;
            //Piernas
            g2d.drawLine(230, 210, 200, 240);
            g2d.drawLine(233, 210, 263, 240);
        }

        if (parte==6|| ac[6]==1)
        {
            ac[6]=1;
            //Brazos
            g2d.drawLine(230, 130, 200, 160);
            g2d.drawLine(233, 130, 263, 160);
        }

    }
    
    //Metodo Reset: Borra los elementos dibujados en Canvas.
    public void Reset(){
        this.parte = 0;
        for (int x=1; x<=6;x++){
            ac[x]=0;
        }
    }
}