//code by CW Coleman
//save as JavaPlot.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Wait {
  public static void oneSec() {
    try {
      Thread.currentThread().sleep(1000);
       }
     catch (InterruptedException e) {
       e.printStackTrace();
       }
     }
  public static void manySec(long s) {
     try {
       Thread.currentThread().sleep(s * 1000);
       }
     catch (InterruptedException e) {
       e.printStackTrace();
       }
     }
      public static void millSec(long s) {
     try {
       Thread.currentThread().sleep(s);
       }
     catch (InterruptedException e) {
       e.printStackTrace();
       }
     }
}


public class JavaPlot extends JFrame {
   public JavaPlot()
   {
      super( "Java Plot" );
      setSize(1920,1080);
      setVisible( true );
   }
   public void paint( Graphics g ){
        // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		    // only change code below this line
        int x, y, h, k, t;
        int iRed, iGreen, iBlue, aiRed, aiGreen, aiBlue;//integer RGB
        double sRed, sGreen, sBlue;// double start RGB
        double eRed, eGreen, eBlue;// double end RGB
        double aRed, aGreen, aBlue;// ajust RGB
        x = 0;  y = 0; h = 0; k = 0; t = 0;
        double theta;
        iRed = 0;
        iGreen = 250;
        iBlue = 200;
        aiRed = 0;  // adjust integer Red
        for (x = 0;x <500;x++){
		        if (iRed > 255) iRed = 0;
            if (iRed < 0) iRed = 255;
            g.setColor(new Color(iRed,iGreen,iBlue));
          //  g.drawLine(h,k,800-h,600+k);
            g.drawLine(t-500,k,800+h,600+k);
            //iRed = iRed = aiRed
            iRed = iGreen + iRed;
            h = h - 10;
            k = k - 1;
            t = t + 20;
		        System.out.println("Ctrl+c to stop. t = " + t+" h= "+h+" k ="+k);
		        Wait.millSec(1);  // call to Wait class
            // only change code above this line
            // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
      }//end for
  }
// execute application
  public static void main( String args[] ){
    JavaPlot myobject = new JavaPlot();//change this
  	   	// adapter to handle only windowClosing event
        myobject.addWindowListener(
  			   new WindowAdapter() {
				      public void windowClosing( WindowEvent event )
				          {System.exit( 0 );}
                }  // end WindowAdapter
        ); // end call to addWindowListener
   }//end main
 }// end class Painter
