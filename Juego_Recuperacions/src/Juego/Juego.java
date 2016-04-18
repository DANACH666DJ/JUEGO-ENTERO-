package Juego;

import java.awt.Color;

public class Juego {

	
	MyCanvas miCanvas;
	Nave n,n3,n2;
	int iGravedad=5;
	
	
	public Juego(MyCanvas miCanvas){
		this.miCanvas=miCanvas;
		initNaves();
	}
	
	public void initNaves(){
		n=new Nave();
		n.setCordenadas(50, 70);
		n.setAnchoAlto(200, 300);
		miCanvas.setAñadirElementoVisual(n);
		n.setColor(Color.red);
		
		n2=new Nave();
		n2.setCordenadas(250, 70);
		n2.setAnchoAlto(200, 300);
		miCanvas.setAñadirElementoVisual(n2);
		n2.setColor(Color.yellow);
		
		n3=new Nave();
		n3.setCordenadas(450, 70);
		n3.setAnchoAlto(210, 300);
		miCanvas.setAñadirElementoVisual(n3);
		n3.setColor(Color.red);
		
		
	}
	public void procesarJuego(){
		n.procesarGravedad(5, miCanvas.getHeight());
		n2.procesarGravedad(15, miCanvas.getHeight());
		n3.procesarGravedad(25, miCanvas.getHeight());
	}
}
