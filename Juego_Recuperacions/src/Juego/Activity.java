package Juego;

import java.awt.Color;


import java.util.TimerTask;

import javax.swing.*;

public class Activity extends Thread{
	static JFrame jFramePrincipal;
	Menu menu;
	Juego juego;
	MyCanvas myCanvas;
	

	public Activity() {
		jFramePrincipal = new JFrame();
		jFramePrincipal.setBounds(300, 300, 800, 800);

	    myCanvas = new MyCanvas();
	    menu=new Menu(myCanvas);
		juego=new Juego(myCanvas);
		jFramePrincipal.add(myCanvas);
		jFramePrincipal.setVisible(true);
		
	
		
		this.start();
		
		
		

	}
	
	public void run(){
		while(true){
			
			//System.out.println("He entrado!!!!!! ");
			juego.procesarJuego();
			myCanvas.repaint();
			try {
				sleep(120);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

	public static void main(String[] args) {
		new Activity();

	}
}
