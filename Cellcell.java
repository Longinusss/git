package cells;

import java.awt.Graphics;


public class Cellcell { 

  public Cellcell() {
  }
 
  private boolean alive = false;
 
  public void die() {
    alive = false; 
  }
  
  public void reborn() {
    alive = true; 
  }
  
  public boolean isAlive() {
    return alive;
  }

  public void draw(Graphics g1, int x1, int y1, int size) {
    g1.drawRect(x1, y1, size, size);
    if (alive) {
      g1.fillRect(x1, y1, size, size);
    }
  }
}
