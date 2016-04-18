package Juego;

import java.awt.Color;
import java.awt.Graphics2D;

public class ElementoVisual {

	int x, y, w, h;
	Color color;

	public ElementoVisual() {

	}

	public void pintar(Graphics2D g) {

	}

	public void setCordenadas(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void setAnchoAlto(int w,int h){
		this.w=w;
		this.h=h;
	}
	public void setColor(Color c){
		this.color=c;
	}

}
