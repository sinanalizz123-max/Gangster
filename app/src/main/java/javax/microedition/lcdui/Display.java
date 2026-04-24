package javax.microedition.lcdui;

import javax.microedition.midlet.MIDlet;

public class Display {
    public static Display getDisplay(MIDlet midlet) {
        return new Display();
    }
    
    public Displayable getCurrent() { return null; }
    public void setCurrent(Displayable d) {}
}
