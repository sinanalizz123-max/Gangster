package com.gameloft.gangstar.nativeport;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class GameView extends SurfaceView implements Runnable {
    private Thread gameThread = null;
    private SurfaceHolder surfaceHolder;
    private volatile boolean playing;
    private Paint paint;

    private defpackage.GloftGRIO midlet;
    private javax.microedition.lcdui.Graphics g;

    public GameView(Context context, defpackage.GloftGRIO midlet) {
        super(context);
        this.midlet = midlet;
        surfaceHolder = getHolder();
        paint = new Paint();
    }

    @Override
    public void run() {
        while (playing) {
            update();
            draw();
            control();
        }
    }

    private void update() {
        // The game loop is handled inside defpackage.a or defpackage.g (Runnable)
    }

    private void draw() {
        if (surfaceHolder.getSurface().isValid()) {
            Canvas canvas = surfaceHolder.lockCanvas();
            if (canvas != null) {
                if (g == null) g = new javax.microedition.lcdui.Graphics(canvas);
                else g.canvas = canvas;
                
                // Try to find the active canvas in the decompiled logic
                // This usually involves calling the paint(g) method of the current screen
                surfaceHolder.unlockCanvasAndPost(canvas);
            }
        }
    }

    private void control() {
        try {
            Thread.sleep(17);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void pause() {
        playing = false;
        try {
            gameThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void resume() {
        playing = true;
        gameThread = new Thread(this);
        gameThread.start();
    }
}
