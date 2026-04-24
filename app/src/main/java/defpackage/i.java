package defpackage;

import java.io.ByteArrayInputStream;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: Gangstar_Rio_Samsung_F480_EN_IGP_EU_TS_118.jar:i.class */
public final class i implements Runnable {
    int a;
    int b;
    int c;

    /* renamed from: a, reason: collision with other field name */
    f f643a;
    private int e;
    private int f;
    private int g;
    private int h;

    /* renamed from: a, reason: collision with other field name */
    private boolean f644a;
    private int i;
    private int k;
    static int d;
    private static int n;

    /* renamed from: b, reason: collision with other field name */
    private static boolean f645b;

    /* renamed from: a, reason: collision with other field name */
    private static byte[][] f646a;

    /* renamed from: a, reason: collision with other field name */
    private static int[] f647a;

    /* renamed from: b, reason: collision with other field name */
    private static int[] f648b;

    /* renamed from: a, reason: collision with other field name */
    private static Player[] f650a;

    /* renamed from: a, reason: collision with other field name */
    private static long[] f651a;

    /* renamed from: c, reason: collision with other field name */
    private static int[] f652c;

    /* renamed from: d, reason: collision with other field name */
    private static int[] f653d;

    /* renamed from: e, reason: collision with other field name */
    private static int[] f654e;

    /* renamed from: f, reason: collision with other field name */
    private static int[] f655f;

    /* renamed from: g, reason: collision with other field name */
    private static int[] f656g;

    /* renamed from: h, reason: collision with other field name */
    private static int[] f657h;

    /* renamed from: i, reason: collision with other field name */
    private static int[] f658i;

    /* renamed from: j, reason: collision with other field name */
    private static int[] f659j;

    /* renamed from: k, reason: collision with other field name */
    private static int[] f660k;

    /* renamed from: l, reason: collision with other field name */
    private static int[] f664l;

    /* renamed from: a, reason: collision with other field name */
    private static int[][] f665a;

    /* renamed from: a, reason: collision with other field name */
    private static byte[][][] f666a;

    /* renamed from: a, reason: collision with other field name */
    private static Image[][] f667a;

    /* renamed from: a, reason: collision with other field name */
    private static Graphics[][] f668a;

    /* renamed from: a, reason: collision with other field name */
    private static int[][][] f669a;
    private static int t;

    /* renamed from: a, reason: collision with other field name */
    private static f[] f670a;

    /* renamed from: a, reason: collision with other field name */
    private static f[][] f671a;

    /* renamed from: b, reason: collision with other field name */
    private static byte[][][] f672b;
    private static int j = 66;
    private static int l = -1;
    private static final int m = 1;

    /* renamed from: c, reason: collision with other field name */
    private static boolean f649c = false;

    /* renamed from: a, reason: collision with other field name */
    private static short[] f661a = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: b, reason: collision with other field name */
    private static short[] f662b = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, Short.MAX_VALUE};

    /* renamed from: d, reason: collision with other field name */
    private static boolean f663d = false;
    private static int o = 4;
    private static int p = -1;
    private static int q = -1;
    private static int r = 0;
    private static final int s = 140;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i() {
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(f fVar, int i, int i2) {
        a();
        this.a = i;
        this.b = i2;
        a(fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.a = 0;
        this.b = 0;
        this.e = l;
        this.f = 0;
        this.f643a = null;
        this.c = 0;
        this.g = 0;
        this.h = 1;
        this.k = -1;
        this.f644a = true;
        this.i = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a, reason: collision with other method in class */
    public final f m175a() {
        return this.f643a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(f fVar) {
        this.f643a = fVar;
        if (fVar != null) {
            b(l, -1);
        } else {
            this.e = l;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(int i, int i2) {
        if (this.f644a || i != this.e) {
            this.e = i;
            a(0);
            this.h = i2 - 1;
            this.f644a = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a, reason: collision with other method in class */
    public final int m176a() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(int i) {
        if (this.e < 0) {
            return -1;
        }
        int e = e();
        while (i > e) {
            i -= e;
        }
        this.f = i;
        this.g = 0;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c() {
        if (this.f643a == null || this.e == l) {
            return -1;
        }
        return this.f643a.e(this.e, this.f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a, reason: collision with other method in class */
    public final void m177a(int i) {
        switch (i) {
            case 0:
                this.c = 0;
                return;
            case 1:
                this.c = 2;
                return;
            case 2:
                this.c = 1;
                return;
            case 3:
                this.c = 3;
                return;
            case 4:
                this.c = 5;
                return;
            case 5:
                this.c = 4;
                return;
            case 6:
                this.c = 7;
                return;
            case 7:
                this.c = 6;
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int d() {
        switch (this.c) {
            case 0:
                return 0;
            case 1:
                return 2;
            case 2:
                return 1;
            case 3:
                return 3;
            case 4:
                return 5;
            case 5:
                return 4;
            case 6:
                return 7;
            case 7:
                return 6;
            default:
                return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int e() {
        if (this.e >= 0) {
            return this.f643a.m116a(this.e);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int f() {
        if (this.e >= 0) {
            return this.f643a.a(this.e, this.f) * j;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a, reason: collision with other method in class */
    public final boolean m178a() {
        if (this.e < 0) {
            return true;
        }
        if (this.h < 0) {
            return false;
        }
        return this.f644a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b, reason: collision with other method in class */
    public final void m179b() {
        if (this.e < 0) {
            return;
        }
        if (this.i != -1) {
            g.p(12);
            g.c(12, 1, this.i);
        }
        if (this.k != -1) {
            int f = this.f643a.f();
            this.f643a.m132e(this.k);
            this.f643a.a(g.b, this.e, this.f, this.a, this.b, this.c, 0, 0);
            this.f643a.m132e(f);
        } else {
            this.f643a.a(g.b, this.e, this.f, this.a, this.b, this.c, 0, 0);
        }
        g.C();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(int i) {
        if (this.f644a || this.e < 0) {
            return;
        }
        int f = f();
        int i2 = f;
        if (f == 0) {
            return;
        }
        while (true) {
            if (this.g < i2) {
                break;
            }
            this.g -= i2;
            if (this.f < this.f643a.m116a(this.e) - 1) {
                this.f++;
            } else if (this.h == 0) {
                this.f644a = true;
                break;
            } else {
                if (this.h > 0) {
                    this.h--;
                }
                this.f = 0;
            }
            int f2 = f();
            i2 = f2;
            if (f2 == 0) {
                break;
            }
        }
        this.g += i;
    }

    private static final int m(int i) {
        while (i >= 7) {
            i -= 7;
        }
        while (i < 0) {
            i += 7;
        }
        return i;
    }

    /* renamed from: a, reason: collision with other method in class */
    private static final int m180a(int i, int i2) {
        return (i * 7 * 5) + (i2 * 5);
    }

    private static void a(int i, int i2, int i3, int i4, int i5, int i6) {
        if (f645b) {
            int i7 = f658i[i];
            int i8 = f659j[i];
            int m2 = m(i7 + i8);
            for (int i9 = 0; i9 < i8; i9++) {
                int m180a = m180a(i, m((m2 - i9) - 1));
                if (f657h[m180a] == i2 && ((i2 != 3 && i2 != 1) || f657h[m180a + 2] >= i4)) {
                    f657h[m180a] = 0;
                }
            }
            int m180a2 = m180a(i, m2);
            f657h[m180a2] = i2;
            f657h[m180a2 + 1] = i3;
            f657h[m180a2 + 2] = i4;
            f657h[m180a2 + 3] = i5;
            f657h[m180a2 + 4] = i6;
            int[] iArr = f659j;
            iArr[i] = iArr[i] + 1;
        }
    }

    private static void b(int i, int i2, int i3, int i4, int i5, int i6) {
        a(i, i2, i3, i4, i5, i6);
    }

    private static final void d(int i, int i2) {
        b(i, i2, -1, -1, -1, -1);
    }

    private static void b(int i, int[] iArr) {
        iArr[5] = f659j[i];
        if (f659j[i] > 0) {
            System.arraycopy(f657h, m180a(i, f658i[i]), iArr, 0, 5);
            f658i[i] = m(f658i[i] + 1);
            int[] iArr2 = f659j;
            iArr2[i] = iArr2[i] - 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v25, types: [byte[], byte[][]] */
    public static void c(int i) {
        f650a = new Player[m];
        f652c = new int[m];
        f653d = new int[m];
        f654e = new int[m];
        f655f = new int[m];
        f656g = new int[m];
        f657h = new int[m * 7 * 5];
        f658i = new int[m];
        f659j = new int[m];
        f660k = new int[6];
        for (int i2 = 0; i2 < m; i2++) {
            f652c[i2] = -1;
            f658i[i2] = 0;
            f659j[i2] = 0;
        }
        n = 61;
        f646a = new byte[61];
        f647a = new int[n];
        f648b = new int[n];
        f651a = new long[m];
        d = 100;
        f645b = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void a(String str, int i) {
        if (!f645b || i < 0) {
            return;
        }
        g.a(str);
        byte[] m147a = g.m147a(i);
        int i2 = g.br;
        if (!f645b || m147a == null || m147a.length <= 0) {
            return;
        }
        f646a[i] = m147a;
        f647a[i] = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(int i, int i2, int i3, int i4, int i5) {
        if (i2 < 0) {
            return;
        }
        b(0, 3, i2, 0, 100, i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void d(int i) {
        d(0, 5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void e(int i) {
        d(0, 6);
    }

    private static void b(int i, int i2, int i3) {
        if (f654e[i] != 2 || f653d[i] >= i3) {
            if (f652c[i] != i2 || f654e[i] == 0) {
                k(i);
                if (f650a[i] == null) {
                    if (f646a[i2] == null) {
                        return;
                    } else {
                        f650a[i] = Manager.createPlayer(new ByteArrayInputStream(f646a[i2]), g.m152b(f647a[i2]));
                    }
                }
                if (f650a[i] == null) {
                    return;
                }
                f650a[i].realize();
                f650a[i].prefetch();
                f654e[i] = 1;
                f652c[i] = i2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(int i) {
        if (f645b) {
            d = i;
            for (int i2 = 0; i2 < m; i2++) {
                try {
                    int i3 = i2;
                    int i4 = f655f[i2];
                    if (!f645b || f650a[i3] == null) {
                    }
                } catch (Exception unused) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c, reason: collision with other method in class */
    public static void m181c() {
        boolean z;
        if (f645b) {
            for (int i = 0; i < m; i++) {
                b(i, f660k);
                if (f660k[5] > 0) {
                    if (f654e[i] == 2) {
                        try {
                            z = m182a(i);
                        } catch (Exception unused) {
                            z = false;
                        }
                        if (!z) {
                            f654e[i] = 1;
                        }
                    }
                    while (f660k[5] > 0) {
                        try {
                            switch (f660k[0]) {
                                case 1:
                                    b(i, f660k[1], f660k[2]);
                                    break;
                                case 2:
                                    k(i);
                                    break;
                                case 3:
                                    int i2 = i;
                                    int i3 = f660k[1];
                                    int i4 = f660k[2];
                                    int i5 = f660k[4];
                                    int i6 = f660k[3];
                                    if (!g.U) {
                                        b(i2, i3, i4);
                                        if (!g.U) {
                                            if (f654e[i2] != 1 || f650a[i2] == null) {
                                                break;
                                            } else {
                                                if (i5 == 0) {
                                                    f650a[i2].setLoopCount(-1);
                                                } else {
                                                    f650a[i2].setLoopCount(i5);
                                                }
                                                f650a[i2].start();
                                                f654e[i2] = 2;
                                                f655f[i2] = i6;
                                                f656g[i2] = i5;
                                                f653d[i2] = i4;
                                                f652c[i2] = i3;
                                                f651a[i2] = System.currentTimeMillis();
                                            }
                                        }
                                    }
                                    break;
                                case 4:
                                    int i7 = i;
                                    if (f650a[i7] != null) {
                                        f650a[i7].stop();
                                        f654e[i7] = 1;
                                        k(i7);
                                        f651a[i7] = 0;
                                    }
                                    break;
                                case 5:
                                    int i8 = i;
                                    if (f654e[i8] == 2 && f650a[i8] != null) {
                                        f650a[i8].stop();
                                        f654e[i8] = 3;
                                    }
                                    break;
                                case 6:
                                    int i9 = i;
                                    if (f654e[i9] == 3 && f650a[i9] != null) {
                                        f650a[i9].start();
                                        f654e[i9] = 2;
                                        break;
                                    }
                                    break;
                            }
                        } catch (Exception unused2) {
                        }
                        b(i, f660k);
                    }
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a, reason: collision with other method in class */
    public static boolean m182a(int i) {
        int m184b;
        if (f645b && i < m && f650a[i] != null && (m184b = m184b(i)) >= 0) {
            return f656g[i] == 0 || System.currentTimeMillis() - f651a[i] <= ((long) (f648b[m184b] * f656g[i]));
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(int i, int i2) {
        if (f645b && i >= 0) {
            f648b[i] = i2;
        }
    }

    private static void k(int i) {
        if (f645b) {
            if (f650a[i] != null) {
                f650a[i].stop();
                f650a[i].deallocate();
                f650a[i].close();
                f650a[i] = null;
                g.A();
            }
            f654e[i] = 0;
            f652c[i] = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d, reason: collision with other method in class */
    public static void m183d() {
        for (int i = 0; i < m; i++) {
            d(i, 4);
        }
        m181c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b, reason: collision with other method in class */
    public static int m184b(int i) {
        if (f645b && f652c != null) {
            return f652c[i];
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e, reason: collision with other method in class */
    public static void m185e() {
        try {
            m183d();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v13, types: [f[], f[][]] */
    public static void a(int i, int i2, int i3, int i4) {
        f664l = new int[8];
        f665a = new int[o][18];
        f667a = new Image[o][1];
        f668a = new Graphics[o][1];
        f666a = new byte[o][2];
        f670a = new f[o];
        f671a = new f[o];
        int k = g.k(16);
        int k2 = g.k(16);
        f664l[3] = k;
        f664l[2] = 1 << k;
        f664l[4] = f664l[2] - 1;
        f664l[6] = k2;
        f664l[5] = 1 << k2;
        f664l[7] = f664l[5] - 1;
        f669a = new int[o][s][4];
        f664l[0] = i;
        f664l[1] = i2;
        f663d = true;
    }

    /* renamed from: a, reason: collision with other method in class */
    private static final boolean m186a(int i, int i2) {
        return (f665a[i][15] & i2) != 0;
    }

    private static final void a(int i, int i2, boolean z) {
        if (z) {
            int[] iArr = f665a[i];
            iArr[15] = iArr[15] | i2;
        } else {
            int[] iArr2 = f665a[i];
            iArr2[15] = iArr2[15] & (i2 ^ (-1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, f fVar, int i2, int i3, int i4, int i5, boolean z) {
        if (f663d) {
            a(i, false);
            if (bArr3 != null) {
                int length = bArr3.length >> 2;
                int length2 = bArr3.length - (length << 2);
                byte[] bArr4 = new byte[length + (length2 == 0 ? 0 : 1)];
                int i6 = length;
                int length3 = (bArr3.length - length2) - 1;
                while (true) {
                    int i7 = i6;
                    i6--;
                    if (i7 == 0) {
                        break;
                    }
                    int i8 = length3;
                    int i9 = length3 - 1;
                    int i10 = i9 - 1;
                    int i11 = ((bArr3[i8] & 3) << 6) | ((bArr3[i9] & 3) << 4);
                    int i12 = i10 - 1;
                    int i13 = i11 | ((bArr3[i10] & 3) << 2);
                    length3 = i12 - 1;
                    bArr4[i6] = (byte) (i13 | (bArr3[i12] & 3));
                }
                int length4 = bArr3.length - 1;
                while (length2 != 0) {
                    bArr4[length] = (byte) (bArr4[length] | ((bArr3[length4] & 3) << ((length2 - 1) << 1)));
                    length2--;
                    length4--;
                }
                bArr3 = bArr4;
            }
            f666a[i][0] = bArr2;
            f666a[i][1] = bArr3;
            f665a[i][2] = g.a(bArr, 0);
            f665a[i][3] = g.a(bArr, 2);
            if (bArr.length > 4) {
                f665a[i][4] = g.a(bArr, 4);
            }
            f665a[i][5] = f665a[i][2] * f664l[2];
            f665a[i][6] = f665a[i][3] * f664l[5];
            f670a[i] = null;
            f665a[i][7] = (f664l[0] & (f664l[4] ^ (-1))) + (1 * f664l[2]);
            f665a[i][8] = (f664l[1] & (f664l[7] ^ (-1))) + (1 * f664l[5]);
            if (f665a[i][7] - f664l[0] < f664l[2]) {
                int[] iArr = f665a[i];
                iArr[7] = iArr[7] + f664l[2];
            }
            if (f665a[i][8] - f664l[1] < f664l[5]) {
                int[] iArr2 = f665a[i];
                iArr2[8] = iArr2[8] + f664l[5];
            }
            if (i == 0) {
                if (f667a[i][0] == null || f667a[i][0].getWidth() != f665a[i][8] || f667a[i][0].getHeight() != f665a[i][7]) {
                    try {
                        f667a[i][0] = Image.createImage(f665a[i][8], f665a[i][7]);
                        f668a[i][0] = f667a[i][0].getGraphics();
                    } catch (Exception unused) {
                    }
                }
                a(i, 64, true);
            } else {
                f667a[i][0] = f667a[0][0];
                f668a[i][0] = f668a[0][0];
            }
            a(i, 4, true);
            a(i, 128, true);
            f665a[i][9] = -1;
            f665a[i][10] = -1;
            f665a[i][11] = -1;
            f665a[i][12] = -1;
            f665a[i][0] = 1;
            f665a[i][1] = 1;
            f665a[i][13] = 0;
            f665a[i][14] = 0;
            f665a[i][16] = 0;
            f665a[i][17] = 0;
            a(i, 1, false);
            a(i, 16, true);
            a(i, 2, false);
            a(i, 32, true);
            a(i, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(int i) {
        a(i, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void a(int i, boolean z) {
        if (f663d) {
            f665a[i] = new int[18];
            if (z) {
                f667a[i] = new Image[1];
                f668a[i] = new Graphics[1];
            }
            f666a[i] = new byte[2];
            f670a[i] = null;
            if (f671a[i] != null) {
                f671a[i] = null;
            }
            if (f672b == null || f672b[i] == null) {
                return;
            }
            int length = f672b[i].length;
            for (int i2 = 0; i2 < length; i2++) {
                f672b[i][i2] = null;
            }
            f672b[i] = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void a(Graphics graphics, int i) {
        a(graphics, 0, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Graphics graphics, int i, int i2, int i3) {
        int i4;
        int i5;
        if (f663d) {
            int i6 = f664l[0];
            int i7 = f664l[1];
            if (i3 == -1) {
                for (int i8 = 0; i8 < o; i8++) {
                    a(graphics, i, i2, i8);
                }
                return;
            }
            int[] iArr = f665a[i3];
            if (iArr[0] == 1 && iArr[1] == 1) {
                int i9 = iArr[13] + iArr[16];
                int i10 = iArr[14] + iArr[17];
                if (!m186a(i3, 4)) {
                    if (graphics != null) {
                        int i11 = i9 >> f664l[3];
                        int i12 = i10 >> f664l[6];
                        int i13 = i6 >> f664l[3];
                        int i14 = i13;
                        if ((i13 << f664l[3]) < i6) {
                            i14++;
                        }
                        int i15 = i7 >> f664l[6];
                        int i16 = i15;
                        if ((i15 << f664l[6]) < i7) {
                            i16++;
                        }
                        a(graphics, i3, i11, i12, i14, i16, ((i11 << f664l[3]) - i9) + i, ((i12 << f664l[6]) - i10) + i2);
                        return;
                    }
                    return;
                }
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                if (g.m155a(graphics)) {
                    i17 = g.a(graphics);
                    i18 = g.b(graphics);
                    i19 = g.c(graphics);
                    i20 = g.d(graphics);
                }
                if (m186a(i3, 128)) {
                    t = 0;
                }
                int i21 = i9 >> f664l[3];
                int i22 = i10 >> f664l[6];
                int i23 = (i9 + f664l[0]) >> f664l[3];
                int i24 = (i10 + f664l[1]) >> f664l[6];
                int i25 = 0;
                int i26 = 0;
                if (iArr[10] != i22 || iArr[12] != i24) {
                    if (iArr[10] < i22 || iArr[12] < i24) {
                        if (iArr[12] < i22) {
                            i25 = i22;
                            i26 = i24;
                        } else {
                            i25 = iArr[12] + 1;
                            i26 = i24;
                        }
                    } else if (iArr[10] > i24) {
                        i25 = i22;
                        i26 = i24;
                    } else {
                        i25 = i22;
                        i26 = iArr[10] - 1;
                    }
                }
                if (iArr[9] != i21 || iArr[11] != i23) {
                    if (iArr[9] < i21 || iArr[11] < i23) {
                        if (iArr[11] < i21) {
                            i4 = i21;
                            i5 = i23;
                        } else {
                            i4 = iArr[11] + 1;
                            i5 = i23;
                        }
                    } else if (iArr[9] > i23) {
                        i4 = i21;
                        i5 = i23;
                    } else {
                        i4 = i21;
                        i5 = iArr[9] - 1;
                    }
                    int i27 = i24 - i22;
                    int i28 = i22;
                    if (iArr[10] != i22 || iArr[12] != i24) {
                        if (iArr[10] < i22 || iArr[12] < i24) {
                            i27 -= (i26 - i25) + 1;
                        } else {
                            i27 -= (i26 - i25) + 1;
                            i28 += (i26 - i25) + 1;
                        }
                    }
                    if (i27 >= 0) {
                        a(f668a[i3][0], i3, i4, i28, i5 - i4, i27, 0, 0);
                    }
                    iArr[9] = i21;
                    iArr[11] = i23;
                }
                if (iArr[10] != i22 || iArr[12] != i24) {
                    a(f668a[i3][0], i3, i21, i25, i23 - i21, i26 - i25, 0, 0);
                    iArr[10] = i22;
                    iArr[12] = i24;
                }
                if (graphics != null) {
                    if (m186a(i3, 273)) {
                        while (i9 < 0) {
                            i9 += iArr[7];
                        }
                    } else if (i9 < 0) {
                        i -= i9;
                        i9 = 0;
                    } else if (i9 > iArr[5] - i6) {
                        i -= i9 - (iArr[5] - i6);
                        i9 = iArr[5] - i6;
                    }
                    if (m186a(i3, 290)) {
                        while (i10 < 0) {
                            i10 += iArr[8];
                        }
                    } else if (i10 < 0) {
                        i2 -= i10;
                        i10 = 0;
                    } else if (i10 > iArr[6] - i7) {
                        i2 -= i10 - (iArr[6] - i7);
                        i10 = iArr[6] - i7;
                    }
                    int i29 = i9 % iArr[7];
                    int i30 = i10 % iArr[8];
                    int i31 = (i9 + i6) % iArr[7];
                    int i32 = (i10 + i7) % iArr[8];
                    g.b(graphics, i17, i18, i19, i20);
                    if (i31 > i29) {
                        if (i32 > i30) {
                            a(graphics, i3, i29, i30, i6, i7, i + 0, i2 + 0, i17, i18, i19, i20);
                        } else {
                            a(graphics, i3, i29, i30, i6, i7 - i32, i + 0, i2 + 0, i17, i18, i19, i20);
                            g.b(graphics, i17, i18, i19, i20);
                            a(graphics, i3, i29, 0, i6, i32, i + 0, (i7 - i32) + i2, i17, i18, i19, i20);
                        }
                    } else if (i32 > i30) {
                        a(graphics, i3, i29, i30, i6 - i31, i7, i + 0, i2 + 0, i17, i18, i19, i20);
                        g.b(graphics, i17, i18, i19, i20);
                        a(graphics, i3, 0, i30, i31, i7, (i6 - i31) + i, i2 + 0, i17, i18, i19, i20);
                    } else {
                        a(graphics, i3, i29, i30, i6 - i31, i7 - i32, i + 0, i2 + 0, i17, i18, i19, i20);
                        g.b(graphics, i17, i18, i19, i20);
                        a(graphics, i3, i29, 0, i6 - i31, i32, i + 0, (i7 - i32) + i2, i17, i18, i19, i20);
                        g.b(graphics, i17, i18, i19, i20);
                        a(graphics, i3, 0, i30, i31, i7 - i32, (i6 - i31) + i, i2 + 0, i17, i18, i19, i20);
                        g.b(graphics, i17, i18, i19, i20);
                        a(graphics, i3, 0, 0, i31, i32, (i6 - i31) + i, (i7 - i32) + i2, i17, i18, i19, i20);
                    }
                    g.b(graphics, i17, i18, i19, i20);
                }
            }
        }
    }

    private static void a(Graphics graphics, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        if (i6 > i8 + i10 || i7 > i9 + i11 || i6 + i4 < i8 || i7 + i5 < i9) {
            return;
        }
        g.a(graphics, i6, i7, i4, i5);
        g.a(graphics, f667a[i][0], ((i3 - i7) + g.f()) - f665a[i][8], i6 - i2, 20, false);
    }

    public static void a(Graphics graphics, int i, int i2, int i3, int i4, int i5) {
        int a = a(i, 0, i2, i3, true);
        if (a != 65535) {
            int i6 = f665a[i][4];
            int i7 = a & ((1 << i6) - 1);
            int i8 = a >> i6;
            f fVar = f671a[i][i7];
            int a2 = f666a[i][1] == null ? 0 : a(i, 1, i2, m187b(i, i3), false);
            if (fVar.m117a() == 0) {
                fVar.b(graphics, i8, i4, i5, a2);
                return;
            }
            int i9 = i4;
            int i10 = i5;
            if ((a2 & 1) != 0) {
                i9 = i4 + f664l[2];
            }
            if ((a2 & 2) != 0) {
                i10 = i5 + f664l[5];
            }
            fVar.a(graphics, i8, i9, i10, a2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void h(int i) {
        a((Graphics) null, 0, 0, -1);
    }

    private static void a(Graphics graphics, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z;
        boolean m186a = m186a(i, 4);
        boolean m186a2 = m186a(i, 1);
        boolean m186a3 = m186a(i, 2);
        int i15 = f665a[i][2];
        int i16 = f665a[i][3];
        int i17 = f664l[2];
        int i18 = f664l[5];
        int i19 = i15 * i16;
        if (m186a) {
            f.m122a(f665a[i][7], f665a[i][8]);
        }
        if (m186a) {
            i8 = ((i2 << f664l[3]) % f665a[i][7]) + i6;
            i9 = ((i3 << f664l[6]) % f665a[i][8]) + i7;
            if (i8 < 0) {
                i8 += f665a[i][7];
            }
            if (i9 < 0) {
                i9 += f665a[i][8];
            }
        } else {
            i8 = i6;
            i9 = i7;
        }
        if (m186a2) {
            while (i2 < 0) {
                i2 += i15;
            }
            while (i2 >= i15) {
                i2 -= i15;
            }
        } else if (!m186a(i, 16)) {
            if (i2 < 0) {
                i8 -= i2 * i17;
                i4 += i2;
                i2 = 0;
                if (m186a && i8 >= f665a[i][7]) {
                    i8 = 0;
                }
            }
            if (i2 + i4 >= i15) {
                i4 = (i15 - i2) - 1;
            }
            if (i4 < 0) {
                f.m122a(g.d(), g.e());
                return;
            }
        }
        if (m186a3) {
            while (i3 < 0) {
                i3 += i16;
            }
            while (i3 >= i16) {
                i3 -= i16;
            }
        } else if (!m186a(i, 32)) {
            if (i3 < 0) {
                i9 -= i3 * i18;
                i5 += i3;
                i3 = 0;
                if (m186a && i9 >= f665a[i][8]) {
                    i9 = 0;
                }
            }
            if (i3 + i5 >= i16) {
                i5 = (i16 - i3) - 1;
            }
            if (i5 < 0) {
                f.m122a(g.d(), g.e());
                return;
            }
        }
        int i20 = i8;
        int i21 = i9;
        int i22 = (1 << f665a[i][4]) - 1;
        while (true) {
            int i23 = i5;
            i5--;
            if (i23 < 0) {
                break;
            }
            i20 = i8;
            int i24 = i4;
            int i25 = i2;
            while (true) {
                int i26 = i24;
                i24--;
                if (i26 < 0) {
                    break;
                }
                int i27 = i25 + (i3 * i15);
                if (i27 < i19) {
                    if (f671a[i] != null) {
                        int a = a(i, 0, i27, true);
                        i14 = a;
                        boolean z2 = a == 65535;
                        z = z2;
                        if (!z2) {
                            f670a[i] = f671a[i][i14 & i22];
                            i14 >>= f665a[i][4];
                        }
                    } else {
                        int a2 = a(i, 0, i27, true);
                        i14 = a2;
                        z = a2 == 65535;
                    }
                    if (!z) {
                        int i28 = f665a[i][2];
                        int i29 = i27 % i28;
                        int i30 = i27 / i28;
                        int a3 = f666a[i][1] == null ? 0 : a(i, 1, i27, false);
                        if (f670a[i].m117a() == 0) {
                            f670a[i].b(graphics, i14, i20, i21, a3);
                        } else {
                            int i31 = i20;
                            int i32 = i21;
                            if ((a3 & 1) != 0) {
                                i31 += i17;
                            }
                            if ((a3 & 2) != 0) {
                                i32 += i18;
                            }
                            f670a[i].a(graphics, i14, i31, i32, a3);
                        }
                    }
                }
                i20 += i17;
                i25++;
                if (i25 >= i15) {
                    if (!m186a2) {
                        break;
                    } else {
                        i25 = 0;
                    }
                }
                if (m186a && i20 >= f665a[i][7]) {
                    i20 = 0;
                }
            }
            i21 += i18;
            i3++;
            if (i3 >= i16) {
                if (!m186a3) {
                    break;
                } else {
                    i3 = 0;
                }
            }
            if (m186a && i21 >= f665a[i][8]) {
                i21 = 0;
            }
        }
        if (m186a(i, 128)) {
            if (i20 > i8) {
                i10 = i20;
                i11 = 0;
            } else {
                i10 = f665a[i][7];
                i11 = i20;
            }
            if (i21 > i9) {
                i12 = i21;
                i13 = 0;
            } else {
                i12 = f665a[i][8];
                i13 = i21;
            }
            int i33 = 0;
            while (i33 < 4) {
                if (((i33 != 1 && i33 != 3) || i11 != 0) && ((i33 != 2 && i33 != 3) || i13 != 0)) {
                    c(i, (i33 == 0 || i33 == 2) ? i8 : 0, (i33 == 0 || i33 == 1) ? i9 : 0, (i33 == 0 || i33 == 2) ? i10 - i8 : i11, (i33 == 0 || i33 == 1) ? i12 - i9 : i13);
                }
                i33++;
            }
        }
        f.m122a(g.d(), g.e());
    }

    private static final void c(int i, int i2, int i3, int i4, int i5) {
        int[] iArr = f669a[i][t];
        iArr[0] = i2;
        iArr[1] = i3;
        iArr[2] = i4;
        iArr[3] = i5;
        t++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(int i, int[] iArr) {
        int i2 = t;
        if (i2 > 0) {
            int i3 = f665a[0][7];
            int i4 = f665a[0][8];
            int[] iArr2 = f665a[0];
            int i5 = iArr2[13];
            int i6 = iArr2[14];
            int i7 = f664l[2];
            int i8 = f664l[5];
            int i9 = i5 % i7;
            int i10 = i6 % i8;
            if (i9 < 0) {
                i9 = i7 + i9;
            }
            if (i10 < 0) {
                i10 = i8 + i10;
            }
            int i11 = i5 - i9;
            int i12 = i6 - i10;
            int i13 = (!m186a(0, 273) || i11 >= 0) ? i11 % iArr2[7] : iArr2[7] + (i11 % iArr2[7]);
            int i14 = (!m186a(0, 290) || i12 >= 0) ? i12 % iArr2[8] : iArr2[8] + (i12 % iArr2[8]);
            int[][] iArr3 = f669a[0];
            int[] iArr4 = iArr3[0];
            iArr[0] = (iArr4[0] + i11) - i13;
            if (iArr4[0] < i13) {
                iArr[0] = iArr[0] + i3;
            }
            iArr[1] = (iArr4[1] + i12) - i14;
            if (iArr4[1] < i14) {
                iArr[1] = iArr[1] + i4;
            }
            iArr[2] = iArr[0] + iArr4[2];
            iArr[3] = iArr[1] + iArr4[3];
            for (int i15 = 1; i15 < i2; i15++) {
                int[] iArr5 = iArr3[i15];
                int i16 = (iArr5[0] + i11) - i13;
                if (iArr5[0] < i13) {
                    i16 += i3;
                }
                int i17 = (iArr5[1] + i12) - i14;
                if (iArr5[1] < i14) {
                    i17 += i4;
                }
                g.a(iArr, i16, i17, i16 + iArr5[2], i17 + iArr5[3]);
            }
        }
    }

    /* renamed from: b, reason: collision with other method in class */
    private static final int m187b(int i, int i2) {
        return m186a(i, 8) ? (f665a[i][6] - f664l[1]) - i2 : i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void a(int i, int i2, int i3) {
        f665a[i][13] = i2;
        f665a[i][14] = m187b(i, i3);
        if (m186a(i, 16)) {
            if (f665a[i][13] < 0) {
                f665a[i][13] = 0;
            } else if (f665a[i][13] + f664l[0] >= f665a[i][5]) {
                f665a[i][13] = (f665a[i][5] - f664l[0]) - 1;
            }
        }
        if (m186a(i, 32)) {
            if (f665a[i][14] < 0) {
                f665a[i][14] = 0;
            } else if (f665a[i][14] + f664l[1] >= f665a[i][6]) {
                f665a[i][14] = (f665a[i][6] - f664l[1]) - 1;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c, reason: collision with other method in class */
    public static final int m188c(int i) {
        return f665a[0][13];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d, reason: collision with other method in class */
    public static final int m189d(int i) {
        return m186a(0, 8) ? (f665a[0][6] - f664l[1]) - f665a[0][14] : f665a[0][14];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e, reason: collision with other method in class */
    public static final int m190e(int i) {
        return f665a[0][5];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f, reason: collision with other method in class */
    public static final int m191f(int i) {
        return f665a[0][6];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g, reason: collision with other method in class */
    public static final int m192g(int i) {
        return f665a[i][2];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h, reason: collision with other method in class */
    public static final int m193h(int i) {
        return f665a[i][3];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a, reason: collision with other method in class */
    public static final Image m194a(int i) {
        return f667a[0][0];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a, reason: collision with other method in class */
    public static final Graphics m195a(int i) {
        return f668a[0][0];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(int i) {
        if (f663d) {
            f665a[i][9] = -1;
            f665a[i][10] = -1;
            f665a[i][11] = -1;
            f665a[i][12] = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void a(int i, f fVar, int i2, int i3, int i4, int i5, boolean z) {
        a(0, 0, fVar, i2, i3, i4, 0, 0, i5, z);
    }

    private static void a(int i, int i2, f fVar, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        if (t == 0 && !z) {
            return;
        }
        int[] iArr = f665a[i2];
        int f = fVar.f(i3);
        int g = fVar.g(i3);
        int d2 = fVar.d(i3);
        int e = fVar.e(i3);
        if ((i8 & 1) != 0) {
            f = (-f) - d2;
        }
        if ((i8 & 2) != 0) {
            g = (-g) - e;
        }
        if ((i8 & 4) != 0) {
            int i9 = f;
            f = (-g) - e;
            g = i9;
            d2 = e;
            e = d2;
        }
        int m187b = m187b(i2, i5);
        int i10 = iArr[13];
        int i11 = iArr[14];
        int i12 = f664l[2];
        int i13 = f664l[5];
        int i14 = i10 % i12;
        int i15 = i11 % i13;
        if (i14 < 0) {
            i14 = i12 + i14;
        }
        if (i15 < 0) {
            i15 = i13 + i15;
        }
        int i16 = i10 - i14;
        int i17 = i11 - i15;
        int i18 = i4 - i16;
        int i19 = m187b - i17;
        if (m186a(i2, 273) && i16 < 0) {
            i16 = iArr[7] + (i16 % iArr[7]);
        }
        if (m186a(i2, 290) && i17 < 0) {
            i17 = iArr[8] + (i17 % iArr[8]);
        }
        int i20 = i16 % iArr[7];
        int i21 = i17 % iArr[8];
        int i22 = iArr[7] - i20;
        int i23 = iArr[8] - i21;
        Graphics graphics = f668a[i2][0];
        f.m122a(f665a[i2][7], f665a[i2][8]);
        int a = g.a(graphics);
        int b = g.b(graphics);
        int c = g.c(graphics);
        int d3 = g.d(graphics);
        int i24 = 1;
        if (!z) {
            i24 = t;
        }
        while (true) {
            i24--;
            if (i24 < 0) {
                g.b(graphics, a, b, c, d3);
                f.m122a(g.d(), g.e());
                return;
            }
            int[] iArr2 = null;
            if (!z) {
                int[] iArr3 = f669a[i2][i24];
                iArr2 = iArr3;
                int i25 = iArr3[0] - i20;
                if (iArr2[0] < i20) {
                    i25 += iArr[7];
                }
                if (i18 + f < i25 + iArr2[2] && i18 + f + d2 >= i25) {
                    int i26 = iArr2[1] - i21;
                    if (iArr2[1] < i21) {
                        i26 += iArr[8];
                    }
                    if (i19 + g < i26 + iArr2[3] && i19 + g + e >= i26) {
                    }
                }
            }
            if (i18 + f < i22) {
                if (i19 + g < i23) {
                    g.b(graphics, a, b, c, d3);
                    g.a(graphics, i20, i21, i22, i23);
                    if (!z) {
                        g.a(graphics, iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
                    }
                    fVar.b(graphics, i3, i20 + i18, i21 + i19, i8, i6, i7);
                }
                if (i19 + g + e >= i23 && i21 != 0) {
                    g.b(graphics, a, b, c, d3);
                    g.a(graphics, i20, 0, i22, i21);
                    if (!z) {
                        g.a(graphics, iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
                    }
                    fVar.b(graphics, i3, i20 + i18, i19 - i23, i8, i6, i7);
                }
            }
            if (i18 + f + d2 >= i22 && i20 != 0) {
                if (i19 + g < i23) {
                    g.b(graphics, a, b, c, d3);
                    g.a(graphics, 0, i21, i20, i23);
                    if (!z) {
                        g.a(graphics, iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
                    }
                    fVar.b(graphics, i3, i18 - i22, i21 + i19, i8, i6, i7);
                }
                if (i19 + g + e >= i23 && i21 != 0) {
                    g.b(graphics, a, b, c, d3);
                    g.a(graphics, 0, 0, i20, i21);
                    if (!z) {
                        g.a(graphics, iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
                    }
                    fVar.b(graphics, i3, i18 - i22, i19 - i23, i8, i6, i7);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(int i, f fVar, int i2, int i3, int i4, int i5) {
        int f = fVar.f(i2);
        int g = fVar.g(i2);
        int d2 = fVar.d(i2);
        int e = fVar.e(i2);
        if ((i5 & 1) != 0) {
            f = (-f) - d2;
        }
        if ((i5 & 2) != 0) {
            g = (-g) - e;
        }
        if ((i5 & 4) != 0) {
            int i6 = f;
            f = (-g) - e;
            g = i6;
            d2 = e;
            e = d2;
        }
        b(i, i3 + f, i4 + g, d2, e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(int i, int i2, int i3, int i4, int i5) {
        if (m186a(i, 4)) {
            int[] iArr = f665a[i];
            int i6 = iArr[9] << f664l[3];
            int i7 = iArr[10] << f664l[6];
            int i8 = i6 + iArr[7];
            int i9 = i7 + iArr[8];
            int i10 = i2 + i4;
            int i11 = i3 + i5;
            if (i11 <= i7 || i9 <= i3 || i10 <= i6 || i8 <= i2) {
                return;
            }
            int i12 = i2 >> f664l[3];
            int i13 = i3 >> f664l[6];
            int i14 = (i10 - 1) >> f664l[3];
            int i15 = (i11 - 1) >> f664l[6];
            if (i12 < iArr[9]) {
                i12 = iArr[9];
            }
            if (i13 < iArr[10]) {
                i13 = iArr[10];
            }
            if (i14 > iArr[11]) {
                i14 = iArr[11];
            }
            if (i15 > iArr[12]) {
                i15 = iArr[12];
            }
            a(f668a[i][0], i, i12, i13, i14 - i12, i15 - i13, 0, 0);
        }
    }

    /* renamed from: i, reason: collision with other method in class */
    public static final int m196i(int i) {
        return f664l[i];
    }

    public static final int j(int i) {
        return i >> f664l[3];
    }

    /* renamed from: k, reason: collision with other method in class */
    public static final int m197k(int i) {
        return i >> f664l[6];
    }

    public static final int l(int i) {
        return f665a[0][8];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(int i, int i2, f[] fVarArr) {
        f671a[i] = null;
        f671a[i] = new f[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            f671a[i][i3] = fVarArr[i3];
        }
    }

    private static int a(int i, int i2, int i3, boolean z) {
        return z ? g.a(f666a[i][i2], i3 << 1) & 65535 : i2 == 1 ? (f666a[i][i2][i3 >> 2] >> ((i3 & 3) << 1)) & 3 : f666a[i][i2][i3] & 255;
    }

    private static int a(int i, int i2, int i3, int i4, boolean z) {
        return a(i, i2, (i4 * f665a[i][2]) + i3, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [byte[][], byte[][][]] */
    public static void a(int i, byte[][] bArr) {
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2;
            byte[] bArr2 = bArr[i2];
            if (f672b == null) {
                f672b = new byte[o];
            }
            if (f672b[i] == null) {
                f672b[i] = new byte[length];
            }
            f672b[i][i3] = bArr2;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static int m198a(int i, int i2, int i3) {
        int a = a(0, 0, i2, m187b(0, i3), true);
        int i4 = f665a[0][4];
        int i5 = a >> i4;
        if (i5 == 65535) {
            return 0;
        }
        return f672b[0][a & ((1 << i4) - 1)][i5];
    }

    /* renamed from: j, reason: collision with other method in class */
    public static void m199j(int i) {
        f.m136g(3);
        boolean z = true;
        f fVar = null;
        int i2 = f665a[i][2] - 1;
        int i3 = f665a[i][3] - 1;
        int i4 = f665a[i][4];
        for (int i5 = i3; i5 >= 0; i5--) {
            for (int i6 = i2; i6 >= 0; i6--) {
                int a = a(i, 0, i6, i5, true);
                int i7 = a;
                boolean z2 = a == 65535;
                boolean z3 = z2;
                if (!z2) {
                    f fVar2 = f671a[i][i7 & ((1 << i4) - 1)];
                    fVar = fVar2;
                    z = fVar2.m117a() == 0;
                    i7 >>= i4;
                }
                if (!z3) {
                    if (z) {
                        fVar.b((Graphics) null, i7, 0, 0, 0);
                    } else {
                        fVar.a((Graphics) null, i7, 0, 0, 0);
                    }
                }
            }
        }
        f.m136g(0);
    }
}
