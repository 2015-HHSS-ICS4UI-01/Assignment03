
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alled7036
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        City kw = new City();
        Robot karel = new Robot(kw, 0, 3, Direction.WEST);
       new Wall(kw, 1, 1, Direction.NORTH);
       new Wall(kw, 1, 2, Direction.NORTH);
       new Wall(kw, 1, 1, Direction.WEST);
       new Wall(kw, 2, 1, Direction.WEST);
       new Wall(kw, 2, 2, Direction.EAST);
       new Wall(kw, 1, 2, Direction.EAST);
       new Wall(kw, 2, 2, Direction.SOUTH);
       new Wall(kw, 2, 1, Direction.SOUTH);
      
       int moveAmount = 3;
       while (moveAmount > 0) {
        karel.move();
        moveAmount--;
    }
        moveAmount -= 3; 
        karel.turnLeft();
        
       for (int moveCount = 3; moveCount > 0; moveCount = moveCount - 1) {
            karel.move();
        }
      karel.turnLeft();
              
       for (int moveCount = 3; moveCount > 0; moveCount = moveCount - 1) {
            karel.move();
        }
     karel.turnLeft();
     
     for (int moveCount = 3; moveCount > 0; moveCount = moveCount - 1) {
            karel.move();
        }
      karel.turnLeft();
     
     for (int moveCount = 3; moveCount > 0; moveCount = moveCount - 1) {
            karel.move();
        }
      karel.turnLeft();
     
     for (int moveCount = 3; moveCount > 0; moveCount = moveCount - 1) {
            karel.move();
        }
      karel.turnLeft();
     
     for (int moveCount = 3; moveCount > 0; moveCount = moveCount - 1) {
            karel.move();
        }
      karel.turnLeft();
      
      for (int moveCount = 3; moveCount > 0; moveCount = moveCount - 1) {
            karel.move();
        }
      karel.turnLeft();
      
      
     
     
    }
}
