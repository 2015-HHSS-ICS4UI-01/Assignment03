
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alled7036
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw = new City();
        Robot karel = new Robot(kw, 2, 1, Direction.EAST);
        new Wall(kw, 2, 1, Direction.NORTH);
        new Wall(kw, 2, 2, Direction.NORTH);
        new Wall(kw, 2, 3, Direction.NORTH);
        new Wall(kw, 2, 4, Direction.NORTH);
        new Wall(kw, 4, 4, Direction.SOUTH);
        new Wall(kw, 4, 3, Direction.SOUTH);
        new Wall(kw, 4, 2, Direction.SOUTH);
        new Wall(kw, 4, 1, Direction.SOUTH);
        new Wall(kw, 4, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.EAST);
        new Wall(kw, 4, 4, Direction.EAST);
        new Thing(kw, 2, 2);
        new Thing(kw, 3, 2);
        new Thing(kw, 4, 1);
        new Thing(kw, 3, 3);
        new Thing(kw, 3, 4);
        new Thing(kw, 4, 4);
        
        while(karel.frontIsClear()){ 
           karel.move();
           if(karel.canPickThing()){
               karel.pickThing();
           }
        }
            while(!karel.frontIsClear()){
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft(); 
                karel.move();
                if(karel.canPickThing()){
                    karel.pickThing();
                    } 
              }
          while(karel.frontIsClear()){
                  karel.turnLeft();
                  karel.turnLeft();
                  karel.turnLeft();
                  karel.move();
          if(karel.canPickThing()){
                      karel.pickThing();
                      karel.move();
                      karel.pickThing();
                      karel.move();
                              
                  }
            
              }
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.pickThing();
        karel.move();
        karel.move();
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        while(karel.frontIsClear())
            karel.move();
        if(!karel.frontIsClear()){
            karel.turnLeft();
        }
        while(karel.frontIsClear()){
            karel.move();
        }
        
        
        
    }
}
