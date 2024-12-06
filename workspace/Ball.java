import java.awt.*;
import java.util.ArrayList;

//
//  Class author:  Mr. M
//  Class editor:  Raley Wilkin
//  Date first edited:  12/3/2024
//  General description: Holds all code for the ball.
//
public class Ball {
	//Instance variables:
	private int radius;
	private int x;
	private int y;
	private int velocityX = 1;
	private int velocityY = 1;

	//Constructor:
	public Ball(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	//methods:
	/*
      Pre-condition: Takes a graphic in.
      Post-condition: Draws the ball on the screen.
    */
	// FIX ME
	public void draw(Graphics g) {
		g.setColor(Color.pink);
		int i = 8;
		int[] theX = {this.x - i*2, this.x - i, this.x, this.x + i, this.x + i*2, this.x};
		int[] theY = {this.y, this.y - i*2, this.y - i, this.y - i*2, this.y, this.y + i*2};
		g.fillPolygon(theX, theY, 6);
	}

	/*
      Pre-condition: No imput.
      Post-condition: Returns the y position of the ball.
    */
	public int getYpos() {
		return y;
	}

	/*
      Pre-condition: No imput.
      Post-condition: Returns the x position of the ball.
    */
	public int getXpos() {
		return x;
	}

	/*
      Pre-condition: No imput.
      Post-condition: Returns the radius of the ball.
    */
	public int getSize() {
		return radius;
	}

	/*
      Pre-condition: No imput.
      Post-condition: Reverses y velocity, making a positive a negative
	  				  or a negative a positive.
    */
	public void reverseY() {
		velocityY += -(velocityY*2);
	}

	/*
      Pre-condition: No imput.
      Post-condition: Reverses x velocity, making a positive a negative
	  				  or a negative a positive.
    */
	public void reverseX() {
		velocityX += -(velocityX*2);
	}

	/*
      Pre-condition: An int which is a whole number.
      Post-condition: Sets x velocity to whatever number is imputed.
    */
	public void setXVelocity(int velocityX) {
		this.velocityX = velocityX;
	}

	/*
      Pre-condition: An int which is a whole number.
      Post-condition: Sets y velocity to whatever number is imputed.
    */
	public void setYVelocity(int velocityY) {
		this.velocityY = velocityY;
	}

	/*
      Pre-condition: An int which is a whole number.
      Post-condition: Sets x to whatever number is imputed.
    */
	public void setX(int x) {
		this.x = x;
	}

	/*
      Pre-condition: An int which is a whole number.
      Post-condition: Sets y to whatever number is imputed.
    */
	public void setY(int y) {
		this.y = y;
	}

	/*
      Pre-condition: No imput
      Post-condition: Adds the velocity to the ball in both directions, 
	   				  negitives automatically subtract.
    */
	public void move() {
		x += velocityX;
		y += velocityY;
	}

}
