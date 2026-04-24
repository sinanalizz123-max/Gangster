package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Random;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

/* loaded from: Gangstar_Rio_Samsung_F480_EN_IGP_EU_TS_118.jar:g.class */
public abstract class g extends Canvas implements Runnable {
    static boolean U;

    /* renamed from: a, reason: collision with other field name */
    private static int f583a;

    /* renamed from: a, reason: collision with other field name */
    private static long f584a;

    /* renamed from: b, reason: collision with other field name */
    private static long f585b;
    static boolean V;

    /* renamed from: a, reason: collision with other field name */
    private static Display f588a;

    /* renamed from: a, reason: collision with other field name */
    private static boolean f589a;

    /* renamed from: a, reason: collision with other field name */
    static MIDlet f590a;

    /* renamed from: c, reason: collision with other field name */
    private long f591c;
    static int a_;

    /* renamed from: d, reason: collision with other field name */
    private static long f595d;
    static int b_;
    static int c_;

    /* renamed from: a, reason: collision with other field name */
    static g f596a;

    /* renamed from: a_, reason: collision with other field name */
    static byte[] f597a_;

    /* renamed from: b_, reason: collision with other field name */
    static byte[] f598b_;
    private static int g;

    /* renamed from: a, reason: collision with other field name */
    private static Hashtable f599a;

    /* renamed from: b, reason: collision with other field name */
    private static Hashtable f600b;

    /* renamed from: a, reason: collision with other field name */
    private static Random f601a;
    static int f_;
    static int g_;
    static int h_;
    static int i_;
    static int bm;

    /* renamed from: a, reason: collision with other field name */
    private static int[] f602a;

    /* renamed from: b, reason: collision with other field name */
    private static int[] f603b;

    /* renamed from: a, reason: collision with other field name */
    private static String f604a;

    /* renamed from: a, reason: collision with other field name */
    private static InputStream f605a;
    private static int k;

    /* renamed from: a, reason: collision with other field name */
    private static byte[] f606a;
    private static int l;
    private static int m;

    /* renamed from: a, reason: collision with other field name */
    private static short f607a;

    /* renamed from: c, reason: collision with other field name */
    private static int[] f608c;

    /* renamed from: b, reason: collision with other field name */
    private static short f609b;

    /* renamed from: a, reason: collision with other field name */
    private static short[] f610a;
    private static int n;
    static int br;

    /* renamed from: c, reason: collision with other field name */
    private static boolean f611c;

    /* renamed from: b, reason: collision with other field name */
    private static byte[] f612b;

    /* renamed from: a, reason: collision with other field name */
    private static byte[][] f613a;

    /* renamed from: c, reason: collision with other field name */
    private static byte[] f614c;
    private static int o;

    /* renamed from: e, reason: collision with other field name */
    private static long f615e;

    /* renamed from: f, reason: collision with other field name */
    private static long f616f;

    /* renamed from: f, reason: collision with other field name */
    private static byte[] f617f;
    private static int p;

    /* renamed from: b, reason: collision with other field name */
    private static short[] f618b;

    /* renamed from: d, reason: collision with other field name */
    private static int[] f620d;

    /* renamed from: b, reason: collision with other field name */
    private static byte[][] f621b;

    /* renamed from: e, reason: collision with other field name */
    private static int[] f622e;

    /* renamed from: a, reason: collision with other field name */
    private static int[][] f623a;

    /* renamed from: a, reason: collision with other field name */
    private static String[][] f624a;

    /* renamed from: a, reason: collision with other field name */
    private static RecordStore f625a;
    private static int r;

    /* renamed from: f, reason: collision with other field name */
    private static int[] f626f;

    /* renamed from: b, reason: collision with other field name */
    private static Image f627b;
    static boolean X;
    static int bs;
    static int bt;
    private static int v;
    private static int w;
    public static int bu;
    public static int bv;
    public static int bw;
    public static int bx;
    private static int x;
    private static int y;

    /* renamed from: f, reason: collision with other field name */
    private static boolean f634f;

    /* renamed from: g, reason: collision with other field name */
    private static boolean f635g;

    /* renamed from: h, reason: collision with other field name */
    private static boolean f636h;
    public static Graphics b = null;
    private static Graphics a = null;
    private static Graphics c = null;

    /* renamed from: b, reason: collision with other field name */
    private static int f586b = 320;

    /* renamed from: c, reason: collision with other field name */
    private static int f587c = 240;
    private static int d = 66;
    private static int e = -1;

    /* renamed from: a, reason: collision with other field name */
    private static Image f592a = null;

    /* renamed from: d, reason: collision with other field name */
    private static Graphics f593d = null;

    /* renamed from: b, reason: collision with other field name */
    private static boolean f594b = true;
    private static int f = -9999;
    private static int h = 25;
    static final int d_ = 256;
    static final int e_ = 256 >> 1;
    private static int i = 256;
    static final int bn = m140l(90);
    static final int bo = m140l(180);
    static final int bp = m140l(270);
    static final int bq = m140l(360);
    private static int j = 804;
    private static int q = 0;

    /* renamed from: b, reason: collision with other field name */
    private static String f619b = "UTF-8";

    /* renamed from: d, reason: collision with other field name */
    private static boolean f628d = false;
    static final boolean W = true;

    /* renamed from: e, reason: collision with other field name */
    private static boolean f629e = false;
    private static int s = 0;

    /* renamed from: b, reason: collision with other field name */
    private static int[][] f630b = null;

    /* renamed from: c, reason: collision with other field name */
    private static Image f631c = null;

    /* renamed from: e, reason: collision with other field name */
    private static Graphics f632e = null;

    /* renamed from: d, reason: collision with other field name */
    private static Image f633d = null;
    private static int t = 0;
    private static int u = 0;

    /* renamed from: t */
    abstract void mo109t();

    /* renamed from: u */
    public void mo110u() {
    }

    public g(Object obj, Object obj2) {
        f596a = this;
        f583a = -1;
        f589a = true;
        f590a = (MIDlet) obj;
        f588a = (Display) obj2;
        a();
        f600b = new Hashtable();
        Hashtable hashtable = new Hashtable();
        f599a = hashtable;
        hashtable.put(new Integer(48), new Integer(6));
        f599a.put(new Integer(49), new Integer(7));
        f599a.put(new Integer(50), new Integer(1));
        f599a.put(new Integer(51), new Integer(9));
        f599a.put(new Integer(52), new Integer(3));
        f599a.put(new Integer(53), new Integer(5));
        f599a.put(new Integer(54), new Integer(4));
        f599a.put(new Integer(55), new Integer(13));
        f599a.put(new Integer(56), new Integer(2));
        f599a.put(new Integer(57), new Integer(15));
        f599a.put(new Integer(35), new Integer(17));
        f599a.put(new Integer(42), new Integer(16));
        f599a.put(new Integer(-6), new Integer(18));
        f599a.put(new Integer(-7), new Integer(19));
        f599a.put(new Integer(-8), new Integer(24));
        f600b.put(new Integer(-5), new Integer(5));
        f600b.put(new Integer(-1), new Integer(1));
        f600b.put(new Integer(-2), new Integer(2));
        f600b.put(new Integer(-3), new Integer(3));
        f600b.put(new Integer(-4), new Integer(4));
        f595d = System.currentTimeMillis();
        this.f591c = f595d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void v() {
        if (f583a >= 0) {
            return;
        }
        f586b = 320;
        f587c = 240;
        f597a_ = new byte[h];
        f598b_ = new byte[h];
        bu = 0;
        a(System.currentTimeMillis());
        f583a = 0;
        new Thread(this).start();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void w() {
        if (U) {
            return;
        }
        U = true;
        i.m185e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x() {
        if (U) {
            long currentTimeMillis = System.currentTimeMillis();
            f584a = currentTimeMillis;
            f595d = currentTimeMillis;
            this.f591c = currentTimeMillis;
            U = false;
            a();
            V = true;
            if (!f589a) {
                repaint();
            }
            i();
        }
    }

    public void hideNotify() {
        w();
    }

    public void showNotify() {
        x();
    }

    public void sizeChanged(int i2, int i3) {
    }

    private void a() {
        setFullScreenMode(true);
        if (f588a == null || f588a.getCurrent() == this) {
            return;
        }
        f588a.setCurrent(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void y() {
        f583a = -1;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            a();
            f589a = false;
            while (f583a >= 0) {
                if (U) {
                    this.f591c = Math.min(this.f591c, System.currentTimeMillis());
                    Thread.yield();
                } else {
                    repaint();
                    serviceRepaints();
                    mo110u();
                    V = false;
                    long currentTimeMillis = System.currentTimeMillis();
                    this.f591c = Math.min(this.f591c, currentTimeMillis);
                    while (currentTimeMillis - this.f591c < d) {
                        Thread.yield();
                        currentTimeMillis = System.currentTimeMillis();
                        this.f591c = Math.min(this.f591c, currentTimeMillis);
                    }
                    this.f591c = System.currentTimeMillis();
                }
            }
        } catch (Exception unused) {
            f583a = -1;
        }
        f597a_ = null;
        f598b_ = null;
        f613a = null;
        f590a.notifyDestroyed();
    }

    public void paint(Graphics graphics) {
        c = graphics;
        long currentTimeMillis = System.currentTimeMillis() - f585b;
        f585b = System.currentTimeMillis();
        if (currentTimeMillis > 3000 && f585b != 0) {
            w();
            x();
        }
        if (U || f589a) {
            return;
        }
        f589a = true;
        for (int i2 = 0; i2 < h; i2++) {
            f597a_[i2] = f598b_[i2];
            if (f598b_[i2] != 0) {
                if (f598b_[i2] < 0) {
                    f598b_[i2] = 0;
                } else if (f598b_[i2] < 126) {
                    byte[] bArr = f598b_;
                    int i3 = i2;
                    bArr[i3] = (byte) (bArr[i3] + 1);
                    if (i2 >= 18) {
                        byte[] bArr2 = f598b_;
                        int i4 = i2;
                        bArr2[i4] = (byte) (-bArr2[i4]);
                    }
                }
            }
        }
        if (g > 0) {
            if (g != Integer.MAX_VALUE) {
                g -= a_;
            }
            i();
        }
        switch (bu) {
            case 1:
                d(4);
                break;
            case 2:
                d(0);
                break;
        }
        bx = y;
        if (f634f) {
            d(1);
            f634f = false;
        } else if (f635g) {
            d(2);
            f635g = false;
            f636h = false;
        } else if (f636h) {
            d(3);
            f636h = false;
        }
        x = bv;
        y = bw;
        long currentTimeMillis2 = System.currentTimeMillis();
        f584a = currentTimeMillis2;
        int i5 = (int) (currentTimeMillis2 - f595d);
        a_ = i5;
        if (i5 < 0) {
            a_ = 0;
        }
        if (a_ > 1000) {
            a_ = 1000;
        }
        f595d = f584a;
        b_ += a_;
        c_++;
        try {
            a = graphics;
            b = graphics;
            mo109t();
        } catch (Exception unused) {
            f583a = -1;
        }
        f589a = false;
        c = null;
    }

    protected void keyPressed(int i2) {
        byte a2 = a(i2);
        if (f598b_ != null && f598b_[a2] <= 0) {
            if (f598b_[a2] < 0) {
                f598b_[a2] = 0;
            }
            if (f598b_[a2] < 126) {
                byte[] bArr = f598b_;
                bArr[a2] = (byte) (bArr[a2] + 1);
            }
        }
    }

    protected void keyReleased(int i2) {
        byte a2 = a(i2);
        if (f598b_ != null && f598b_[a2] > 0) {
            byte[] bArr = f598b_;
            bArr[a2] = (byte) (-bArr[a2]);
        }
    }

    public static void a(boolean z, int i2, int i3) {
        Integer num = new Integer(i2);
        Hashtable hashtable = f599a;
        if (((Integer) hashtable.get(num)) != null) {
            hashtable.remove(num);
        }
        hashtable.put(num, new Integer(i3));
    }

    private static byte a(int i2) {
        Integer num = new Integer(i2);
        if (f599a == null) {
            return (byte) 0;
        }
        Integer num2 = (Integer) f599a.get(num);
        if (num2 != null) {
            return num2.byteValue();
        }
        Integer num3 = (Integer) f600b.get(num);
        if (num3 != null) {
            return num3.byteValue();
        }
        return (byte) 0;
    }

    public static void i() {
        if (f597a_ == null || f598b_ == null) {
            return;
        }
        for (int i2 = 0; i2 < h; i2++) {
            f597a_[i2] = 0;
            f598b_[i2] = 0;
        }
    }

    public static boolean j(int i2) {
        return f597a_[6] <= 0;
    }

    public static int c() {
        int i2 = h;
        do {
            i2--;
            if (i2 < 0) {
                return -1;
            }
        } while (f597a_[i2] != 1);
        return i2;
    }

    public static boolean g(int i2) {
        return f597a_[i2] == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void l(int i2) {
        g = 200;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str, int i2, int i3) {
        a(str);
        f602a = (int[]) m151a(0);
        m151a(1);
        z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int i(int i2) {
        return i2 << 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j, reason: collision with other method in class */
    public static final int m139j(int i2) {
        return (i2 + 128) >> 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int k(int i2) {
        int i3 = 0;
        while ((i2 >> i3) > 1) {
            i3++;
        }
        return i3;
    }

    private static boolean a(long j2, long j3) {
        return (j2 ^ j3) >= 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int b(int i2, int i3, int i4, int i5) {
        return (i2 * i4) + (i3 * i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void a(long j2) {
        if (f601a == null) {
            f601a = new Random(j2);
        } else {
            f601a.setSeed(j2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int o(int i2, int i3) {
        if (i3 == i2) {
            return i3;
        }
        int nextInt = f601a.nextInt();
        int i4 = nextInt;
        if (nextInt < 0) {
            i4 = -i4;
        }
        return i2 + (i4 % (i3 - i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l, reason: collision with other method in class */
    public static final int m140l(int i2) {
        return (i2 * i) / 360;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int m(int i2) {
        return n(bn - i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int n(int i2) {
        if (i2 < 0) {
            i2 = -i2;
        }
        int i3 = i2 & (bq - 1);
        if (i3 <= bn) {
            return f602a[i3];
        }
        if (i3 < bo) {
            return -f602a[bo - i3];
        }
        if (i3 <= bp) {
            return -f602a[i3 - bo];
        }
        return f602a[bq - i3];
    }

    /* renamed from: a, reason: collision with other method in class */
    private static int m141a(int i2) {
        int n2 = n(i2);
        if (n2 == 0) {
            return Integer.MAX_VALUE;
        }
        return (m(i2) << 8) / n2;
    }

    private static int a(int i2, int i3, int i4) {
        while (i2 + 1 < i3) {
            int i5 = (i2 + i3) >> 1;
            if (i4 > m141a(i5)) {
                i2 = i5;
            } else {
                i3 = i5;
            }
        }
        return i4 >= m141a(i3) ? i3 : i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int p(int i2, int i3) {
        if (f603b == null) {
            f603b = new int[d_ + 1];
            for (int i4 = 0; i4 < d_ + 1; i4++) {
                int[] iArr = f603b;
                int i5 = i4;
                int i6 = d_;
                int i7 = i4;
                iArr[i5] = i6 > 0 ? i7 > 0 ? a(0, bn, (i7 * d_) / i6) : i7 == 0 ? 0 : a(bp, bq, (i7 * d_) / i6) : i6 == 0 ? i7 > 0 ? bn : i7 == 0 ? 0 : bp : i7 > 0 ? a(bn, bo, (i7 * d_) / i6) : i7 == 0 ? bo : a(bo, bp, (i7 * d_) / i6);
            }
        }
        if (i2 == 0) {
            if (i3 > 0) {
                return bn;
            }
            if (i3 == 0) {
                return 0;
            }
            return bp;
        }
        if (i2 > 0) {
            if (i3 >= 0) {
                if (i2 >= i3) {
                    return f603b[(i3 * d_) / i2];
                }
                return bn - f603b[(i2 * d_) / i3];
            }
            int i8 = -i3;
            if (i2 >= i8) {
                return bq - f603b[(i8 * d_) / i2];
            }
            return bp + f603b[(i2 * d_) / i8];
        }
        int i9 = -i2;
        if (i3 >= 0) {
            if (i9 >= i3) {
                return bo - f603b[(i3 * d_) / i9];
            }
            return bn + f603b[(i9 * d_) / i3];
        }
        int i10 = -i3;
        if (i9 >= i10) {
            return bo + f603b[(i10 * d_) / i9];
        }
        return bp - f603b[(i9 * d_) / i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final boolean a(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        return i4 >= i6 && i2 <= i8 && i5 >= i7 && i3 <= i9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void a(int[] iArr, int i2, int i3, int i4, int i5) {
        if (iArr[0] > i2) {
            iArr[0] = i2;
        }
        if (iArr[1] > i3) {
            iArr[1] = i3;
        }
        if (iArr[2] < i4) {
            iArr[2] = i4;
        }
        if (iArr[3] < i5) {
            iArr[3] = i5;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a, reason: collision with other method in class */
    public static int m142a(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        long j2 = i4 - i2;
        long j3 = i6 - i8;
        if (j2 < 0) {
            i11 = i4;
            i10 = i2;
        } else {
            i10 = i4;
            i11 = i2;
        }
        if (j3 > 0) {
            if (i10 < i8 || i6 < i11) {
                return 0;
            }
        } else if (i10 < i6 || i8 < i11) {
            return 0;
        }
        long j4 = i5 - i3;
        long j5 = i7 - i9;
        if (j4 < 0) {
            i13 = i5;
            i12 = i3;
        } else {
            i12 = i5;
            i13 = i3;
        }
        if (j5 > 0) {
            if (i12 < i9 || i7 < i13) {
                return 0;
            }
        } else if (i12 < i7 || i9 < i13) {
            return 0;
        }
        long j6 = i2 - i6;
        long j7 = i3 - i7;
        long j8 = (j5 * j6) - (j3 * j7);
        long j9 = (j4 * j3) - (j2 * j5);
        if (j9 > 0) {
            if (j8 < 0 || j8 > j9) {
                return 0;
            }
        } else if (j8 > 0 || j8 < j9) {
            return 0;
        }
        long j10 = (j2 * j7) - (j4 * j6);
        if (j9 > 0) {
            if (j10 < 0 || j10 > j9) {
                return 0;
            }
        } else if (j10 > 0 || j10 < j9) {
            return 0;
        }
        if (j9 == 0) {
            return -1;
        }
        long j11 = j8 * j2;
        f_ = (int) (i2 + ((j11 + (a(j11, j9) ? j9 >> 1 : (-j9) >> 1)) / j9));
        long j12 = j8 * j4;
        g_ = (int) (i3 + ((j12 + (a(j12, j9) ? j9 >> 1 : (-j9) >> 1)) / j9));
        return 1;
    }

    private static final int a(int i2, int i3, int i4, int i5, int i6, int i7) {
        return (((i2 * i6) + ((i3 * 2) * i5)) + (i4 * i7)) / (1 << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        int i12 = i11 * i11;
        int i13 = d_ - i11;
        int i14 = i13 * i13;
        int i15 = i13 * i11;
        h_ = a(0, i5, i8, i15, i14, i12);
        i_ = a(0, i6, i9, i15, i14, i12);
        bm = a(0, i7, i10, i15, i14, i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int q(int i2, int i3) {
        return i2 + i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int r(int i2, int i3) {
        return i2 - i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int s(int i2, int i3) {
        return (int) (((i2 * i3) + 128) >> 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int t(int i2, int i3) {
        return ((int) ((((i2 << 8) << 1) / i3) + 1)) >> 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int u(int i2, int i3) {
        int i4;
        long j2 = (((i2 * i2) + (i3 * i3)) + e_) >> 8;
        if (j2 == 0 || j2 == d_) {
            return (int) j2;
        }
        if (j2 >= 2147483647L) {
            int i5 = 22;
            int i6 = 1073741824;
            int i7 = 0;
            long j3 = j2;
            do {
                long j4 = ((i7 + i7) + i6) << i5;
                if (j3 >= j4) {
                    i7 += i6;
                    j3 -= j4;
                }
                i6 >>= 1;
                i4 = i5;
                i5--;
            } while (i4 >= 0);
            return i7;
        }
        int i8 = (int) j2;
        if (i8 == 0 || i8 == d_) {
            return i8;
        }
        long j5 = i8;
        long j6 = 0;
        for (long j7 = 1 << 30; j7 >= 256; j7 >>= 1) {
            long j8 = j6 + j7;
            if (j5 >= j8) {
                j5 -= j8;
                j6 = j8 + j7;
            }
            j5 <<= 1;
        }
        return (int) (j6 >> 12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int c(int i2, int i3, int i4, int i5) {
        return s(i2, i4) + s(i3, i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int o(int i2) {
        return Math.abs(i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int v(int i2, int i3) {
        return Math.min(i2, i3);
    }

    private static byte[] b(int i2) {
        int c2;
        int b2;
        int i3;
        int i4;
        int m145b = m145b(i2);
        byte[] bArr = null;
        if (f611c) {
            try {
                byte[] bArr2 = new byte[m145b + 1];
                a(f605a, bArr2, 0, m145b);
                int i5 = 0;
                for (int i6 = 0; i6 < 4; i6++) {
                    i5 += (bArr2[i6 + 5] & 255) << (i6 << 3);
                }
                int i7 = bArr2[0] & 255;
                int i8 = i7 / 45;
                int i9 = i7 % 45;
                int i10 = i9 / 9;
                int i11 = i9 % 9;
                int i12 = 1846 + (768 << (i11 + i10));
                f617f = new byte[i5];
                f618b = new short[i12];
                int i13 = i12 << 1;
                int i14 = i5;
                int i15 = 1846 + (768 << (i11 + i10));
                short[] sArr = f618b;
                int i16 = 0;
                boolean z = false;
                int i17 = 0;
                int i18 = 1;
                int i19 = 1;
                int i20 = 1;
                int i21 = 1;
                int i22 = 0;
                int i23 = (1 << i8) - 1;
                int i24 = (1 << i10) - 1;
                if (i13 >= (i15 << 1)) {
                    for (int i25 = 0; i25 < i15; i25++) {
                        sArr[i25] = 1024;
                    }
                    int length = bArr2.length;
                    f614c = bArr2;
                    o = length;
                    p = 13;
                    f616f = 0L;
                    f615e = 4294967295L;
                    bArr2[o - 1] = -1;
                    for (int i26 = 0; i26 < 5; i26++) {
                        long j2 = f616f << 8;
                        byte[] bArr3 = f614c;
                        p = p + 1;
                        f616f = j2 | (bArr3[r2] & 255);
                    }
                    while (i22 < i14) {
                        int i27 = i22 & i23;
                        if (c(0 + (i16 << 4) + i27) != 0) {
                            z = true;
                            if (c(i16 + 192) == 1) {
                                if (c(i16 + 204) != 0) {
                                    if (c(i16 + 216) == 0) {
                                        i4 = i19;
                                    } else {
                                        if (c(i16 + 228) == 0) {
                                            i4 = i20;
                                        } else {
                                            i4 = i21;
                                            i21 = i20;
                                        }
                                        i20 = i19;
                                    }
                                    i19 = i18;
                                    i18 = i4;
                                } else if (c(240 + (i16 << 4) + i27) == 0) {
                                    i16 = i16 < 7 ? 9 : 11;
                                    i17 = f617f[i22 - i18] & 255;
                                    int i28 = i22;
                                    i22++;
                                    f617f[i28] = (byte) i17;
                                }
                                b2 = b(1332, i27);
                                i16 = i16 < 7 ? 8 : 11;
                            } else {
                                i21 = i20;
                                i20 = i19;
                                i19 = i18;
                                i16 = i16 < 7 ? 7 : 10;
                                b2 = b(818, i27);
                                int a2 = a(432 + ((b2 < 4 ? b2 : 3) << 6), 6);
                                if (a2 >= 4) {
                                    int i29 = (a2 >> 1) - 1;
                                    int i30 = (2 | (a2 & 1)) << i29;
                                    if (a2 < 14) {
                                        i3 = i30 + c(((i30 + 688) - a2) - 1, i29);
                                    } else {
                                        long j3 = f615e;
                                        long j4 = f616f;
                                        int i31 = 0;
                                        for (int i32 = i29 - 4; i32 > 0; i32--) {
                                            j3 >>= 1;
                                            i31 <<= 1;
                                            if (j4 >= j3) {
                                                j4 -= j3;
                                                i31 |= 1;
                                            }
                                            if (j3 < 16777216) {
                                                j3 <<= 8;
                                                byte[] bArr4 = f614c;
                                                p = p + 1;
                                                j4 = (j4 << 8) | (bArr4[r3] & 255);
                                            }
                                        }
                                        f615e = j3;
                                        f616f = j4;
                                        i3 = i30 + (i31 << 4) + c(802, 4);
                                    }
                                } else {
                                    i3 = a2;
                                }
                                i18 = i3 + 1;
                            }
                            int i33 = b2 + 2;
                            do {
                                i17 = f617f[i22 - i18] & 255;
                                int i34 = i22;
                                i22++;
                                f617f[i34] = (byte) i17;
                                i33--;
                                if (i33 <= 0) {
                                    break;
                                }
                            } while (i22 < i14);
                        } else {
                            int i35 = 1846 + (768 * (((i22 & i24) << i11) + ((i17 & 255) >> (8 - i11))));
                            i16 = i16 < 4 ? 0 : i16 < 10 ? i16 - 3 : i16 - 6;
                            if (z) {
                                byte b3 = f617f[i22 - i18];
                                int i36 = 1;
                                while (true) {
                                    int i37 = (b3 >> 7) & 1;
                                    b3 = (byte) (b3 << 1);
                                    int c3 = c(i35 + ((i37 + 1) << 8) + i36);
                                    i36 = (i36 << 1) | c3;
                                    if (i37 == c3) {
                                        if (i36 >= 256) {
                                            break;
                                        }
                                    } else {
                                        while (i36 < 256) {
                                            i36 = (i36 << 1) | c(i35 + i36);
                                        }
                                    }
                                }
                                i17 = i36 & 255;
                                z = false;
                            } else {
                                int i38 = 1;
                                do {
                                    c2 = (i38 << 1) | c(i35 + i38);
                                    i38 = c2;
                                } while (c2 < 256);
                                i17 = i38 & 255;
                            }
                            int i39 = i22;
                            i22++;
                            f617f[i39] = (byte) i17;
                        }
                    }
                }
                f618b = null;
                f614c = null;
                m += m145b;
                bArr = f617f;
                f617f = null;
            } catch (Exception unused) {
            }
        } else {
            byte[] bArr5 = new byte[m145b];
            bArr = bArr5;
            a(bArr5, 0, bArr.length);
        }
        return bArr;
    }

    private static void b() {
        int i2 = n == f609b - 1 ? f607a - f610a[n] : f610a[n + 1] - f610a[n];
        f608c = new int[i2 + 1];
        for (int i3 = 0; i3 < i2 + 1; i3++) {
            f608c[i3] = (m149a() & 255) | ((m149a() & 255) << 8) | ((m149a() & 255) << 16) | ((m149a() & 255) << 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(String str) {
        k = 1;
        if (f604a == null || str == null || str.compareTo(f604a) != 0) {
            z();
            f604a = str;
            f606a = null;
            l = 0;
            f605a = m143a(f604a);
            f607a = (short) m150b();
            int m150b = (short) m150b();
            f609b = m150b;
            f610a = new short[m150b];
            for (int i2 = 0; i2 < f609b; i2++) {
                f610a[i2] = (short) m150b();
            }
            n = 0;
            b();
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private static InputStream m143a(String str) {
        InputStream inputStream = null;
        if (k == 3) {
            inputStream = new ByteArrayInputStream(f606a, l, f606a.length - l);
        } else if (k != 2 && k == 1) {
            inputStream = "".getClass().getResourceAsStream(str);
        }
        return inputStream;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void z() {
        m144c();
        if (k == 3) {
            f606a = null;
        }
    }

    /* renamed from: c, reason: collision with other method in class */
    private static final void m144c() {
        if (f605a != null) {
            try {
                f605a.close();
            } catch (Exception unused) {
            }
            f605a = null;
        }
        m = 0;
    }

    /* renamed from: b, reason: collision with other method in class */
    private static int m145b(int i2) {
        int i3 = f609b - 1;
        while (i3 >= 0 && f610a[i3] > i2) {
            i3--;
        }
        if (n != i3) {
            n = i3;
            z();
            if (n == 0) {
                String str = f604a;
                f604a = null;
                a(str);
            } else {
                f605a = m143a(new StringBuffer().append(f604a).append(".").append(n).toString());
                b();
            }
        } else if (f605a == null) {
            if (n == 0) {
                String str2 = f604a;
                f604a = null;
                a(str2);
            } else {
                f605a = m143a(new StringBuffer().append(f604a).append(".").append(n).toString());
            }
        }
        int i4 = i2 - f610a[n];
        int i5 = f608c[i4];
        int i6 = f608c[i4 + 1] - f608c[i4];
        int i7 = i5;
        if (m != i7) {
            if (m > i7) {
                m144c();
                if (n == 0) {
                    f605a = m143a(f604a);
                } else {
                    f605a = m143a(new StringBuffer().append(f604a).append(".").append(n).toString());
                }
            } else {
                i7 -= m;
            }
            m148b(i7);
        }
        f611c = false;
        if (i6 > 0) {
            m146a(m149a() & 255);
            i6--;
        }
        return i6;
    }

    /* renamed from: a, reason: collision with other method in class */
    private static void m146a(int i2) {
        br = i2;
        if (i2 >= 127) {
            br -= 127;
            f611c = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a, reason: collision with other method in class */
    public static final byte[] m147a(int i2) {
        return b(i2);
    }

    /* renamed from: b, reason: collision with other method in class */
    private static void m148b(int i2) {
        if (i2 == 0) {
            return;
        }
        if (k == 3) {
            m += i2;
            while (i2 > 0) {
                try {
                    i2 = (int) (i2 - f605a.skip(i2));
                } catch (Exception unused) {
                    return;
                }
            }
            return;
        }
        if (f612b == null) {
            f612b = new byte[256];
        }
        while (i2 > 256) {
            a(f612b, 0, 256);
            i2 -= 256;
        }
        if (i2 > 0) {
            a(f612b, 0, i2);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private static int m149a() {
        int i2 = 0;
        try {
            i2 = f605a.read();
        } catch (Exception unused) {
        }
        m++;
        return i2;
    }

    /* renamed from: b, reason: collision with other method in class */
    private static int m150b() {
        return (m149a() & 255) | ((m149a() & 255) << 8);
    }

    private static int a(byte[] bArr, int i2, int i3) {
        int i4 = 0;
        int i5 = i3;
        while (i5 > 0) {
            try {
                int read = f605a.read(bArr, i4, i5);
                i5 -= read;
                i4 += read;
            } catch (Exception unused) {
            }
        }
        m += i3;
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a, reason: collision with other method in class */
    public static final Object m151a(int i2) {
        Object a2;
        m145b(i2);
        q = 0;
        if (f611c) {
            a2 = a((InputStream) new ByteArrayInputStream(b(i2)));
        } else {
            a2 = a(f605a);
            m += q;
        }
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v5, types: [byte[], byte[][]] */
    public static void b(String str) {
        if (f613a == null) {
            InputStream inputStream = f605a;
            f605a = m143a(str);
            int m149a = m149a();
            f613a = new byte[m149a];
            for (int i2 = 0; i2 < m149a; i2++) {
                int m149a2 = m149a();
                f613a[i2] = new byte[m149a2];
                a(f613a[i2], 0, m149a2);
            }
            try {
                f605a.close();
            } catch (Exception unused) {
            }
            f605a = inputStream;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b, reason: collision with other method in class */
    public static String m152b(int i2) {
        if (i2 >= f613a.length) {
            return "";
        }
        try {
            return new String(f613a[i2], "UTF-8");
        } catch (Exception unused) {
            return "";
        }
    }

    private static int c(int i2) {
        long j2 = (f615e >> 11) * f618b[i2];
        if (f616f < j2) {
            f615e = j2;
            short[] sArr = f618b;
            sArr[i2] = (short) (sArr[i2] + ((2048 - f618b[i2]) >> 5));
            if (f615e >= 16777216) {
                return 0;
            }
            long j3 = f616f << 8;
            byte[] bArr = f614c;
            p = p + 1;
            f616f = j3 | (bArr[r2] & 255);
            f615e <<= 8;
            return 0;
        }
        f615e -= j2;
        f616f -= j2;
        short[] sArr2 = f618b;
        sArr2[i2] = (short) (sArr2[i2] - (f618b[i2] >> 5));
        if (f615e >= 16777216) {
            return 1;
        }
        long j4 = f616f << 8;
        byte[] bArr2 = f614c;
        p = p + 1;
        f616f = j4 | (bArr2[r2] & 255);
        f615e <<= 8;
        return 1;
    }

    private static int a(int i2, int i3) {
        int i4 = 1;
        for (int i5 = i3; i5 > 0; i5--) {
            i4 = (i4 << 1) + c(i2 + i4);
        }
        return i4 - (1 << i3);
    }

    private static int b(int i2, int i3) {
        return c(i2) == 0 ? a(i2 + 2 + (i3 << 3), 3) : c(i2 + 1) == 0 ? 8 + a(i2 + 130 + (i3 << 3), 3) : 16 + a(i2 + 258, 8);
    }

    private static int c(int i2, int i3) {
        int i4 = 1;
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            int c2 = c(i2 + i4);
            i4 = (i4 << 1) + c2;
            i5 |= c2 << i6;
        }
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int d() {
        return f586b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int e() {
        return f587c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int f() {
        return f.f562h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void A() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m, reason: collision with other method in class */
    public static final void m153m(int i2) {
        b.setColor(i2);
    }

    private static void a(Graphics graphics, int i2, int i3, int i4) {
        graphics.setColor((i2 << 16) | (i3 << 8) | i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int g() {
        return b.getClipY();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int h() {
        return b(b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i, reason: collision with other method in class */
    public static final int m154i() {
        return b.getClipHeight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int j() {
        return b.getClipWidth();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void d(int i2, int i3, int i4, int i5) {
        b(b, i2, i3, i4, i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int a(Graphics graphics) {
        return graphics.getClipY();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int b(Graphics graphics) {
        return (f.f562h - graphics.getClipX()) - graphics.getClipWidth();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int c(Graphics graphics) {
        return graphics.getClipHeight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int d(Graphics graphics) {
        return graphics.getClipWidth();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void a(Graphics graphics, int i2, int i3, int i4, int i5) {
        graphics.clipRect((f.f562h - i3) - i5, i2, i5, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void b(Graphics graphics, int i2, int i3, int i4, int i5) {
        graphics.setClip((f.f562h - i3) - i5, i2, i5, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a, reason: collision with other method in class */
    public static final boolean m155a(Graphics graphics) {
        return graphics != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void e(int i2, int i3, int i4, int i5) {
        c(b, i2, i3, i4, i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void c(Graphics graphics, int i2, int i3, int i4, int i5) {
        graphics.drawLine((f.f562h - i3) - 1, i2, (f.f562h - i5) - 1, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void f(int i2, int i3, int i4, int i5) {
        d(b, i2, i3, i4, i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void d(Graphics graphics, int i2, int i3, int i4, int i5) {
        graphics.fillRect((f.f562h - i3) - i5, i2, i5, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void g(int i2, int i3, int i4, int i5) {
        e(b, i2, i3, i4, i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void e(Graphics graphics, int i2, int i3, int i4, int i5) {
        graphics.drawRect((f587c - i3) - i5, i2, i5, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void d(int i2, int i3, int i4, int i5, int i6, int i7) {
        a(b, i2, i3, i4, i5, i6, i7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void a(Graphics graphics, int i2, int i3, int i4, int i5, int i6, int i7) {
        graphics.fillArc((f.f562h - i3) - i5, i2, i5, i4, i6 - 90, i7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void e(int i2, int i3, int i4, int i5, int i6, int i7) {
        b(b, i2, i3, i4, i5, i6, i7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void b(Graphics graphics, int i2, int i3, int i4, int i5, int i6, int i7) {
        graphics.drawArc((f.f562h - i3) - i5, i2, i5, i4, i6 - 90, i7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void a(String str, int i2, int i3, int i4) {
        int i5 = 0;
        if ((0 & 2) != 0) {
            i5 = (0 & (-3)) | 64;
        }
        try {
            b.drawString(str, 0, i3, i5);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void a(Image image, int i2, int i3, int i4) {
        a(b, image, i2, i3, 0, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void a(Graphics graphics, Image image, int i2, int i3, int i4, boolean z) {
        try {
            if (z) {
                a(image, 0, 0, image.getWidth(), image.getHeight(), 0, i2, i3, i4);
            } else {
                graphics.drawImage(image, i2, i3, i4);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void a(Image image, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = i6;
        int i11 = i5;
        int i12 = i4;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        if ((i9 & 4) != 0) {
            i15 = 16;
        }
        if ((i9 & 8) != 0) {
            i15 |= 32;
        }
        if ((i9 & 16) != 0) {
            i15 |= 8;
        }
        if ((i9 & 32) != 0) {
            i15 |= 4;
        }
        if ((i9 & 1) != 0) {
            i15 |= 2;
        }
        if ((i9 & 2) != 0) {
            i15 |= 1;
        }
        if (i10 == 0) {
            i10 = 5;
        } else if (i10 == 5) {
            i10 = 3;
        } else if (i10 == 3) {
            i10 = 6;
        } else if (i10 == 6) {
            i10 = 0;
        } else if (i10 == 2) {
            i10 = 7;
        }
        int i16 = f.f562h - i8;
        int i17 = i15;
        if (0 < 0) {
            i12 += 0;
            i14 = 0;
        }
        if (i14 + i12 >= image.getWidth()) {
            i12 += image.getWidth() - (i14 + i12);
        }
        if (0 < 0) {
            i11 += 0;
            i13 = 0;
        }
        if (i13 + i11 >= image.getHeight()) {
            i11 += image.getHeight() - (i13 + i11);
        }
        if (i11 <= 0 || i12 <= 0) {
            return;
        }
        try {
            b.drawRegion(image, i14, i13, i12, i11, i10, i16, i7, i17);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void f(int i2, int i3, int i4, int i5, int i6, int i7) {
        c(b, i2, i3, i4, i5, i6, i7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void c(Graphics graphics, int i2, int i3, int i4, int i5, int i6, int i7) {
        graphics.fillTriangle(f.f562h - i3, i2, f.f562h - i5, i4, f.f562h - i7, i6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Image a(int[] iArr, int i2, int i3, boolean z) {
        return Image.createRGBImage(iArr, i2, i3, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void a(Graphics graphics, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        a(graphics, iArr, 0, i3, i4, i5, i6, i7, true, true, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void a(Graphics graphics, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, int i8) {
        a(graphics, iArr, i2, i3, i4, i5, i6, i7, z, z2, i8, -1, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void a(Graphics graphics, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, int i8, int i9, boolean z3) {
        if (z3) {
            int i10 = i7;
            if ((i8 & 4) != 0) {
                i10 = i6;
                int i11 = i8 & (-5);
                int i12 = (i11 & 2) != 0 ? i11 & (-3) : i11 | 2;
                i8 = (i12 & 1) != 0 ? i12 & (-2) : i12 | 1;
            } else {
                i8 |= 4;
            }
            i4 = (f.f562h - i5) - i10;
            i5 = i4;
        }
        if (i8 != 0) {
            int i13 = 0;
            if ((i8 & 4) != 0) {
                i13 = i6;
                i6 = i7;
                i7 = i3;
                i3 = i6;
            }
            iArr = f.a(iArr, i6, i7, i8);
            if ((i8 & 4) != 0) {
                i7 = i13;
            }
        }
        if (graphics == a) {
            a(graphics, f587c, f586b, iArr, i3, i2 % i3, i2 / i3, i4, i5, i6, i7, z);
        } else {
            a(graphics, graphics.getClipX() + graphics.getClipWidth(), graphics.getClipY() + graphics.getClipHeight(), iArr, i3, i2 % i3, i2 / i3, i4, i5, i6, i7, z);
        }
    }

    private static void a(Graphics graphics, int i2, int i3, int[] iArr, int i4, int i5, int i6, int i7, int i8, int i9, int i10, boolean z) {
        int translateX = graphics.getTranslateX();
        int translateY = graphics.getTranslateY();
        graphics.translate(-translateX, -translateY);
        int i11 = i7 + translateX;
        int i12 = i8 + translateY;
        int i13 = i5 + (i6 * i4);
        if (graphics == a) {
            if (i11 >= i2 || i11 + i9 <= 0 || i12 >= i3 || i12 + i10 <= 0) {
                return;
            }
            if (i11 <= 0) {
                i13 -= i11;
                i9 += i11;
                i11 = 0;
            }
            if (i11 + i9 >= i2) {
                i9 = i2 - i11;
            }
            if (i12 + i10 >= i3) {
                i10 = i3 - i12;
            }
            if (i12 <= 0) {
                i13 -= i12 * i4;
                i10 += i12;
                i12 = 0;
            }
        }
        graphics.drawRGB(iArr, i13, i4, i11, i12, i9, i10, z);
        graphics.translate(translateX, translateY);
    }

    public static final void a(Image image, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        image.getRGB(iArr, i2, i3, i4, i5, i6, i7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static short a(byte[] bArr, int i2) {
        return (short) ((bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v19, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v26, types: [short[]] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v37, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v40, types: [int[]] */
    private static Object a(InputStream inputStream) {
        short[] sArr;
        short[] sArr2 = null;
        try {
            int m156a = m156a(inputStream);
            int i2 = m156a >> 4;
            int i3 = m156a & 7;
            int b2 = (m156a & 8) != 0 ? b(inputStream) : m156a(inputStream);
            switch (i3) {
                case 0:
                    byte[] bArr = new byte[b2];
                    for (int i4 = 0; i4 < b2; i4++) {
                        bArr[i4] = (byte) m156a(inputStream);
                    }
                    sArr2 = bArr;
                    break;
                case 1:
                    short[] sArr3 = new short[b2];
                    if (i2 == 0) {
                        for (int i5 = 0; i5 < b2; i5++) {
                            sArr3[i5] = (byte) m156a(inputStream);
                        }
                    } else {
                        for (int i6 = 0; i6 < b2; i6++) {
                            sArr3[i6] = (short) b(inputStream);
                        }
                    }
                    sArr2 = sArr3;
                    break;
                case 2:
                    ?? r0 = new int[b2];
                    if (i2 == 0) {
                        for (int i7 = 0; i7 < b2; i7++) {
                            r0[i7] = (byte) m156a(inputStream);
                        }
                    } else if (i2 == 1) {
                        for (int i8 = 0; i8 < b2; i8++) {
                            r0[i8] = (short) b(inputStream);
                        }
                    } else {
                        for (int i9 = 0; i9 < b2; i9++) {
                            r0[i9] = c(inputStream);
                        }
                    }
                    sArr2 = r0;
                    break;
                default:
                    switch (i3 & 3) {
                        case 0:
                            if (i2 == 2) {
                                sArr = (Object[]) new byte[b2];
                                break;
                            } else {
                                sArr = new byte[b2];
                                break;
                            }
                        case 1:
                            if (i2 == 2) {
                                sArr = (Object[]) new short[b2];
                                break;
                            } else {
                                sArr = new short[b2];
                                break;
                            }
                        default:
                            if (i2 == 2) {
                                sArr = (Object[]) new int[b2];
                                break;
                            } else {
                                sArr = new int[b2];
                                break;
                            }
                    }
                    for (int i10 = 0; i10 < b2; i10++) {
                        sArr[i10] = a(inputStream);
                    }
                    sArr2 = sArr;
                    break;
            }
        } catch (Exception unused) {
        }
        return sArr2;
    }

    /* renamed from: a, reason: collision with other method in class */
    private static int m156a(InputStream inputStream) {
        int read = inputStream.read();
        if (read >= 0) {
            q++;
        }
        return read;
    }

    private static int b(InputStream inputStream) {
        return (m156a(inputStream) & 255) | ((m156a(inputStream) & 255) << 8);
    }

    private static int c(InputStream inputStream) {
        return (m156a(inputStream) & 255) | ((m156a(inputStream) & 255) << 8) | ((m156a(inputStream) & 255) << 16) | ((m156a(inputStream) & 255) << 24);
    }

    private static int a(InputStream inputStream, byte[] bArr, int i2, int i3) {
        int i4 = 0;
        int i5 = i3;
        while (i5 > 0) {
            try {
                int read = inputStream.read(bArr, i4, i5);
                i5 -= read;
                i4 += read;
            } catch (Exception unused) {
            }
        }
        q += i3;
        return i3;
    }

    private static int d(InputStream inputStream) {
        int i2 = 0;
        try {
            i2 = m156a(inputStream);
            f622e[i2] = c(inputStream);
            if (f622e[i2] > 2048) {
                f622e[i2] = 2048;
            }
            f623a[i2] = new int[f622e[i2] + 1];
            for (int i3 = 1; i3 < f622e[i2] + 1; i3++) {
                f623a[i2][i3] = c(inputStream);
            }
            f621b[i2] = new byte[f623a[i2][f622e[i2]]];
            a(inputStream, f621b[i2], 0, f621b[i2].length);
        } catch (Exception unused) {
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v19, types: [byte[], byte[][]] */
    /* JADX WARN: Type inference failed for: r0v21, types: [int[], int[][]] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.String[], java.lang.String[][]] */
    public static void a(String str, int i2) {
        m160n(i2);
        a(str);
        m145b(i2);
        if (f620d == null) {
            f620d = new int[32];
            for (int i3 = 0; i3 < 32; i3++) {
                f620d[i3] = -1;
            }
            f621b = new byte[32];
            f623a = new int[32];
            f622e = new int[32];
            f624a = new String[32];
        }
        if (f611c) {
            f620d[i2] = d(new ByteArrayInputStream(b(i2)));
        } else {
            f620d[i2] = d(f605a);
        }
        z();
        m159c(f620d[i2]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void c(String str) {
        f619b = str;
    }

    /* renamed from: a, reason: collision with other method in class */
    private static String m157a(byte[] bArr, int i2, int i3) {
        char[] cArr = new char[i3];
        int i4 = 0;
        int i5 = i2;
        int i6 = i2 + i3;
        while (i5 < i6) {
            if ((bArr[i5] & 128) == 0) {
                int i7 = i4;
                i4++;
                int i8 = i5;
                i5++;
                cArr[i7] = (char) bArr[i8];
            } else if ((bArr[i5] & 224) == 224 && i5 + 2 < i6 && (bArr[i5 + 1] & 192) == 128 && (bArr[i5 + 2] & 192) == 128) {
                int i9 = i4;
                i4++;
                cArr[i9] = (char) (((bArr[i5] & 15) << 12) | ((bArr[i5 + 1] & 63) << 6) | (bArr[i5 + 2] & 63));
                i5 += 3;
            } else {
                if ((bArr[i5] & 192) != 192 || i5 + 1 >= i6 || (bArr[i5 + 1] & 192) != 128) {
                    return "";
                }
                int i10 = i4;
                i4++;
                cArr[i10] = (char) (((bArr[i5] & 31) << 6) | (bArr[i5 + 1] & 63));
                i5 += 2;
            }
        }
        return new String(cArr, 0, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c, reason: collision with other method in class */
    public static String m158c(int i2) {
        int i3 = i2 >> 11;
        int i4 = i2 & 2047;
        if (f624a != null && f624a[i3] != null) {
            return f624a[i3][i4];
        }
        try {
            int i5 = f623a[i3][i4 + 1] - f623a[i3][i4];
            if (i5 == 0) {
                return null;
            }
            return !f619b.equals("UTF-8") ? new String(f621b[i3], f623a[i3][i4], i5, f619b) : m157a(f621b[i3], f623a[i3][i4], i5);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c, reason: collision with other method in class */
    private static void m159c(int i2) {
        if (f622e[i2] == 0) {
            return;
        }
        String[] strArr = new String[f622e[i2]];
        for (int i3 = 0; i3 < f622e[i2]; i3++) {
            strArr[i3] = m158c(i3 + (i2 << 11));
        }
        f624a[i2] = strArr;
        f623a[i2] = null;
        f621b[i2] = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n, reason: collision with other method in class */
    public static void m160n(int i2) {
        int i3;
        if (f620d == null || (i3 = f620d[i2]) == -1) {
            return;
        }
        if (f624a[i3] != null) {
            for (int i4 = 0; i4 < f622e[i3]; i4++) {
                f624a[i3][i4] = null;
            }
            f624a[i3] = null;
        }
        f623a[i3] = null;
        f621b[i3] = null;
        f622e[i3] = 0;
        f620d[i2] = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a, reason: collision with other method in class */
    public static String m161a(int i2, int i3) {
        if (i2 < 1000) {
            return new StringBuffer().append("").append(i2).toString();
        }
        String str = "";
        switch (i3) {
            case 0:
            case 7:
            case 8:
            case 9:
            case 15:
                str = ",";
                break;
            case 1:
            case 3:
            case 5:
            case 16:
                str = ".";
                break;
            case 2:
            case 4:
            case 6:
            case 10:
                if (i2 >= 10000) {
                    str = " ";
                    break;
                }
                break;
            case 11:
            case 14:
                if (i2 >= 10000) {
                    str = ".";
                    break;
                }
                break;
            case 12:
            case 13:
                str = " ";
                break;
            default:
                return new StringBuffer().append("").append(i2).toString();
        }
        String str2 = "";
        int i4 = i2 % 1000 < 0 ? -(i2 % 1000) : i2 % 1000;
        int i5 = i2 / 1000;
        while (true) {
            if (i4 == 0 && i5 == 0) {
                return str2;
            }
            if (i4 < 10) {
                str2 = new StringBuffer().append("00").append(i4 < 0 ? -i4 : i4).append(str2).toString();
            } else if (i4 < 100) {
                str2 = new StringBuffer().append("0").append(i4 < 0 ? -i4 : i4).append(str2).toString();
            } else {
                str2 = new StringBuffer().append(i4 < 0 ? -i4 : i4).append(str2).toString();
            }
            i4 = i5 % 1000;
            int i6 = i5 / 1000;
            i5 = i6;
            if (i6 != 0) {
                str2 = new StringBuffer().append(str).append(str2).toString();
            } else if (i4 != 0) {
                str2 = new StringBuffer().append(i4).append(str).append(str2).toString();
                i4 = 0;
            }
        }
    }

    /* renamed from: d, reason: collision with other method in class */
    private static void m162d() {
        if (f625a == null) {
            return;
        }
        try {
            f625a.closeRecordStore();
        } catch (RecordStoreException unused) {
        }
        f625a = null;
    }

    private static void d(String str) {
        f625a = RecordStore.openRecordStore(str, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a, reason: collision with other method in class */
    public static byte[] m163a(String str) {
        return m164b(str);
    }

    /* renamed from: b, reason: collision with other method in class */
    private static byte[] m164b(String str) {
        byte[] bArr = null;
        try {
            d(str);
            if (f625a.getNumRecords() > 0) {
                bArr = f625a.getRecord(1);
            }
        } catch (RecordStoreException unused) {
            bArr = null;
        }
        m162d();
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str, byte[] bArr) {
        int length = bArr.length;
        try {
            d(str);
            if (f625a.getNumRecords() > 0) {
                f625a.setRecord(1, bArr, 0, length);
            } else {
                f625a.addRecord(bArr, 0, length);
            }
        } catch (RecordStoreException unused) {
        }
        m162d();
    }

    /* renamed from: o, reason: collision with other method in class */
    public static void m165o(int i2) {
        if (i2 != r || f627b == null) {
            r = i2;
            int[] iArr = f.f514b;
            f626f = iArr;
            if (iArr == null) {
                f626f = new int[256];
            }
            int i3 = 256;
            while (i3 > 0) {
                i3--;
                f626f[i3] = i2;
            }
            f627b = a(f626f, 16, 16, true);
        }
    }

    public static void f(Graphics graphics, int i2, int i3, int i4, int i5) {
        int clipY = graphics.getClipY();
        int b2 = b(graphics);
        int clipHeight = graphics.getClipHeight();
        int clipWidth = graphics.getClipWidth();
        int i6 = i2 > clipY ? i2 : clipY;
        int i7 = i3 > b2 ? i3 : b2;
        int i8 = (i2 + i4 < clipY + clipHeight ? i2 + i4 : clipY + clipHeight) - i6;
        int i9 = (i3 + i5 < b2 + clipWidth ? i3 + i5 : b2 + clipWidth) - i7;
        if (i8 <= 0 || i9 <= 0) {
            return;
        }
        b(graphics, i6, i7, i8, i9);
        int i10 = (f.f562h - i7) - i9;
        int i11 = i9 + i10;
        int i12 = i8 + i6;
        for (int i13 = i10; i13 < i11; i13 += 16) {
            for (int i14 = i6; i14 < i12; i14 += 16) {
                a(graphics, f627b, i13, i14, 20, false);
            }
        }
        b(graphics, clipY, b2, clipHeight, clipWidth);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Graphics graphics, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i6 >>> 24;
        int i8 = i6 & 16777215;
        b(graphics, i2 + 1, i3, i2 + i4, i3, i8, i7, i7);
        b(graphics, i2, i3, i2, i3 + i5, i8, i7, i7);
        b(graphics, i2 + i4, i3 + i5, i2 + i4, i3, i8, i7, i7);
        b(graphics, i2 + i4 + 1, i3 + i5, i2, i3 + i5, i8, i7, i7);
    }

    private static final int[] a(int[] iArr, int[] iArr2, int i2, int i3, boolean z, boolean z2) {
        int i4 = (i3 < 0 ? 0 : i3 > 255 ? 255 : i3) & 255;
        if (z2) {
            while (i2 > 0) {
                i2--;
                int i5 = iArr[i2] >>> 24;
                if (i5 != 0) {
                    iArr2[i2] = (iArr[i2] & 16777215) | ((((i5 * i4) >> 8) & 255) << 24);
                } else {
                    iArr2[i2] = 0;
                }
            }
        } else if (z) {
            int i6 = i4 << 24;
            while (i2 > 0) {
                i2--;
                if ((iArr[i2] & (-16777216)) != 0) {
                    iArr2[i2] = (iArr[i2] & 16777215) | i6;
                } else {
                    iArr2[i2] = 0;
                }
            }
        } else {
            int i7 = i4 << 24;
            while (i2 > 0) {
                i2--;
                iArr2[i2] = (iArr[i2] & 16777215) | i7;
            }
        }
        X = true;
        return iArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v4, types: [int[], int[][]] */
    public static final void B() {
        s = 0;
        v = f586b;
        w = f587c;
        ?? r0 = new int[16];
        f630b = r0;
        r0[12] = new int[2];
        switch (12) {
            case 12:
                f630b[12][1] = 255;
                f630b[12][0] = -1;
                break;
        }
        t = 0;
        f629e = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void p(int i2) {
        s |= 1 << 12;
        if (((1 << 12) & 2559) != 0) {
            s &= -2560;
        }
        if (((1 << 12) & 31) != 0) {
            t |= 1 << 12;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void q(int i2) {
        s &= (1 << i2) ^ (-1);
        if (((1 << i2) & 31) != 0) {
            t &= (1 << i2) ^ (-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k, reason: collision with other method in class */
    public static final boolean m166k(int i2) {
        return (s & 4096) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int k() {
        return s & 63456;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void C() {
        s &= -63457;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void c(int i2, int i3, int i4) {
        f630b[i2][i3] = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int w(int i2, int i3) {
        return f630b[i2][i3];
    }

    private static final boolean a(boolean z, int i2) {
        if (i2 == 1) {
            return false;
        }
        if (i2 == 2) {
            return true;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int[] a(Graphics graphics, Image image, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2) {
        int[] a2 = f.a((int[]) null);
        a(image, a2, 0, i4, 0, 0, i4, i5);
        return a(graphics, a2, i2, i3, i4, i5, i6, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int[] a(Graphics graphics, int[] iArr, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2) {
        X = z;
        bs = i4;
        bt = i5;
        if ((s & 22016) != 0) {
            if ((i6 & 4) != 0) {
                bs = i5;
                bt = i4;
                i4 = bs;
                i5 = bt;
            }
            iArr = f.a(iArr, i4, i5, i6);
        }
        int[] a2 = f.a(iArr, i4, i5);
        if ((s & 8192) != 0 || (s & 4096) == 0) {
            return null;
        }
        return a(iArr, a2, i4 * i5, f630b[12][1], z, a(z2, f630b[12][0]));
    }

    public static void a(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        a(b, i2, i3, i4, i5, i6, i7, i8);
    }

    public static void a(Graphics graphics, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = (i6 >> 16) & 255;
        int i10 = (i6 >> 8) & 255;
        int i11 = i6 & 255;
        int i12 = ((i7 >> 16) & 255) - i9;
        int i13 = ((i7 >> 8) & 255) - i10;
        int i14 = (i7 & 255) - i11;
        int i15 = (i2 + i4) - 1;
        int i16 = (i3 + i5) - 1;
        int i17 = i9 << 16;
        int i18 = i10 << 16;
        int i19 = i11 << 16;
        if (i8 == 4) {
            int i20 = i15 - i2;
            int i21 = (i12 << 16) / i20;
            int i22 = (i13 << 16) / i20;
            int i23 = (i14 << 16) / i20;
            for (int i24 = i15; i24 >= i2; i24--) {
                a(graphics, i17 >> 16, i18 >> 16, i19 >> 16);
                c(graphics, i24, i3, i24, i16);
                i17 += i21;
                i18 += i22;
                i19 += i23;
            }
            return;
        }
        if (i8 == 8) {
            int i25 = i15 - i2;
            int i26 = (i12 << 16) / i25;
            int i27 = (i13 << 16) / i25;
            int i28 = (i14 << 16) / i25;
            for (int i29 = i2; i29 <= i15; i29++) {
                a(graphics, i17 >> 16, i18 >> 16, i19 >> 16);
                c(graphics, i29, i3, i29, i16);
                i17 += i26;
                i18 += i27;
                i19 += i28;
            }
            return;
        }
        if (i8 == 16) {
            int i30 = i16 - i3;
            int i31 = (i12 << 16) / i30;
            int i32 = (i13 << 16) / i30;
            int i33 = (i14 << 16) / i30;
            for (int i34 = i16; i34 >= i3; i34--) {
                a(graphics, i17 >> 16, i18 >> 16, i19 >> 16);
                c(graphics, i2, i34, i15, i34);
                i17 += i31;
                i18 += i32;
                i19 += i33;
            }
            return;
        }
        if (i8 == 32) {
            int i35 = i16 - i3;
            int i36 = (i12 << 16) / i35;
            int i37 = (i13 << 16) / i35;
            int i38 = (i14 << 16) / i35;
            for (int i39 = i3; i39 <= i16; i39++) {
                a(graphics, i17 >> 16, i18 >> 16, i19 >> 16);
                c(graphics, i2, i39, i15, i39);
                i17 += i36;
                i18 += i37;
                i19 += i38;
            }
        }
    }

    public static void b(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        int i11 = i4;
        int i12 = i5;
        if (i8 == 16 || i8 == 32) {
            i11 = i5;
            i12 = i4;
        }
        if (i8 == 4 || i8 == 16) {
            i6 = i7;
            i7 = i6;
        }
        int[] a2 = f.a((int[]) null);
        int length = i12 < a2.length / i11 ? i12 : a2.length / i11;
        int i13 = i6 >>> 24;
        int i14 = (i6 >> 16) & 255;
        int i15 = (i6 >> 8) & 255;
        int i16 = i6 & 255;
        int i17 = i11 - 1;
        int i18 = (((i7 >>> 24) - i13) << 16) / i17;
        int i19 = ((((i7 >> 16) & 255) - i14) << 16) / i17;
        int i20 = ((((i7 >> 8) & 255) - i15) << 16) / i17;
        int i21 = (((i7 & 255) - i16) << 16) / i17;
        int i22 = i17 + 1;
        int i23 = i13 << 16;
        int i24 = i14 << 16;
        int i25 = i15 << 16;
        int i26 = i16 << 16;
        if (i8 == 4 || i8 == 8) {
            i9 = i4;
            i10 = (-(i4 * length)) + 1;
        } else {
            i9 = 1;
            i10 = 0;
        }
        int i27 = 0;
        for (int i28 = 0; i28 < i22; i28++) {
            int i29 = length;
            while (true) {
                i29--;
                if (i29 >= 0) {
                    a2[i27] = i6;
                    i27 += i9;
                }
            }
            i23 += i18;
            i24 += i19;
            i25 += i20;
            i26 += i21;
            i6 = ((i23 << 8) & (-16777216)) | (i24 & 16711680) | ((i25 >> 8) & 65280) | ((i26 >> 16) & 255);
            i27 += i10;
        }
        if (i8 == 4 || i8 == 8) {
            while (i12 > 0) {
                a(b, a2, 0, i4, i2, i3, i4, length < i12 ? length : i12, true);
                i3 += length;
                i12 -= length;
            }
            return;
        }
        if (i8 == 16 || i8 == 32) {
            while (i12 > 0) {
                a(b, a2, 0, length, i2, i3, length < i12 ? length : i12, i5, true);
                i2 += length;
                i12 -= length;
            }
        }
    }

    public void addCommand(Command command) {
        super/*javax.microedition.lcdui.Displayable*/.addCommand(command);
    }

    private static final void d(int i2) {
        bu = i2;
    }

    /* renamed from: e, reason: collision with other method in class */
    private static final void m167e() {
        int i2 = bw;
        bw = f587c - bv;
        bv = i2;
    }

    protected void pointerReleased(int i2, int i3) {
        bv = i2;
        bw = i3;
        m167e();
        f635g = true;
    }

    protected void pointerPressed(int i2, int i3) {
        bv = i2;
        bw = i3;
        m167e();
        f634f = true;
    }

    protected void pointerDragged(int i2, int i3) {
        bv = i2;
        bw = i3;
        m167e();
        f636h = true;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static final boolean m168a() {
        return bu == 2;
    }

    /* renamed from: b, reason: collision with other method in class */
    public static final boolean m169b() {
        return bu == 1;
    }

    /* renamed from: c, reason: collision with other method in class */
    public static final boolean m170c() {
        return bu == 3;
    }

    /* renamed from: d, reason: collision with other method in class */
    public static final boolean m171d() {
        return bu == 0;
    }

    /* renamed from: e, reason: collision with other method in class */
    public static final boolean m172e() {
        return bu == 4;
    }

    public static final int l() {
        return bv;
    }

    public static final int m() {
        return bw;
    }

    public static final boolean c(int i2, int i3, int i4, int i5, int i6) {
        boolean z = false;
        if (bv > i3 && bv < i3 + i5 && bw > i4 && bw < i4 + i6) {
            switch (i2) {
                case 0:
                    z = m171d();
                    break;
                case 1:
                    z = m169b();
                    break;
                case 2:
                    z = m168a();
                    break;
                case 3:
                    z = m170c();
                    break;
                case 4:
                    z = m172e();
                    break;
            }
        }
        return z;
    }

    private static void b(Graphics graphics, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i4 - i2;
        int i10 = i5 - i3;
        if ((i9 < 0 ? -i9 : i9) > (i10 < 0 ? -i10 : i10)) {
            if (i4 < i2) {
                i2 = i4;
                i4 = i2;
                i3 = i5;
                i5 = i3;
                i7 = i8;
                i8 = i7;
            }
            int i11 = i4 - i2;
            int i12 = i11 != 0 ? ((i5 - i3) << 16) / i11 : 0;
            int i13 = i2;
            int i14 = (i3 << 16) + 0 + i12;
            int i15 = i4;
            int i16 = i11 != 0 ? ((i8 - i7) << 16) / i11 : 0;
            int[] a2 = f.a((int[]) null);
            int i17 = i7 << 16;
            boolean z = false;
            int clipX = i13 > graphics.getClipX() ? i13 : graphics.getClipX();
            int clipX2 = i15 < graphics.getClipX() + graphics.getClipWidth() ? i15 : graphics.getClipX() + graphics.getClipWidth();
            int i18 = clipX - i13;
            int i19 = i14 + (i12 * i18);
            int i20 = i17 + (i16 * i18);
            int clipY = graphics.getClipY() + graphics.getClipHeight();
            int clipY2 = graphics.getClipY();
            for (int i21 = clipX; i21 < clipX2; i21++) {
                int i22 = i19 >> 16;
                if (i22 < clipY2 || i22 >= clipY) {
                    i19 += i12;
                    i20 += i16;
                    if (z) {
                        return;
                    }
                } else {
                    z = true;
                    int i23 = i19 & 65535;
                    a2[0] = ((((65535 - i23) >> 8) * i20) & (-16777216)) | i6;
                    a2[1] = (((i23 >> 8) * i20) & (-16777216)) | i6;
                    a(graphics, a2, 0, 1, i21, i22, 1, 2, true);
                    i19 += i12;
                    i20 += i16;
                }
            }
            return;
        }
        if (i5 < i3) {
            i2 = i4;
            i4 = i2;
            i3 = i5;
            i5 = i3;
            i7 = i8;
            i8 = i7;
        }
        int i24 = i5 - i3;
        int i25 = i24 != 0 ? ((i4 - i2) << 16) / i24 : 0;
        int i26 = i3;
        int i27 = (i2 << 16) + 0 + i25;
        int i28 = i5;
        int i29 = i24 != 0 ? ((i8 - i7) << 16) / i24 : 0;
        int i30 = i7 << 16;
        int[] iArr = f.f514b;
        boolean z2 = false;
        int clipY3 = i26 > graphics.getClipY() ? i26 : graphics.getClipY();
        int clipY4 = i28 < graphics.getClipY() + graphics.getClipHeight() ? i28 : graphics.getClipY() + graphics.getClipHeight();
        int i31 = clipY3 - i26;
        int i32 = i27 + (i25 * i31);
        int i33 = i30 + (i29 * i31);
        int clipX3 = graphics.getClipX() + graphics.getClipWidth();
        int clipX4 = graphics.getClipX();
        for (int i34 = clipY3; i34 < clipY4; i34++) {
            int i35 = i32 >> 16;
            if (i35 < clipX4 || i35 >= clipX3) {
                i32 += i25;
                i33 += i29;
                if (z2) {
                    return;
                }
            } else {
                z2 = true;
                int i36 = i32 & 65535;
                iArr[0] = ((((65535 - i36) >> 8) * i33) & (-16777216)) | i6;
                iArr[1] = (((i36 >> 8) * i33) & (-16777216)) | i6;
                a(graphics, iArr, 0, 2, i35, i34, 2, 1, true);
                i32 += i25;
                i33 += i29;
            }
        }
    }
}
