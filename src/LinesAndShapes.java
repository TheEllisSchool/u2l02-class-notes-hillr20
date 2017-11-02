//Ricarda Hill
//October 27, 2017
//U2L02: The Graphics Class -> Shared In-class Notes

import java.awt.*;

public class LinesAndShapes extends DrawableAdapter {
	static LinesAndShapes ga = new LinesAndShapes();
	static GameBoard gb = new GameBoard(ga, "Lines and Shapes");
	
	public static void main(String[] args) {
		showGameBoard(gb);
	}
	
	public void draw (Graphics g){
		//change background color
		//draws/fills in colors in order
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 500, 600);
		
		//how to make a font - it's a thing
		Font myFont = new Font("Lucida Handwriting Italic ", Font.BOLD, 32);
		g.setFont(myFont);
		g.setColor(Color.WHITE);
		//g.drawString("RH Games", 100, 100);
		
		//make a rainbow
		/*
		g.setColor(Color.BLACK);
		
		g.drawArc(100, 300, 400, 450, 0, 180);
		//g.fillArc(arg0, arg1, arg2, arg3, arg4, arg5);
		g.fillArc(200, 380, 200, 250, 0, 180);
		g.drawArc(125, 320, 350, 400, 0, 180);
		g.drawArc(150, 340, 300, 350, 0, 180);
		g.drawArc(175, 360, 250, 300, 0, 180);
		g.drawArc(200, 380, 200, 250, 0, 180);
		g.setColor(Color.MAGENTA);
		g.fillArc(175, 360, 250, 300, 0, 180);*/
		
		//my initials; h
		g.drawOval(100, 100, 50, 50);
		g.drawOval(100, 150, 50, 50);
		g.drawOval(100, 200, 50, 50);
		g.drawOval(100, 250, 50, 50);
		g.drawOval(100, 300, 50, 50);
		g.drawOval(100, 350, 50, 50);
		g.drawOval(100, 400, 50, 50);
		
		g.drawOval(150, 250, 50, 50);
		g.drawOval(200, 250, 50, 50);
		g.drawOval(250, 250, 50, 50);
		
		g.drawOval(300, 100, 50, 50);
		g.drawOval(300, 150, 50, 50);
		g.drawOval(300, 200, 50, 50);
		g.drawOval(300, 250, 50, 50);
		g.drawOval(300, 300, 50, 50);
		g.drawOval(300, 350, 50, 50);
		g.drawOval(300, 400, 50, 50);
		
		//my initials; r
		g.drawOval(350, 100, 50, 50);
		g.drawOval(400, 100, 50, 50);
		g.drawOval(450, 100, 50, 50);
		g.drawOval(450, 150, 50, 50);
		g.drawOval(450, 200, 50, 50);
		g.drawOval(450, 250, 50, 50);
		g.drawOval(400, 250, 50, 50);
		g.drawOval(350, 250, 50, 50);
		
		g.drawOval(375, 295, 50, 50);
		g.drawOval(410, 330, 50, 50);
		g.drawOval(445, 365, 50, 50);
		
		//g.drawOval(485, 395, 50, 50);
		
		/*g.drawOval(400, 295, 50, 50);
		g.drawOval(420, 340, 50, 50);
		g.drawOval(440, 385, 50, 50);
		g.drawOval(485, 395, 50, 50);
		*/
		
		
		//draw lines around circles
		
		//g.drawLine(125, 75, 125, 325);
		g.drawLine(75, 75, 75, 475);
		g.drawLine(75, 75, 125, 75);
		g.drawLine(75, 475, 125, 475);
		
		g.drawLine(285, 475, 365, 475);
		g.drawLine(285, 475, 285, 425);
		g.drawLine(365, 475, 365, 425);
		
		g.drawLine(450, 75, 550, 75);
		
		g.drawLine(165, 325, 285, 325);
		g.drawLine(165, 225, 285, 225);
		//g.drawLine(125, 475, 175, 425);
		
		//fill lines in black
		//fill circles in w/ either white or assorted other colors...
		
		//make a planet
		//g.drawOval(55, 300, 200, 80);
		//g.drawArc(100, 100, , height, startAngle, arcAngle);
		
		//g.drawArc(x, y, width, height, startAngle, arcAngle);
		
		//make own color
		//Color myStrangeColor = new Color (50, 25, 80);
		//Color seafoamgreen = new Color(64, 239, 195);
		//g.setColor(seafoamgreen);
		
		//my initials
		/*g.setColor(Color.BLACK);
		g.drawLine(100, 100, 100, 200);
		g.drawArc(100, 100, 50, 50, 45, 360);
		g.drawLine(300, 50, 400, 100);*/
		
		/*g.setColor(Color.DARK_GRAY);
		g.drawRect(100, 170, 100, 600);
		g.fillRect(280, 170, 150, 140);
		
		g.setColor(Color.RED);
		g.drawOval(55, 300, 180, 80);
		g.setColor(Color.BLUE);
		g.fillOval(280, 300, 100, 100);*/
		/*int mx = 20;
	    int my = 20;
	    int ms = 120;
	    int mg = 120;

	    //public void (paintComponent(Graphics g2)) {
	    	//super.paintComponent(g);
	     Graphics2D g2 = (Graphics2D) g;
	     g2.setColor(Color.black);
	     g2.drawOval(mx, my, 100, 100);
	     g2.fillArc(mx, my, 100, 100, 0, 45);
	     g2.setColor(Color.blue);
	     g2.fillArc(mx, my, 100, 100, 0, 60);
	     g2.setColor(Color.white);
	     g2.fillArc(mx, my, 100, 100, 0, 20);
	     g2.setColor(Color.black);
	     g2.fillArc(mx, my, 100, 100, 0, 80);
	     g2.setColor(Color.black);
	     g2.fillArc(mx, my, 100, 100, 0, 95);
	        
	    */
		
	}

}
