package javax.microedition.lcdui;

public abstract class Canvas {
    public abstract void paint(Graphics g);
    public void repaint() {}
    public int getWidth() { return 320; } // Default from manifest
    public int getHeight() { return 240; }
}
