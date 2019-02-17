package examples.JavaDev1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App2 extends Helper
{
	
	public static void main( String[] args )
    { while (1==1) {	begin();}   } 
	
	
	
	public static void begin() {
		say("You are in a car." );
        say("You can turn (r) right or (l) left. ");
        ask();
            
        if (is("r")) { 
        	say("There is a crosswalk with someone crossing. ");
        	say("You can (s) stop or (d) drive forward.");
        	ask();
        	
        	if(is("s")) {
        		say ("You stop for the person in the crosswalk. Good job!");
        		return;
        	} else {
        		say ("You drive around them without the noticing.");
        		return;
        	}
        } else if (is("l")) {
        	say ("You turn into someone's road. You don't know the name. You run into a pole.");
        	say ("There is a clink in the back. But you are sure you didn't pack anything in the trunk. ");
        	say ("You can (1) go outside and check it out, or (2) stand up and look.");
        	ask();
        	if (is("1")) {
        		say ("There is skeleton bones in your trunk.");
        		say ("To keep them in the trunk (1), to remove them from the trunk (2).");
        		ask();
        		if (is("1")) {
        			say ("You went back in the driver's seat.");        			
        			return;
        		} else if (is("2")) {
        			say ("You take them from the trunk and they start forming a skeleton.");
        			say ("It comes to life.");
        			say ("You can (1) fight it with your fist, or (2) get in your car and get out of there.");
        			ask();
        			if (is("1")) {
            			say ("You fight the skeleton.");
            			say ("You take one of its bones, but it's still walking around.");
            			say ("You can (1) fight the skeleton with the bone, or (2) drop the bone and leave!");
            			ask();
            			if (is("1")) {
            				say ("You knock all the bones off the skeleton.");
            				say ("You defeat the skeleton. You know it can come to life again, so you can either (1) break the bones, or (2) leave.");
            				ask();
            				if (is("1")) {
            					say ("The skeleton won't come back to life. Good job! You win.");
            					return;
            				} else {
            					say ("You went back in the driver's seat.");
            					say ("It comes back to life, but you leave. It will be someone else's problem.");
                    			return;       				
            				}
            			} else {
            				say ("You went back in the driver's seat.");
                			return;    
            			}
        			} else {
            			say ("You went back in the driver's seat.");
            			return;       				
        			}
        		}
        	} else {
        		say ("You lose.");
        		return;
        	}
        }
        		        
    }
}
