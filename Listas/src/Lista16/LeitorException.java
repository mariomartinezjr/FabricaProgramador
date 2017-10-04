package Lista16;

import java.io.IOException;

public class LeitorException  extends Exception{
	
	public LeitorException(IOException ioe) {
		
	}

	public static void  LeitorException(IOException ioe) {
		
		ioe.printStackTrace();
	}

}
