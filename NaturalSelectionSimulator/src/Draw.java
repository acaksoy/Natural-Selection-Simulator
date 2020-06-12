
import java.awt.*;
import java.lang.Runnable;

import java.awt.image.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Draw extends JPanel implements Runnable {
	private int CoordX;
	private int CoordY;
	private String RoG;
	private BufferedImage GrassImage;
	
	
	
	
	Draw(){
		//Panel
		setSize(1000,800);
		setBackground(new Color(0, 100, 0)); 
	}
	public void sendData(int x, int y, String Type){
		CoordX = x;
		CoordY = y;
		RoG = Type;
		try{
			GrassImage = ImageIO.read(getClass().getResourceAsStream("/Grass.png"));
		}catch(IOException e){
			e.printStackTrace();
		}
		repaint();
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		if(RoG == "Rabbit"){
			g.setColor(Color.DARK_GRAY);
			g.fillOval(CoordX, CoordY, 40, 40); 
			//g.fillOval(CoordX+10, CoordY+30, 40, 40);
		}
		else if(RoG == "Grass"){
			g.drawImage(GrassImage, CoordX, CoordY, 50, 50, null);
			
		}
		
	}
	public void run(){  
		
	
	}

}