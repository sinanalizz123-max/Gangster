package javax.microedition.lcdui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

public class Graphics {
    public Canvas canvas;
    private Paint paint = new Paint();

    public Graphics(Canvas canvas) {
        this.canvas = canvas;
    }

    public void drawImage(Image img, int x, int y, int anchor) {
        if (img != null && img.bitmap != null) {
            canvas.drawBitmap(img.bitmap, x, y, paint);
        }
    }

    public void setColor(int r, int g, int b) {
        paint.setARGB(255, r, g, b);
    }

    public void fillRect(int x, int y, int width, int height) {
        canvas.drawRect(x, y, x + width, y + height, paint);
    }
}
