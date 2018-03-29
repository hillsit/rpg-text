package examples.JavaDev1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App extends Helper
{
	
	public static void main( String[] args )
    {
		while (1==1) {
			begin();
		}
    } 
	

	//     n
	//  w --- e
	//     s
	
	
	public static void begin() {
		say("You are in a cave." );
        say("You can go north (n) or south (s).");
        ask();
            
        if (is("1")) { // North
        	say("You see a diamonds.");
        	say("You can (1) pickup the diamonds, or (s) south.");
        	ask();
        	
        	if(is("1")) {
        		say ("The diamonds were booby trapped. You lose.");
        		return;
        	} else {
        		return;
        	}
        } else { // South
        	say("You a see a jigsaw puzzle with a picture of a baby dragon.");
        	say("You can (1) put the puzzle together, (n) North or (s) go South.");
        	ask();
        	if(is("1")) {
        		say("You put the puzzle together.");
        		say("The puzzle turns into a level 1 baby dragon.");
        		say("You are level " + level);
        		say("The dragon tries to eat you.");
        		say("You can (1) attack the dragon with your sword, (n) go North, or (s) go South.");
        		ask();
        		
        		if (is("1")) {;
        			if (fight(1)) {
        				say ("Momma Dragon appears behind you, and she is not happy.");
        				say ("She is level 3");
        				say("You are level " + level);
                		say("You can (1) attack the dragon with your sword, (n) go North, or (s) go South.");
                		ask() ;
                		
                		if (is("1")) { // Attack
                			if (fight(3)) {
                				say ("You win!");
                				return;
                			}
                		} else if (is("s")) {
                			say ("You are at the end of the tunnel.");
                			say ("You turn around and go back.");
                			return;
                		} else {
                			return;
                		}
                			
        			} else {
        				return;
        			}
        		} else if (is("n")) {
        			return;
        		} else {
        			say ("You are at the end of the tunnel.");
        			say ("You turn around and go back.");
        			return;
        		}
        	} else {
    			say ("You are at the end of the tunnel.");
    			say ("You turn around and go back.");
        		return;
        	}
        }
        
    }
}
