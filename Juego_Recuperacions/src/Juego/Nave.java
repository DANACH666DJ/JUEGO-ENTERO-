package Juego;

import java.awt.Color;
import java.awt.Graphics2D;

public class Nave extends ElementoVisual {
	double dbVel=0;
	double dbAceleracion=0;
	public Nave() {
		x = 30;
		y = 30;
		w = 200;
		h = 200;
	}

	public void pintar(Graphics2D g) {
		super.pintar(g);
		g.setColor(color);
		g.fillRect(x, y, w, h);
	}

	public void procesarGravedad(double gravedad,int limiteSuelo) {
		double dbAceleracionTotal=gravedad+dbAceleracion;
		dbVel+=dbAceleracionTotal;
		y=(int)(y+dbVel);
		
		
		
       if((y+h)>limiteSuelo*0.7){
//   	   y += gravedad;
       dbAceleracion=-2;
      
    	   
	}else if(y<limiteSuelo*0.3){
		dbAceleracion=0;
	}
}
}
