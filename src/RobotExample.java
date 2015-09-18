
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
 * @author dawsr2694
 */
public class RobotExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // Make a city for the robot to live in
        City kw = new City();
        
        //make walls
        new Wall(kw, 3, 5, Direction.WEST);
        new Wall(kw, 1, 4, Direction.NORTH);
        
        //make a Thing
        new Thing(kw, 3, 4);
        
        // Make the robot to live in the city
        Robot george = new Robot(kw, 3, 4, Direction.EAST); 
        
        //Experiment with robot commands
        george.turnLeft();
        george.pickThing();
        george.move();
        george.move();
        
        george.putThing();
        george.turnLeft();
        george.move();
        george.move();
        
        
    }
}
