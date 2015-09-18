
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
 * @author dawsr2694
 */
public class BranchExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Make City
        City kw = new City();
        
        //Make Robot
        Robot karel = new Robot(kw, 1, 1, Direction.EAST);
        karel.setLabel("K");
        
        Robot jim = new Robot(kw, 4, 1, Direction.EAST);
        jim.setLabel("J");
        
        //Make Walls
        new Wall(kw, 1, 1, Direction.EAST);
        new Wall(kw, 4, 6, Direction.EAST);
        
        //Move Robot
        if( karel.frontIsClear() ){
            karel.move();
        }else if( karel.canPickThing() ){
            karel.turnLeft();
            karel.move();
        }else if( karel.countThingsInBackpack() <= 10){
            
        }else{
            
        }
        
//WORKING WITH WHILE STATEMENTS
        
        while( true ){
            if( jim.frontIsClear() ){
                jim.move();
            }else{
                break;
            }

        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
