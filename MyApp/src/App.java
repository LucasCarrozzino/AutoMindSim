import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.*;

public class App {
		
    public static void main(String[] args) throws Exception {
        
    	Robot bot = new Robot();
    	Click(2380,875);
        Click(2748,319);       
        //ABCDEFGHIJKLMNOPQRSTUVWXYZ abcdeghijklmnopqrstuvwxyz
        String str = "0123456789";
        Type(str);  
    }
    
    public static void Click(int x, int y) throws Exception {
		Robot bot = new Robot();
		int mask = InputEvent.BUTTON1_DOWN_MASK;
		bot.mouseMove(x,y);           
        bot.mousePress(mask);     
        bot.mouseRelease(mask);
	}
	
	public static void Type(String str) throws Exception {
		Robot bot = new Robot();
        char c[] = str.toCharArray();
        bot.delay(100);
        for(int i=0; i<c.length;i++) {
        	switch(c[i]) {
        	case' ':bot.keyPress(KeyEvent.VK_SPACE);
        			bot.keyRelease(KeyEvent.VK_SPACE);
        			break;
        			
        	case 'a': bot.keyPress(KeyEvent.VK_A);
        		bot.keyRelease(KeyEvent.VK_A);
        		bot.delay(100);break;
        	
        	case 'A': bot.keyPress(KeyEvent.VK_SHIFT);
        	  bot.keyPress(KeyEvent.VK_A);
			  bot.keyRelease(KeyEvent.VK_A);
			  bot.keyRelease(KeyEvent.VK_SHIFT);
			  bot.delay(100);break;
			  
        	case 'b': bot.keyPress(KeyEvent.VK_B);
			  bot.keyRelease(KeyEvent.VK_B);
			  bot.delay(100);break;
			  
        	case 'B':bot.keyPress(KeyEvent.VK_SHIFT);
        	  bot.keyPress(KeyEvent.VK_B);
			  bot.keyRelease(KeyEvent.VK_B);
			  bot.keyRelease(KeyEvent.VK_SHIFT);
			  bot.delay(100);break;
			  
        	case 'c': bot.keyPress(KeyEvent.VK_C);
			  bot.keyRelease(KeyEvent.VK_C);
			  bot.delay(100);break;
			  
        	case 'C':bot.keyPress(KeyEvent.VK_SHIFT);
        		bot.keyPress(KeyEvent.VK_C);
			  bot.keyRelease(KeyEvent.VK_C);
			  bot.keyRelease(KeyEvent.VK_SHIFT);
			  bot.delay(100);break;
			  
        	case 'd': bot.keyPress(KeyEvent.VK_D);
			  bot.keyRelease(KeyEvent.VK_D);
			  bot.delay(100);break;
			  
        	case 'D': bot.keyPress(KeyEvent.VK_SHIFT);
        		bot.keyPress(KeyEvent.VK_D);
			  bot.keyRelease(KeyEvent.VK_D);
			  bot.keyRelease(KeyEvent.VK_SHIFT);
			  bot.delay(100);break;  
			
        	case 'e': bot.keyPress(KeyEvent.VK_E);
			  bot.keyRelease(KeyEvent.VK_E);
			  bot.delay(100);break;
			  
        	case 'E': bot.keyPress(KeyEvent.VK_SHIFT);
        		bot.keyPress(KeyEvent.VK_E);
			  bot.keyRelease(KeyEvent.VK_E);
			  bot.keyRelease(KeyEvent.VK_SHIFT);
			  bot.delay(100);break;  
			  
        	case 'f': bot.keyPress(KeyEvent.VK_F);
			  bot.keyRelease(KeyEvent.VK_F);
			  bot.delay(100);break;
			  
        	case 'F': bot.keyPress(KeyEvent.VK_SHIFT);
        		bot.keyPress(KeyEvent.VK_F);
			  bot.keyRelease(KeyEvent.VK_F);
			  bot.keyRelease(KeyEvent.VK_SHIFT);
			  bot.delay(100);break;
			  
        	case 'g': bot.keyPress(KeyEvent.VK_G);
			  bot.keyRelease(KeyEvent.VK_G);
			  bot.delay(100);break;
			  
        	case 'G': bot.keyPress(KeyEvent.VK_SHIFT);
        		bot.keyPress(KeyEvent.VK_G);
			  bot.keyRelease(KeyEvent.VK_G);
			  bot.keyRelease(KeyEvent.VK_SHIFT);
			  bot.delay(100);break;
			  
        	case 'h': bot.keyPress(KeyEvent.VK_H);
			  bot.keyRelease(KeyEvent.VK_H);
			  bot.delay(100);break;
			  
        	case 'H': bot.keyPress(KeyEvent.VK_SHIFT);
      		  bot.keyPress(KeyEvent.VK_H);
			  bot.keyRelease(KeyEvent.VK_H);
			  bot.keyRelease(KeyEvent.VK_SHIFT);
			  bot.delay(100);break;
			  
        	case 'i': bot.keyPress(KeyEvent.VK_I);
			  bot.keyRelease(KeyEvent.VK_I);
			  bot.delay(100);break;
			  
        	case 'I': bot.keyPress(KeyEvent.VK_SHIFT);
      		  bot.keyPress(KeyEvent.VK_I);
			  bot.keyRelease(KeyEvent.VK_I);
			  bot.keyRelease(KeyEvent.VK_SHIFT);
			  bot.delay(100);break; 
			  
        	case 'j': bot.keyPress(KeyEvent.VK_J);
			  bot.keyRelease(KeyEvent.VK_J);
			  bot.delay(100);break;
			  
        	case 'J': bot.keyPress(KeyEvent.VK_SHIFT);
      		  bot.keyPress(KeyEvent.VK_J);
			  bot.keyRelease(KeyEvent.VK_J);
			  bot.keyRelease(KeyEvent.VK_SHIFT);
			  bot.delay(100);break;
			  
        	case 'k': bot.keyPress(KeyEvent.VK_K);
			  bot.keyRelease(KeyEvent.VK_K);
			  bot.delay(100);break;
			  
        	case 'K': bot.keyPress(KeyEvent.VK_SHIFT);
      		  bot.keyPress(KeyEvent.VK_K);
			  bot.keyRelease(KeyEvent.VK_K);
			  bot.keyRelease(KeyEvent.VK_SHIFT);
			  bot.delay(100);break; 
			  
        	case 'l': bot.keyPress(KeyEvent.VK_L);
			  bot.keyRelease(KeyEvent.VK_L);
			  bot.delay(100);break;
			  
        	case 'L': bot.keyPress(KeyEvent.VK_SHIFT);
      		  bot.keyPress(KeyEvent.VK_L);
			  bot.keyRelease(KeyEvent.VK_L);
			  bot.keyRelease(KeyEvent.VK_SHIFT);
			  bot.delay(100);break;
			  
        	case 'm': bot.keyPress(KeyEvent.VK_M);
			  bot.keyRelease(KeyEvent.VK_M);
			  bot.delay(100);break;
			  
        	case 'M': bot.keyPress(KeyEvent.VK_SHIFT);
      		  bot.keyPress(KeyEvent.VK_M);
			  bot.keyRelease(KeyEvent.VK_M);
			  bot.keyRelease(KeyEvent.VK_SHIFT);
			  bot.delay(100);break;
			
        	case 'n': bot.keyPress(KeyEvent.VK_N);
			  bot.keyRelease(KeyEvent.VK_N);
			  bot.delay(100);break;
			  
        	case 'N': bot.keyPress(KeyEvent.VK_SHIFT);
      		  bot.keyPress(KeyEvent.VK_N);
			  bot.keyRelease(KeyEvent.VK_N);
			  bot.keyRelease(KeyEvent.VK_SHIFT);
			  bot.delay(100);break; 
			  
        	case 'o': bot.keyPress(KeyEvent.VK_O);
			  bot.keyRelease(KeyEvent.VK_O);
			  bot.delay(100);break;
			  
        	case 'O': bot.keyPress(KeyEvent.VK_SHIFT);
      		  bot.keyPress(KeyEvent.VK_O);
			  bot.keyRelease(KeyEvent.VK_O);
			  bot.keyRelease(KeyEvent.VK_SHIFT);
			  bot.delay(100);break; 
			  
        	case 'p': bot.keyPress(KeyEvent.VK_P);
			  bot.keyRelease(KeyEvent.VK_P);
			  bot.delay(100);break;
			  
        	case 'P': bot.keyPress(KeyEvent.VK_SHIFT);
      		  bot.keyPress(KeyEvent.VK_P);
			  bot.keyRelease(KeyEvent.VK_P);
			  bot.keyRelease(KeyEvent.VK_SHIFT);
			  bot.delay(100);break; 
			  
        	case 'q': bot.keyPress(KeyEvent.VK_Q);
			  bot.keyRelease(KeyEvent.VK_Q);
			  bot.delay(100);break;
			  
        	case 'Q': bot.keyPress(KeyEvent.VK_SHIFT);
      		  bot.keyPress(KeyEvent.VK_Q);
			  bot.keyRelease(KeyEvent.VK_Q);
			  bot.keyRelease(KeyEvent.VK_SHIFT);
			  bot.delay(100);break; 
			  
        	case 'r': bot.keyPress(KeyEvent.VK_R);
			  bot.keyRelease(KeyEvent.VK_R);
			  bot.delay(100);break;
			  
        	case 'R': bot.keyPress(KeyEvent.VK_SHIFT);
      		  bot.keyPress(KeyEvent.VK_R);
			  bot.keyRelease(KeyEvent.VK_R);
			  bot.keyRelease(KeyEvent.VK_SHIFT);
			  bot.delay(100);break; 
			  
        	case 's': bot.keyPress(KeyEvent.VK_S);
			  bot.keyRelease(KeyEvent.VK_S);
			  bot.delay(100);break;
			  
        	case 'S': bot.keyPress(KeyEvent.VK_SHIFT);
      		  bot.keyPress(KeyEvent.VK_S);
			  bot.keyRelease(KeyEvent.VK_S);
			  bot.keyRelease(KeyEvent.VK_SHIFT);
			  bot.delay(100);break; 
			  
        	case 't': bot.keyPress(KeyEvent.VK_T);
			  bot.keyRelease(KeyEvent.VK_T);
			  bot.delay(100);break;
			  
        	case 'T': bot.keyPress(KeyEvent.VK_SHIFT);
      		  bot.keyPress(KeyEvent.VK_T);
			  bot.keyRelease(KeyEvent.VK_T);
			  bot.keyRelease(KeyEvent.VK_SHIFT);
			  bot.delay(100);break; 
			  
        	case 'u': bot.keyPress(KeyEvent.VK_U);
			  bot.keyRelease(KeyEvent.VK_U);
			  bot.delay(100);break;
			  
        	case 'U': bot.keyPress(KeyEvent.VK_SHIFT);
      		  bot.keyPress(KeyEvent.VK_U);
			  bot.keyRelease(KeyEvent.VK_U);
			  bot.keyRelease(KeyEvent.VK_SHIFT);
			  bot.delay(100);break; 
			  
        	case 'v': bot.keyPress(KeyEvent.VK_V);
			  bot.keyRelease(KeyEvent.VK_V);
			  bot.delay(100);break;
			  
        	case 'V': bot.keyPress(KeyEvent.VK_SHIFT);
      		  bot.keyPress(KeyEvent.VK_V);
			  bot.keyRelease(KeyEvent.VK_V);
			  bot.keyRelease(KeyEvent.VK_SHIFT);
			  bot.delay(100);break; 
			  
        	case 'w': bot.keyPress(KeyEvent.VK_W);
			  bot.keyRelease(KeyEvent.VK_W);
			  bot.delay(100);break;
			  
        	case 'W': bot.keyPress(KeyEvent.VK_SHIFT);
      		  bot.keyPress(KeyEvent.VK_W);
			  bot.keyRelease(KeyEvent.VK_W);
			  bot.keyRelease(KeyEvent.VK_SHIFT);
			  bot.delay(100);break; 
			  
        	case 'x': bot.keyPress(KeyEvent.VK_X);
			  bot.keyRelease(KeyEvent.VK_X);
			  bot.delay(100);break;
			  
        	case 'X': bot.keyPress(KeyEvent.VK_SHIFT);
      		  bot.keyPress(KeyEvent.VK_X);
			  bot.keyRelease(KeyEvent.VK_X);
			  bot.keyRelease(KeyEvent.VK_SHIFT);
			  bot.delay(100);break; 
			  
        	case 'y': bot.keyPress(KeyEvent.VK_Y);
			  bot.keyRelease(KeyEvent.VK_Y);
			  bot.delay(100);break;
			  
        	case 'Y': bot.keyPress(KeyEvent.VK_SHIFT);
      		  bot.keyPress(KeyEvent.VK_Y);
			  bot.keyRelease(KeyEvent.VK_Y);
			  bot.keyRelease(KeyEvent.VK_SHIFT);
			  bot.delay(100);break; 
			  
        	case 'z': bot.keyPress(KeyEvent.VK_Z);
			  bot.keyRelease(KeyEvent.VK_Z);
			  bot.delay(100);break;
			  
        	case 'Z': bot.keyPress(KeyEvent.VK_SHIFT);
      		  bot.keyPress(KeyEvent.VK_Z);
			  bot.keyRelease(KeyEvent.VK_Z);
			  bot.keyRelease(KeyEvent.VK_SHIFT);
			  bot.delay(100);break; 
 // 		 CARACTERES ESPECIAIS~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        	case '/': bot.keyPress(KeyEvent.VK_ALT_GRAPH);
			bot.keyPress(KeyEvent.VK_Q);
			bot.keyRelease(KeyEvent.VK_Q);
			bot.keyRelease(KeyEvent.VK_ALT_GRAPH);
			bot.delay(100);break;
        		
        	case '\\': 
        	  bot.keyPress(KeyEvent.VK_BACK_SLASH);
			  bot.keyRelease(KeyEvent.VK_BACK_SLASH);
			  bot.delay(100);break;
			  
        	case '.': bot.keyPress(KeyEvent.VK_PERIOD);
			  bot.keyRelease(KeyEvent.VK_PERIOD);
			  bot.delay(100);break;
			  
        	case '_': bot.keyPress(KeyEvent.VK_SHIFT);
    		bot.keyPress(KeyEvent.VK_MINUS);
		  bot.keyRelease(KeyEvent.VK_MINUS);
		  bot.keyRelease(KeyEvent.VK_SHIFT);
			  bot.delay(100);break;
			
        	case '|': bot.keyPress(KeyEvent.VK_SHIFT);
        		bot.keyPress(KeyEvent.VK_BACK_SLASH);
			  bot.keyRelease(KeyEvent.VK_BACK_SLASH);
			  bot.keyRelease(KeyEvent.VK_SHIFT);
			  bot.delay(100);break; 
			  
        	case ':':bot.keyPress(KeyEvent.VK_SHIFT);
        		bot.keyPress(KeyEvent.VK_SEMICOLON);
			  bot.keyRelease(KeyEvent.VK_SEMICOLON);
			  bot.keyRelease(KeyEvent.VK_SHIFT);
			  bot.delay(100);break;
			  
        	case '<': bot.keyPress(KeyEvent.VK_SHIFT);
    			bot.keyPress(KeyEvent.VK_COMMA);
    			bot.keyRelease(KeyEvent.VK_COMMA);
    			bot.keyRelease(KeyEvent.VK_SHIFT);
    			bot.delay(100);break; 
    			
        	case '>': bot.keyPress(KeyEvent.VK_SHIFT);
    			bot.keyPress(KeyEvent.VK_PERIOD);
    			bot.keyRelease(KeyEvent.VK_PERIOD);
    			bot.keyRelease(KeyEvent.VK_SHIFT);
    			bot.delay(100);break;
    			
        	case '*': bot.keyPress(KeyEvent.VK_SHIFT);
    			bot.keyPress(KeyEvent.VK_8);
    			bot.keyRelease(KeyEvent.VK_8);
    			bot.keyRelease(KeyEvent.VK_SHIFT);
    			bot.delay(100);break;
    			
        	case '?': bot.keyPress(KeyEvent.VK_ALT_GRAPH);
    			bot.keyPress(KeyEvent.VK_W);
    			bot.keyRelease(KeyEvent.VK_W);
    			bot.keyRelease(KeyEvent.VK_ALT_GRAPH);
    			bot.delay(100);break;
			  
//			CARACTERES NUMERICOS~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~  
        	case '0': bot.keyPress(KeyEvent.VK_0);
			  bot.keyRelease(KeyEvent.VK_0);
			  bot.delay(100);break;  
			  
        	case '1': bot.keyPress(KeyEvent.VK_1);
			  bot.keyRelease(KeyEvent.VK_1);
			  bot.delay(100);break;
			  
        	case '2': bot.keyPress(KeyEvent.VK_2);
			  bot.keyRelease(KeyEvent.VK_2);
			  bot.delay(100);break;
			  
        	case '3': bot.keyPress(KeyEvent.VK_3);
			  bot.keyRelease(KeyEvent.VK_3);
			  bot.delay(100);break;
			  
        	case '4': bot.keyPress(KeyEvent.VK_4);
			  bot.keyRelease(KeyEvent.VK_4);
			  bot.delay(100);break;
			  
        	case '5': bot.keyPress(KeyEvent.VK_5);
			  bot.keyRelease(KeyEvent.VK_5);
			  bot.delay(100);break;
			  
        	case '6': bot.keyPress(KeyEvent.VK_6);
			  bot.keyRelease(KeyEvent.VK_6);
			  bot.delay(100);break;
			  
        	case '7': bot.keyPress(KeyEvent.VK_7);
			  bot.keyRelease(KeyEvent.VK_7);
			  bot.delay(100);break;  
			  
        	case '8': bot.keyPress(KeyEvent.VK_8);
			  bot.keyRelease(KeyEvent.VK_8);
			  bot.delay(100);break;
			  
        	case '9': bot.keyPress(KeyEvent.VK_9);
			  bot.keyRelease(KeyEvent.VK_9);
			  bot.delay(100);break; 
			  
			
        	}
        }
	}
}
