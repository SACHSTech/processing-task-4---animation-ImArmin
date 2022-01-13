import processing.core.PApplet;

public class Sketch extends PApplet {
	
public float inverseX;

public double circleX = 0;
public double circleY = 250;

public float circleWidth = 50;
public float circleHeight = 50;

public double speed = 5;

public boolean sun = true;
public boolean moon = false;

  // Called once at the beginning of execution. Size Is Set
  public void settings() {

	// Size Of House Picture
    size(400, 400);
  }

  // Called once at the beginning of execution. Background Of House Is Set
  public void setup() {
    background(51, 153, 255);
  }
  
  // Drawing
  public void draw() {

    if (sun == true) {

    // Backgound
    background(51, 153, 255);

    // Hill
    fill(0, 153, 0);
    ellipse((float) (width/1.21), (float) (height/1.14), width/2, height/2);

    // Hill
    fill(0, 153, 0);
    ellipse(width/4, (float) (height/1.08), width/2, height/2);

    // Hill
    fill(0, 153, 0);
    ellipse((float) (width/13.33), (float) (height/1.05), width/2, height/2);

    // Hill
    fill(0, 153, 0);
    ellipse((float) (width/1.08), (float) (height/1.05), width/2, height/2);

    // Grass
    fill(102, 255, 102);
    rect(0, (float) (height/1.18), width/1, height/1);

    // House Bricks
    fill(255, 204, 51);
    rect(width/4, (float) (height/2.58), width/2, height/2);

    // Door
    fill(153, 102, 0);
    rect((float) (width/2.29), (float) (height/1.43), width/8, (float) (height/5.33));

    // Window
    fill(255, 255, 255);
    rect((float) (width/3.57), (float) (height/1.43), width/8, height/8);

    // Window Roof
    fill(51, 0, 0);
    rect((float) (width/3.74), (float) (height/1.43), (float) (width/6.66), height/80);

    // Window
    fill(255, 255, 255);
    rect((float) (width/1.68), (float) (height/1.43), width/8, height/8);

    // Window Roof
    fill(51, 0, 0);
    rect((float) (width/1.72), (float) (height/1.43), (float) (width/6.66), height/80);

    // Window
    fill(255, 255, 255);
    rect((float) (width/3.57), height/2, (float) (width/5.33), height/8);

    // Window Roof
    fill(51, 0, 0);
    rect((float) (width/3.74), height/2, (float) (width/4.70), height/80);

    // Window
    fill(255, 255, 255);
    rect((float) (width/1.88), height/2, (float) (width/5.33), height/8);

    // Window Roof
    fill(51, 0, 0);
    rect((float) (width/1.92), height/2, (float) (width/4.71), height/80);

    // Door Handle
    fill(255, 204, 0);
    ellipse((float) (width/1.86), (float) (height/1.27), width/40, height/40);

    // House Chimny
    fill(255, 204, 51);
    rect((float) (width/1.60), height/5, width/16, (float) (height/5.71));

    // Chimny Exit
    fill(51, 0, 0);
    rect((float) (width/1.63), height/5, (float) (width/11.4), height/80);

    // House Roof
    fill(51, 0, 0);
    triangle(width/2, (float) (height/5.33), (float) (width/1.23), (float) (height/2.29), (float) (width/5.33), (float) (height/2.29));

      fill(246, 255, 51);
      ellipse(inverseX, (float)circleY, circleWidth, circleHeight);
      circleX += speed;
      circleY = (0.0009 * (Math.pow(circleX - width/2, 2))) + 40;
      inverseX = width - (float) circleX;

      if (circleY >= 300) {
        moon = true;
        sun = false;
        circleX = 0;
        circleY = 250;
      }
    }

    else if (moon == true) {

    // Background
    background(51, 51, 51);

    // Hill
    fill(0, 153, 0);
    ellipse((float) (width/1.21), (float) (height/1.14), width/2, height/2);

    // Hill
    fill(0, 153, 0);
    ellipse(width/4, (float) (height/1.08), width/2, height/2);

    // Hill
    fill(0, 153, 0);
    ellipse((float) (width/13.33), (float) (height/1.05), width/2, height/2);

    // Hill
    fill(0, 153, 0);
    ellipse((float) (width/1.08), (float) (height/1.05), width/2, height/2);

    // Grass
    fill(102, 255, 102);
    rect(0, (float) (height/1.18), width/1, height/1);

    // House Bricks
    fill(255, 204, 51);
    rect(width/4, (float) (height/2.58), width/2, height/2);

    // Door
    fill(153, 102, 0);
    rect((float) (width/2.29), (float) (height/1.43), width/8, (float) (height/5.33));

    // Window
    fill(255, 255, 255);
    rect((float) (width/3.57), (float) (height/1.43), width/8, height/8);

    // Window Roof
    fill(51, 0, 0);
    rect((float) (width/3.74), (float) (height/1.43), (float) (width/6.66), height/80);

    // Window
    fill(255, 255, 255);
    rect((float) (width/1.68), (float) (height/1.43), width/8, height/8);

    // Window Roof
    fill(51, 0, 0);
    rect((float) (width/1.72), (float) (height/1.43), (float) (width/6.66), height/80);

    // Window
    fill(255, 255, 255);
    rect((float) (width/3.57), height/2, (float) (width/5.33), height/8);

    // Window Roof
    fill(51, 0, 0);
    rect((float) (width/3.74), height/2, (float) (width/4.70), height/80);

    // Window
    fill(255, 255, 255);
    rect((float) (width/1.88), height/2, (float) (width/5.33), height/8);

    // Window Roof
    fill(51, 0, 0);
    rect((float) (width/1.92), height/2, (float) (width/4.71), height/80);

    // Door Handle
    fill(255, 204, 0);
    ellipse((float) (width/1.86), (float) (height/1.27), width/40, height/40);

    // House Chimny
    fill(255, 204, 51);
    rect((float) (width/1.60), height/5, width/16, (float) (height/5.71));

    // Chimny Exit
    fill(51, 0, 0);
    rect((float) (width/1.63), height/5, (float) (width/11.4), height/80);

    // House Roof
    fill(51, 0, 0);
    triangle(width/2, (float) (height/5.33), (float) (width/1.23), (float) (height/2.29), (float) (width/5.33), (float) (height/2.29));

    // Star
    fill(255, 255, 0);
    ellipse((float) (width/2.66), height/10, width/40, height/40);

    // Star
    fill(255, 255, 0);
    ellipse(width/2, (float) (height/13.33), width/40, height/40);

    // Star
    fill(255, 255, 0);
    ellipse((float) (width/2.29), height/10, width/40, height/40);

      fill(255, 255, 255);
      ellipse(inverseX, (float)circleY, circleWidth, circleHeight);
      circleX += speed;
      circleY = (0.0009 * (Math.pow(circleX - width/2, 2))) + 40;
      inverseX = width - (float) circleX;

      if (circleY >= 300) {
        sun = true;
        moon = false;
        circleX = 0;
        circleY = 250;
      }
    }
  }
}