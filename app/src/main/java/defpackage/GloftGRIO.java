package defpackage;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

/* loaded from: Gangstar_Rio_Samsung_F480_EN_IGP_EU_TS_118.jar:GloftGRIO.class */
public final class GloftGRIO extends MIDlet {
    private static a a;

    /* renamed from: a, reason: collision with other field name */
    public static GloftGRIO f0a;

    public GloftGRIO() {
        f0a = this;
    }

    public final void startApp() {
        if (a == null) {
            a aVar = new a(this, Display.getDisplay(this));
            a = aVar;
            aVar.v();
        }
        a.x();
    }

    public final void pauseApp() {
        g.w();
    }

    public final void destroyApp(boolean z) {
        if (a != null) {
            g.y();
        }
    }
}
