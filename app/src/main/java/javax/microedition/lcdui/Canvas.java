package javax.microedition.lcdui;

public abstract class Canvas extends Displayable {
    public abstract void paint(Graphics g);
    public void repaint() {}
    public void serviceRepaints() {}
    public void setFullScreenMode(boolean mode) {}
    public int getWidth() { return 320; }
    public int getHeight() { return 240; }
}
