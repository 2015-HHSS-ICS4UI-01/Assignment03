
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
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        City kw = new City();
        Robot karel = new Robot(kw, 1, 0, Direction.SOUTH);
        new Wall(kw, 1, 0, Direction.WEST);
        new Wall(kw, 2, 0, Direction.WEST);
        new Wall(kw, 3, 0, Direction.WEST);
        new Wall(kw, 4, 0, Direction.WEST);
        new Wall(kw, 1, 0, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 4, 0, Direction.SOUTH);
        new Wall(kw, 4, 1, Direction.SOUTH);
        new Wall(kw, 4, 2, Direction.SOUTH);
        new Wall(kw, 4, 3, Direction.SOUTH);
        new Wall(kw, 2, 3, Direction.EAST);
        new Wall(kw, 4, 3, Direction.EAST);
        new Wall(kw, 1, 3, Direction.EAST);
        
        while(true){
            while(karel.frontIsClear()){
                karel.move();
                if(karel.frontIsClear()){
                    karel.turnLeft();
                    karel.turnLeft();
                    karel.turnLeft();
             
                }
                     if(!karel.frontIsClear()){
                         karel.turnLeft();
                     }
                       
            }
        } 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
