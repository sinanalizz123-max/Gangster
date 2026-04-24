package javax.microedition.lcdui;

public class Font {
    public static final int STYLE_PLAIN = 0;
    public static final int SIZE_SMALL = 0;
    public static final int SIZE_MEDIUM = 0;
    public static final int FACE_SYSTEM = 0;
    public static final int FACE_PROPORTIONAL = 0;
    
    public static Font getFont(int face, int style, int size) {
        return new Font();
    }
    public static Font getDefaultFont() { return new Font(); }
    public int getHeight() { return 20; }
    public int stringWidth(String s) { return s.length() * 10; }
}
