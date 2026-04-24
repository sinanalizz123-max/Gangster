package javax.microedition.lcdui;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.io.InputStream;
import javax.microedition.midlet.MIDlet;

public class Image {
    public Bitmap bitmap;

    public Image(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public static Image createImage(InputStream is) {
        return new Image(BitmapFactory.decodeStream(is));
    }

    public static Image createImage(String path) {
        try {
            InputStream is = MIDlet.activity.getAssets().open(path.startsWith("/") ? path.substring(1) : path);
            return createImage(is);
        } catch (Exception e) {
            return null;
        }
    }

    public static Image createImage(int w, int h) {
        return new Image(Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888));
    }

    public static Image createRGBImage(int[] rgb, int width, int height, boolean processAlpha) {
        return new Image(Bitmap.createBitmap(rgb, width, height, Bitmap.Config.ARGB_8888));
    }

    public void getRGB(int[] rgbData, int offset, int scanlength, int x, int y, int width, int height) {
        bitmap.getPixels(rgbData, offset, scanlength, x, y, width, height);
    }

    public int getWidth() { return bitmap.getWidth(); }
    public int getHeight() { return bitmap.getHeight(); }

    public Graphics getGraphics() {
        return new Graphics(new android.graphics.Canvas(bitmap));
    }
}
