

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
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        City kw = new City();
        Robot karel = new Robot(kw, 1, 1, Direction.EAST);
        Robot tina = new Robot(kw, 2, 1, Direction.EAST);
        new Thing (kw, 1, 3);
        new Thing (kw, 1, 4);
        new Wall(kw, 1, 5, Direction.WEST);
        karel.move();
        karel.move();
        
        new Wall(kw, 2, 4, Direction.EAST);
        new Thing(kw, 2, 5);
        while(true){
        if(tina.frontIsClear())
            tina.move();
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
