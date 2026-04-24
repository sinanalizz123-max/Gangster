package javax.microedition.midlet;

import android.content.Context;
import com.gameloft.gangstar.nativeport.MainActivity;

public abstract class MIDlet {
    public static MainActivity activity;

    public abstract void startApp();
    public abstract void pauseApp();
    public abstract void destroyApp(boolean unconditional);

    public final void notifyDestroyed() {
        if (activity != null) activity.finish();
    }
    
    public final String getAppProperty(String key) {
        return null;
    }
}
