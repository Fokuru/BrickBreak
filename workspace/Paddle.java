import java.awt.*;

//
//  Class author:  Mr. M
//  Class editor:  Raley Wilkin
//  Date first edited:  12/3/2024
//  General description: Holds all code for the paddle.
//
public class Paddle {
	//Instance variables:
	private int width;
	private int height;
	private int x;
	private int y;
	private int velocity;
	
	//Constructor:
	public Paddle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	//Methods:
	public void draw(Graphics g) {
		g.setColor(Color.green);
        g.fillRect(x, y, width, height);
	}
	
	/*
      Pre-condition: No imput.
      Post-condition: Returns the y position of the paddle.
    */
	public int getY() {
		return y;
	}

	/*
      Pre-condition: No imput.
      Post-condition: Returns the x position of the paddle.
    */
	public int getX() {
		return x;
	}

	/*
      Pre-condition: No imput.
      Post-condition: Returns the width of the paddle.
    */
	public int getWidth() {
		return width;
	}

	/*
      Pre-condition: No imput.
      Post-condition: Returns the height of the paddle.
    */
	public int getHeight() {
		return height;
	}

	/*
      Pre-condition: An int which is a whole number.
      Post-condition: Sets velocity to whatever number is imputed.
    */
	public int getVelocity() {
		return velocity;
	}

	/*
      Pre-condition: No imput
      Post-condition: Adds the velocity to the paddle in the x direction, 
	   				  negitives automatically subtract.
    */
	public void move() {
		x += velocity;
	}

	/*
      Pre-condition: An int which is a whole number.
      Post-condition: Adds more velocity based on imputed number to velocity.
    */
	public void addVelocity(int velocity) {
		if (velocity < 6) {
		this.velocity += velocity;
		} else {
		}
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
      Post-condition: Sets velocity to whatever number is imputed.
    */
	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}

	/*
      Pre-condition: No imput.
      Post-condition: Reverses x velocity, making a positive a negative
	  				  or a negative a positive.
    */
	public void reverseVelocity() {
		velocity += -(velocity*2);
	}

}
