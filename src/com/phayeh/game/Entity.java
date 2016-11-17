package com.phayeh.game;

import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

public class Entity {
	int x, dx, y, dy, speed, jump_height;
	
	BufferedImage image;
	AffineTransform at;
	//Image still;

	public Entity() {
		//ImageIcon i = new ImageIcon(path to character image);
		//still = i.getImage();
		x = 10;
		y = 172;
	}
	
	public void move(){
		x += dx;
		y += dy;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	//public Image getImage(){
	//	return still;
	//}
	
}
