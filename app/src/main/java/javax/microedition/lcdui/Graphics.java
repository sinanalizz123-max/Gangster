package javax.microedition.lcdui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Bitmap;

public class Graphics {
    public Canvas canvas;
    private Paint paint = new Paint();
    private int tx, ty;

    public Graphics(Canvas canvas) {
        this.canvas = canvas;
    }

    public void translate(int x, int y) {
        tx += x;
        ty += y;
        canvas.translate(x, y);
    }

    public int getTranslateX() { return tx; }
    public int getTranslateY() { return ty; }

    public void setClip(int x, int y, int w, int h) {
        canvas.clipRect(x, y, x + w, y + h);
    }
    
    public void clipRect(int x, int y, int w, int h) {
        canvas.clipRect(x, y, x + w, y + h);
    }

    public int getClipX() { return canvas.getClipBounds().left; }
    public int getClipY() { return canvas.getClipBounds().top; }
    public int getClipWidth() { return canvas.getClipBounds().width(); }
    public int getClipHeight() { return canvas.getClipBounds().height(); }

    public void drawImage(Image img, int x, int y, int anchor) {
        if (img != null && img.bitmap != null) canvas.drawBitmap(img.bitmap, x, y, paint);
    }

    public void drawRegion(Image img, int x_src, int y_src, int width, int height, int transform, int x_dest, int y_dest, int anchor) {
        if (img != null && img.bitmap != null) {
            Rect src = new Rect(x_src, y_src, x_src + width, y_src + height);
            Rect dest = new Rect(x_dest, y_dest, x_dest + width, y_dest + height);
            canvas.drawBitmap(img.bitmap, src, dest, paint);
        }
    }

    public void drawRGB(int[] rgbData, int offset, int scanlength, int x, int y, int width, int height, boolean processAlpha) {
        canvas.drawBitmap(rgbData, offset, scanlength, x, y, width, height, processAlpha, paint);
    }

    public void setColor(int r, int g, int b) { paint.setARGB(255, r, g, b); }
    public void setColor(int rgb) { paint.setColor(0xFF000000 | rgb); }
    
    public void fillRect(int x, int y, int w, int h) { canvas.drawRect(x, y, x + w, y + h, paint); }
    public void drawRect(int x, int y, int w, int h) { 
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(x, y, x + w, y + h, paint); 
        paint.setStyle(Paint.Style.FILL);
    }
    
    public void drawString(String str, int x, int y, int anchor) { canvas.drawText(str, x, y, paint); }
    public void drawLine(int x1, int y1, int x2, int y2) { canvas.drawLine(x1, y1, x2, y2, paint); }
    public void fillArc(int x, int y, int w, int h, int start, int angle) { canvas.drawArc(x, y, x+w, y+h, start, angle, true, paint); }
    public void drawArc(int x, int y, int w, int h, int start, int angle) { 
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(x, y, x+w, y+h, start, angle, true, paint); 
        paint.setStyle(Paint.Style.FILL);
    }
    public void fillTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        android.graphics.Path path = new android.graphics.Path();
        path.moveTo(x1, y1);
        path.lineTo(x2, y2);
        path.lineTo(x3, y3);
        path.close();
        canvas.drawPath(path, paint);
    }
}
