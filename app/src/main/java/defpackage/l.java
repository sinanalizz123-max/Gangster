package defpackage;

import java.io.InputStream;
import java.util.Hashtable;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;

/* loaded from: Gangstar_Rio_Samsung_F480_EN_IGP_EU_TS_118.jar:l.class */
public final class l implements Runnable, CommandListener {
    private static String d;

    /* renamed from: a, reason: collision with other field name */
    private static Font f776a;

    /* renamed from: e, reason: collision with other field name */
    private static int f780e;
    private static int f;
    private static int g;
    private static int j;
    private static int m;
    private static int n;
    private static int o;
    private static int p;
    private static int q;
    private static int r;
    private static int s;
    private static int t;
    private static int u;
    private static int v;
    private static int w;
    private static int x;
    private static int y;
    private static int z;
    private static int A;
    private static int B;
    private static int C;
    private static int D;
    private static int E;
    private static int F;
    private static int G;
    private static int H;
    private static int I;
    private static int J;
    private static int L;

    /* renamed from: b, reason: collision with other field name */
    private static int[] f791b;

    /* renamed from: a, reason: collision with other field name */
    private static byte[][] f792a;
    private static int M;

    /* renamed from: a, reason: collision with other field name */
    private static byte[] f793a;
    private static int N;

    /* renamed from: a, reason: collision with other field name */
    private static Image[] f794a;
    private static int S;

    /* renamed from: c, reason: collision with other field name */
    private static int[] f795c;
    private static int T;
    private static int U;

    /* renamed from: a, reason: collision with other field name */
    private static boolean f796a;

    /* renamed from: F, reason: collision with other field name */
    private static String f816F;

    /* renamed from: b, reason: collision with other field name */
    private static boolean f817b;

    /* renamed from: c, reason: collision with other field name */
    private static boolean f818c;

    /* renamed from: G, reason: collision with other field name */
    private static String f820G;

    /* renamed from: c, reason: collision with other field name */
    private static String[] f822c;

    /* renamed from: d, reason: collision with other field name */
    private static String[] f823d;

    /* renamed from: e, reason: collision with other field name */
    private static String[] f824e;
    private static int V;
    private static int W;

    /* renamed from: f, reason: collision with other field name */
    private static String[] f825f;

    /* renamed from: a, reason: collision with other field name */
    private static short[] f826a;
    private static int X;

    /* renamed from: e, reason: collision with other field name */
    private static boolean f827e;

    /* renamed from: f, reason: collision with other field name */
    private static boolean f828f;

    /* renamed from: a, reason: collision with other field name */
    private static MIDlet f833a;

    /* renamed from: a, reason: collision with other field name */
    private static Canvas f834a;

    /* renamed from: H, reason: collision with other field name */
    private static String f835H;
    private static int Y;
    private static int Z;
    private static int aa;
    private static int ab;
    private static int ac;
    private static int ad;

    /* renamed from: b, reason: collision with other field name */
    private static Image[] f843b;

    /* renamed from: c, reason: collision with other field name */
    private static Image[] f844c;

    /* renamed from: a, reason: collision with other field name */
    private static Image f845a;

    /* renamed from: b, reason: collision with other field name */
    private static Image f846b;

    /* renamed from: d, reason: collision with other field name */
    private static Image[] f847d;

    /* renamed from: c, reason: collision with other field name */
    private static Image f848c;

    /* renamed from: d, reason: collision with other field name */
    private static Image f849d;

    /* renamed from: e, reason: collision with other field name */
    private static Image f850e;

    /* renamed from: f, reason: collision with other field name */
    private static Image f851f;

    /* renamed from: g, reason: collision with other field name */
    private static Image f852g;

    /* renamed from: h, reason: collision with other field name */
    private static Image f853h;

    /* renamed from: i, reason: collision with other field name */
    private static Image f854i;

    /* renamed from: j, reason: collision with other field name */
    private static Image f855j;

    /* renamed from: k, reason: collision with other field name */
    private static Image f856k;

    /* renamed from: l, reason: collision with other field name */
    private static Image f857l;

    /* renamed from: m, reason: collision with other field name */
    private static Image f858m;

    /* renamed from: n, reason: collision with other field name */
    private static Image f859n;

    /* renamed from: e, reason: collision with other field name */
    private static Image[] f860e;

    /* renamed from: o, reason: collision with other field name */
    private static Image f861o;

    /* renamed from: p, reason: collision with other field name */
    private static Image f862p;

    /* renamed from: a, reason: collision with other field name */
    private static Image[][] f863a;

    /* renamed from: a, reason: collision with other field name */
    private static String[][] f864a;

    /* renamed from: a, reason: collision with other field name */
    private static int[][] f865a;

    /* renamed from: b, reason: collision with other field name */
    private static int[][] f866b;

    /* renamed from: d, reason: collision with other field name */
    private static int[] f867d;
    private static int ae;
    private static int af;
    private static int ag;
    private static int ah;
    private static int ai;
    private static int aj;
    private static int ak;
    private static int al;
    private static int am;
    private static int an;

    /* renamed from: g, reason: collision with other field name */
    private static String[] f868g;

    /* renamed from: e, reason: collision with other field name */
    private static int[] f869e;

    /* renamed from: b, reason: collision with other field name */
    private static boolean[] f870b;
    private static int aq;

    /* renamed from: n, reason: collision with other field name */
    private static boolean f871n;

    /* renamed from: a, reason: collision with other field name */
    private static byte f872a;

    /* renamed from: b, reason: collision with other field name */
    private static byte f873b;
    private static int ar;

    /* renamed from: o, reason: collision with other field name */
    private static boolean f874o;
    private static int as;
    private static int at;
    private static int au;
    private static int av;
    private static int aw;
    private static int ax;

    /* renamed from: J, reason: collision with other field name */
    private static String f876J;

    /* renamed from: K, reason: collision with other field name */
    private static String f877K;

    /* renamed from: M, reason: collision with other field name */
    private static String f879M;

    /* renamed from: N, reason: collision with other field name */
    private static String f880N;
    private static int ay;
    private static int az;
    private static int aA;
    private static int aB;
    private static int aC;
    private static int aD;

    /* renamed from: a, reason: collision with other field name */
    private static Command f882a;

    /* renamed from: b, reason: collision with other field name */
    private static Command f883b;
    private static int aJ;
    private static int aK;
    private static int aL;
    private static String a = "2.2";
    private static String b = new StringBuffer().append("IGP-Signature=").append(a).toString();
    private static String c = "";

    /* renamed from: a, reason: collision with other field name */
    private static int f775a = 0;
    private static String e = "URL";

    /* renamed from: b, reason: collision with other field name */
    private static int f777b = 13568256;

    /* renamed from: c, reason: collision with other field name */
    private static int f778c = 8;

    /* renamed from: d, reason: collision with other field name */
    private static int f779d = 8;
    private static int h = 0;
    private static int i = 0;

    /* renamed from: a, reason: collision with other field name */
    private static boolean[] f781a = new boolean[1];

    /* renamed from: a, reason: collision with other field name */
    private static int[] f782a = new int[1];
    private static int k = -1;
    private static int l = 8;

    /* renamed from: f, reason: collision with other field name */
    private static String f783f = "WN";

    /* renamed from: g, reason: collision with other field name */
    private static String f784g = "BS";

    /* renamed from: h, reason: collision with other field name */
    private static String f785h = "CATALOG";

    /* renamed from: i, reason: collision with other field name */
    private static String f786i = "GLDT";

    /* renamed from: j, reason: collision with other field name */
    private static String f787j = "ZVIP";

    /* renamed from: k, reason: collision with other field name */
    private static String f788k = "PROMO";

    /* renamed from: l, reason: collision with other field name */
    private static String f789l = "URL-PT";

    /* renamed from: m, reason: collision with other field name */
    private static String f790m = "URL-OPERATOR";
    private static int K = 15;
    private static int O = 0;
    private static int P = 1;
    private static int Q = 2;
    private static int R = 3;

    /* renamed from: a, reason: collision with other field name */
    private static String[] f797a = {new StringBuffer().append(e).append("-").append(f783f).toString(), new StringBuffer().append(e).append("-").append(f784g).toString(), e};

    /* renamed from: n, reason: collision with other field name */
    private static String f798n = "IGP-PROMOS";

    /* renamed from: o, reason: collision with other field name */
    private static String f799o = "IGP-WN";

    /* renamed from: p, reason: collision with other field name */
    private static String f800p = "IGP-BS";

    /* renamed from: q, reason: collision with other field name */
    private static String f801q = "IGP-CATEGORIES";

    /* renamed from: r, reason: collision with other field name */
    private static String f802r = "URL-TEMPLATE-GAME";

    /* renamed from: s, reason: collision with other field name */
    private static String f803s = "more_games_url";

    /* renamed from: t, reason: collision with other field name */
    private static String f804t = "more_games_status";

    /* renamed from: u, reason: collision with other field name */
    private static String f805u = null;

    /* renamed from: v, reason: collision with other field name */
    private static String f806v = null;

    /* renamed from: w, reason: collision with other field name */
    private static String f807w = "on";

    /* renamed from: x, reason: collision with other field name */
    private static String f808x = "XXXX";

    /* renamed from: y, reason: collision with other field name */
    private static String f809y = new StringBuffer().append("&ctg=").append(f808x).toString();

    /* renamed from: z, reason: collision with other field name */
    private static String f810z = "&ctg=";

    /* renamed from: A, reason: collision with other field name */
    private static String f811A = "&lg=";

    /* renamed from: B, reason: collision with other field name */
    private static String f812B = "SC";

    /* renamed from: C, reason: collision with other field name */
    private static String f813C = "CCTL";

    /* renamed from: D, reason: collision with other field name */
    private static String f814D = "ingameads.gameloft.com/redir";

    /* renamed from: E, reason: collision with other field name */
    private static String f815E = ";";

    /* renamed from: d, reason: collision with other field name */
    private static boolean f819d = true;

    /* renamed from: b, reason: collision with other field name */
    private static String[] f821b = new String[0];

    /* renamed from: g, reason: collision with other field name */
    private static boolean f829g = false;

    /* renamed from: h, reason: collision with other field name */
    private static boolean f830h = false;

    /* renamed from: a, reason: collision with other field name */
    private static long f831a = 0;

    /* renamed from: i, reason: collision with other field name */
    private static boolean f832i = true;

    /* renamed from: j, reason: collision with other field name */
    private static boolean f836j = false;

    /* renamed from: a, reason: collision with other field name */
    private static CommandListener f837a = null;

    /* renamed from: a, reason: collision with other field name */
    private static l f838a = null;

    /* renamed from: k, reason: collision with other field name */
    private static boolean f839k = false;

    /* renamed from: I, reason: collision with other field name */
    private static String f840I = null;

    /* renamed from: l, reason: collision with other field name */
    private static boolean f841l = false;

    /* renamed from: m, reason: collision with other field name */
    private static boolean f842m = false;
    private static int ao = -1;
    private static int ap = 0;

    /* renamed from: p, reason: collision with other field name */
    private static boolean f875p = true;

    /* renamed from: L, reason: collision with other field name */
    private static String f878L = "";

    /* renamed from: q, reason: collision with other field name */
    private static boolean f881q = false;
    private static int aE = 0;

    /* renamed from: r, reason: collision with other field name */
    private static boolean f884r = false;

    /* renamed from: s, reason: collision with other field name */
    private static boolean f885s = false;
    private static int aF = -1;
    private static int aG = -1;
    private static int aH = -1;
    private static int aI = -1;

    /* renamed from: a, reason: collision with other field name */
    private static Hashtable f886a = new Hashtable();

    /* renamed from: t, reason: collision with other field name */
    private static boolean f887t = false;
    private static int aM = 0;

    /* renamed from: u, reason: collision with other field name */
    private static boolean f888u = false;

    /* renamed from: b, reason: collision with other field name */
    private static short[] f889b = new short[50];

    private static boolean d() {
        a();
        try {
            InputStream a2 = a("/dataIGP");
            int read = a2.read() & 255;
            L = read;
            int read2 = read + ((a2.read() & 255) << 8);
            L = read2;
            f791b = new int[read2];
            for (int i2 = 0; i2 < L; i2++) {
                f791b[i2] = a2.read() & 255;
                int[] iArr = f791b;
                int i3 = i2;
                iArr[i3] = iArr[i3] + ((a2.read() & 255) << 8);
                int[] iArr2 = f791b;
                int i4 = i2;
                iArr2[i4] = iArr2[i4] + ((a2.read() & 255) << 16);
                int[] iArr3 = f791b;
                int i5 = i2;
                iArr3[i5] = iArr3[i5] + ((a2.read() & 255) << 24);
            }
            a2.close();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static void a() {
        f791b = null;
        f792a = null;
        L = 0;
        System.gc();
    }

    private static byte[] a(int i2) {
        int i3;
        if (i2 < 0 || i2 >= L - 1 || (i3 = f791b[i2 + 1] - f791b[i2]) == 0) {
            return null;
        }
        byte[] bArr = null;
        try {
            InputStream a2 = a("/dataIGP");
            a2.skip(2 + (4 * L) + f791b[i2]);
            byte[] bArr2 = new byte[i3];
            bArr = bArr2;
            for (int length = bArr2.length; length > 0; length -= a2.read(bArr)) {
            }
            a2.close();
        } catch (Exception unused) {
        }
        return bArr;
    }

    private static int a(byte[] bArr) {
        int i2 = M;
        M = i2 + 1;
        int i3 = bArr[i2] & 255;
        int i4 = M;
        M = i4 + 1;
        return i3 + ((bArr[i4] & 255) << 8);
    }

    /* renamed from: a, reason: collision with other method in class */
    private static byte[] m286a(byte[] bArr) {
        int a2 = a(bArr);
        byte[] bArr2 = new byte[a2];
        System.arraycopy(bArr, M, bArr2, 0, a2);
        M += a2;
        return bArr2;
    }

    /* renamed from: a, reason: collision with other method in class */
    private static Image m287a(byte[] bArr) {
        byte[] m286a = m286a(bArr);
        return Image.createImage(m286a, 0, m286a.length);
    }

    /* renamed from: a, reason: collision with other method in class */
    private static String m288a(int i2) {
        return new StringBuffer().append("").append(f825f[i2]).toString();
    }

    private static int a(int i2, int i3) {
        if (aM == 0) {
            return f793a[(i2 << 2) + i3] & 255;
        }
        if (i3 != 0 && i3 != P) {
            return f793a[(i2 * 6) + i3] & 255;
        }
        return 0 | (((f793a[((i2 * 6) + i3) + 1] & 255) & 255) << 8) | (f793a[(i2 * 6) + i3] & 255 & 255);
    }

    private static void a(int i2, Graphics graphics, int i3, int i4, int i5) {
        a(m288a(i2), graphics, aA, i3, i4, i5);
    }

    private static void a(String str, Graphics graphics, int i2, int i3, int i4, int i5) {
        a(str, graphics, i3, i4, i5);
    }

    private static void a(String str, Graphics graphics, int i2, int i3, int i4) {
        char[] charArray = str.toCharArray();
        f795c[0] = 0;
        U = 0;
        int i5 = 0;
        int length = str.length();
        int i6 = 0;
        int[] iArr = {3633, 3636, 3637, 3638, 3639, 3640, 3641, 3642, 3655, 3656, 3657, 3658, 3659, 3660, 3661, 3662};
        if (aA <= 176 && f869e[aa] == 4) {
            i6 = 0 + 2;
        }
        int i7 = 0;
        while (i7 < length) {
            char c2 = charArray[i7];
            boolean z2 = i5 < 10;
            boolean z3 = c2 == '\n';
            boolean z4 = c2 == '\\';
            boolean z5 = i7 != length - 1 && charArray[i7 + 1] == 'N';
            boolean z6 = i7 != length - 1 && charArray[i7 + 1] == 'n';
            boolean z7 = false;
            int i8 = 0;
            while (true) {
                if (i8 >= iArr.length) {
                    break;
                }
                if (c2 == iArr[i8]) {
                    z7 = true;
                    break;
                }
                i8++;
            }
            if (z2 && (z3 || (z4 && (z5 || z6)))) {
                if (z4 && (z5 || z6)) {
                    i7++;
                }
                int[] iArr2 = f795c;
                int i9 = i5;
                iArr2[i9] = iArr2[i9] - i;
                if (f795c[i5] > U) {
                    U = f795c[i5];
                }
                i5++;
                f795c[i5] = 0;
            } else if (c2 != 0 && c2 != 1 && !z7) {
                int[] iArr3 = f795c;
                int i10 = i5;
                iArr3[i10] = iArr3[i10] + a((int) c2, Q) + i;
            }
            i7++;
        }
        int[] iArr4 = f795c;
        int i11 = i5;
        iArr4[i11] = iArr4[i11] - i;
        if (f795c[i5] > U) {
            U = f795c[i5];
        }
        T = ((i5 + 1) * N) + (i5 * (i6 + 0));
        if (f796a) {
            f796a = false;
            return;
        }
        int i12 = i3 + (((i6 + 0) * i5) / 2);
        int i13 = 0;
        if ((i4 & 32) != 0) {
            i12 -= T;
        } else if ((i4 & 2) != 0) {
            i12 -= T >> 1;
        }
        int i14 = i2;
        boolean z8 = true;
        boolean z9 = false;
        a(graphics, 0, 0, aA, aB);
        int i15 = 0;
        while (i15 < length) {
            char c3 = charArray[i15];
            if (z8) {
                i14 = i2;
                if ((i4 & 8) != 0) {
                    i14 = i2 - f795c[i13];
                } else if ((i4 & 1) != 0) {
                    i14 = i2 - (f795c[i13] >> 1);
                }
                z8 = false;
            }
            boolean z10 = i13 < 10;
            boolean z11 = c3 == '\n';
            boolean z12 = c3 == '\\';
            boolean z13 = i15 != length - 1 && charArray[i15 + 1] == 'N';
            boolean z14 = i15 != length - 1 && charArray[i15 + 1] == 'n';
            if (z10 && (z11 || (z12 && (z13 || z14)))) {
                if (z12 && (z13 || z14)) {
                    i15++;
                }
                i12 += (N + i6) - 1;
                i13++;
                z8 = true;
                z9 = true;
            } else {
                if (z9) {
                    z9 = false;
                    char c4 = charArray[i15 - 2];
                    if (c4 == ' ') {
                        i14 -= (a((int) c4, Q) + i) >> 1;
                    }
                    if (c3 == ' ') {
                        i14 += (a((int) c3, Q) + i) >> 1;
                    }
                }
                a(graphics, i14, i12, a((int) c3, Q), a((int) c3, R));
                int i16 = 0;
                int i17 = 0;
                while (true) {
                    if (i17 >= iArr.length) {
                        break;
                    }
                    if (c3 == iArr[i17]) {
                        i14 -= a((int) c3, Q) + i;
                        break;
                    }
                    i17++;
                }
                if (c3 == 3635) {
                    i14 -= a(3585, Q) / 2;
                }
                if (c3 >= 3585 && c3 <= 3675) {
                    if (a((int) c3, R) > 13 && a((int) c3, R) <= 16) {
                        i16 = -2;
                    }
                    a(graphics, i14, i12 + i16, a((int) c3, Q), a((int) c3, R));
                }
                graphics.drawRegion(f794a[S], a((int) c3, 0), a((int) c3, P), a((int) c3, Q), a((int) c3, R), 0, i14, i12 + i16, 20);
                i14 += a((int) c3, Q) + i;
            }
            i15++;
        }
        a(graphics, 0, 0, aA, aB);
    }

    public static void a(MIDlet mIDlet, Canvas canvas, int i2, int i3) {
        new StringBuffer().append("initialize(midlet = ").append(mIDlet).append(", game = ").append(canvas).append(", screenWidth = ").append(i2).append(", screenHeight = ").append(i3).append(", cmdListener = ").append((Object) null).append(")");
        aA = i2;
        aB = i3;
        aC = aA >> 1;
        aD = aB >> 1;
        f780e = aB;
        f875p = aB >= 160;
        f = (aB << 1) / 100;
        g = aB / 2;
        if (8 > aA) {
            f778c = 2;
        }
        if (8 > aA) {
            f779d = 2;
        }
        if (f833a != null || canvas == null) {
            return;
        }
        f833a = mIDlet;
        f834a = canvas;
        b();
        new StringBuffer().append(b).append("");
        boolean e2 = e();
        f842m = e2;
        if (e2 && f881q) {
            f842m = false;
        }
        f814D = null;
        f816F = null;
        f802r = null;
        f801q = null;
        f803s = null;
        f804t = null;
        f807w = null;
        f783f = null;
        f784g = null;
        f785h = null;
        f786i = null;
        f787j = null;
        f788k = null;
        f789l = null;
        f790m = null;
        e = null;
        f808x = null;
        f809y = null;
        f812B = null;
        f810z = null;
        f813C = null;
        f815E = null;
        f798n = null;
        f797a = null;
        f799o = null;
        f800p = null;
        System.gc();
    }

    private static boolean a(String str, int i2) {
        if (str == null) {
            return (i2 & 1) == 0;
        }
        String trim = str.trim();
        if ((i2 & 1) != 0 && trim.length() == 0) {
            return false;
        }
        if ((i2 & 2) != 0 && trim.toUpperCase().compareTo("DEL") == 0) {
            return false;
        }
        if ((i2 & 4) != 0) {
            return (trim.toUpperCase().compareTo("NO") == 0 || trim.toUpperCase().compareTo("0") == 0) ? false : true;
        }
        return true;
    }

    private static String a(String str, String str2, String str3) {
        int indexOf;
        String trim;
        String str4 = "";
        if (str3 != null && str != null && str2 != null) {
            try {
                indexOf = str.indexOf(new StringBuffer().append(str2).append("=").toString());
                trim = str3.trim();
            } catch (Exception unused) {
                str4 = "";
            }
            if (indexOf >= 0 && trim.length() > 0) {
                int length = indexOf + str2.length() + 1;
                int indexOf2 = str.indexOf(f815E, length);
                int i2 = indexOf2;
                if (indexOf2 < 0) {
                    i2 = str.length();
                }
                String trim2 = str.substring(length, i2).trim();
                str4 = trim2;
                if (trim2.length() == 0 || str4.compareTo("0") == 0 || str4.toUpperCase().compareTo("NO") == 0) {
                    str4 = "";
                } else if (str4.toUpperCase().compareTo("DEL") != 0 && str2.compareTo("OP") != 0) {
                    int indexOf3 = trim.indexOf(f808x);
                    if (indexOf3 >= 0) {
                        str4 = new StringBuffer().append(trim.substring(0, indexOf3)).append(str4).append(trim.substring(indexOf3 + f808x.length())).toString();
                    } else {
                        str4 = trim;
                    }
                }
                return str4;
            }
        }
        return str4;
    }

    private static void a(int i2, String str, int i3, String str2, String str3) {
        try {
            String a2 = f818c ? a(f833a.getAppProperty(str2), str, str3) : f833a.getAppProperty(new StringBuffer().append(e).append("-").append(str).toString());
            if (a(a2, 7)) {
                if (a2.toUpperCase().compareTo("NO") == 0 && a2.toUpperCase().compareTo("0") == 0) {
                    return;
                }
                f870b[i2] = true;
                f868g[i2] = a2;
                if (!f870b[i2] || i2 == m) {
                    return;
                }
                ap++;
                f869e[i2] = 4;
                if (f817b) {
                    StringBuffer stringBuffer = new StringBuffer();
                    String[] strArr = f868g;
                    strArr[i2] = stringBuffer.append(strArr[i2]).append(f810z).append(f812B).append(ap < 10 ? "0" : "").append(ap).toString();
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0182 A[Catch: Exception -> 0x01b1, TryCatch #1 {Exception -> 0x01b1, blocks: (B:29:0x009e, B:31:0x00a7, B:33:0x00ad, B:17:0x0178, B:19:0x0182, B:34:0x00c1, B:36:0x00ca, B:38:0x00f1, B:39:0x00f9, B:12:0x0107, B:14:0x010d, B:16:0x011a, B:23:0x012a, B:25:0x0137, B:26:0x013f, B:27:0x014e), top: B:28:0x009e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r5, java.lang.String[] r6, int r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l.a(int, java.lang.String[], int, java.lang.String):void");
    }

    /* renamed from: a, reason: collision with other method in class */
    private static String[] m289a(byte[] bArr) {
        String[] strArr = new String[a(bArr)];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            int a2 = a(bArr);
            strArr[i2] = new String(bArr, M, a2);
            M += a2;
        }
        return strArr;
    }

    /* JADX WARN: Type inference failed for: r0v105, types: [java.lang.String[], java.lang.String[][]] */
    /* JADX WARN: Type inference failed for: r0v107, types: [int[], int[][]] */
    /* JADX WARN: Type inference failed for: r0v109, types: [int[], int[][]] */
    private static void b() {
        try {
            if (!d()) {
                f841l = false;
                return;
            }
            byte[] a2 = a(0);
            a(a2);
            M += a(a2);
            M += a(a2);
            M += a(a2);
            M += a(a2);
            int a3 = a(a2);
            f820G = new String(a2, M, a3);
            M += a3;
            a(a2);
            a(a2);
            f819d = a(a2) == 1;
            f821b = m289a(a2);
            String[] m289a = m289a(a2);
            f822c = m289a(a2);
            f823d = m289a(a2);
            f824e = m289a(a2);
            for (int i2 = 0; i2 < f781a.length; i2++) {
                f781a[i2] = a(a2) == 1;
            }
            try {
                c = new String(a2, M, a(a2));
                new StringBuffer().append("IGP dataIGP version: ").append(c);
                if (c.equals("2.2z")) {
                    aM = 2;
                    P = 2;
                    Q = 4;
                    R = 5;
                }
                if (!c.startsWith(a)) {
                    new StringBuffer().append("Invalid dataIGP file, dataIGP file IGP Version : ").append(c);
                    new StringBuffer().append("IGP Class version : ").append(a);
                }
            } catch (Exception unused) {
                f841l = false;
            }
            a();
            int length = (m289a.length - 1 > 0 ? m289a.length - 1 : 0) + 4 + 1;
            r = length;
            int i3 = length + 1;
            s = i3;
            int i4 = i3 + 1;
            t = i4;
            int i5 = i4 + 1;
            u = i5;
            int i6 = i5 + 1;
            v = i6;
            int i7 = i6 + 1;
            w = i7;
            int i8 = i7 + 1;
            x = i8;
            int i9 = i8 + 1;
            y = i9;
            int i10 = i9 + 1;
            z = i10;
            int i11 = i10 + 1;
            A = i11;
            int i12 = i11 + 1;
            B = i12;
            int i13 = i12 + 1;
            C = i13;
            int i14 = i13 + 1;
            D = i14;
            if (f822c.length > 1) {
                int i15 = i14 + 1;
                E = i15;
                F = i15 + (f822c.length - 1);
            } else {
                F = i14 + 1;
            }
            int i16 = F;
            if (f823d.length > 1) {
                int i17 = i16 + 1;
                G = i17;
                H = i17 + (f823d.length - 1);
            } else {
                H = i16 + 1;
            }
            int i18 = H + 1;
            I = i18;
            J = i18 + 1;
            int length2 = m289a.length;
            V = length2;
            f860e = new Image[length2];
            W = V + 1 + 1 + 1 + 1 + (f781a[0] ? 1 : 0);
            for (int i19 = 0; i19 < f781a.length; i19++) {
                if (f781a[i19]) {
                    int i20 = l + 1;
                    l = i20;
                    f782a[i19] = i20;
                } else {
                    int i21 = k - 1;
                    k = i21;
                    f782a[i19] = i21;
                }
            }
            int i22 = l + 1;
            l = i22;
            j = i22;
            f868g = new String[W];
            f870b = new boolean[W];
            f869e = new int[W];
            for (int i23 = 0; i23 < f870b.length; i23++) {
                f870b[i23] = false;
            }
            int i24 = V;
            m = i24;
            int i25 = i24 + 1;
            n = i25;
            int i26 = i25 + 1;
            o = i26;
            int i27 = i26 + 1;
            p = i27;
            q = i27 + 1;
            f864a = new String[3];
            f865a = new int[3];
            f866b = new int[3];
            f867d = new int[3];
            f805u = f833a.getAppProperty(f803s);
            f806v = f833a.getAppProperty(f804t);
            if (f805u != null && f806v.toLowerCase().equals(f807w.toLowerCase())) {
                f880N = f805u;
                f881q = true;
                f841l = true;
                return;
            }
            try {
                String appProperty = f833a.getAppProperty(f802r);
                f816F = appProperty;
                if (appProperty != null) {
                    f816F = f816F.trim();
                    f818c = true;
                    if (f816F.indexOf(f814D) != -1) {
                        f817b = true;
                    }
                }
            } catch (Exception unused2) {
            }
            for (int i28 = 0; i28 < V; i28++) {
                a(i28, m289a[i28], 7, f798n, f816F);
            }
            try {
                String trim = f833a.getAppProperty(f790m).trim();
                if (a(trim, 7)) {
                    f878L = trim;
                }
                f876J = f833a.getAppProperty(f789l);
            } catch (Exception unused3) {
            }
            if (!f781a[0]) {
                if (!f818c) {
                    String appProperty2 = f833a.getAppProperty(new StringBuffer().append(e).append("-").append(f788k).toString());
                    if (appProperty2 != null) {
                        if (a(f833a.getAppProperty(new StringBuffer().append(e).append("-").append(f788k).toString()), 7)) {
                            f868g[m] = appProperty2;
                            f870b[m] = true;
                            f869e[m] = 5;
                        }
                    }
                } else if (a(f878L, 7)) {
                    a(V, f788k, 7, f801q, new StringBuffer().append(f878L).append(f817b ? f809y : "").toString());
                }
            }
            a(0, f822c, F, f799o);
            a(1, f823d, H, f800p);
            if (!f781a[0]) {
                if (f818c) {
                    if (a(a(f833a.getAppProperty(f801q), "OP", f878L), 7)) {
                        if (a(f878L, 7)) {
                            f870b[p] = true;
                        }
                        f868g[p] = f878L;
                    }
                } else if (a(f878L, 7)) {
                    f868g[p] = f878L;
                    f870b[p] = true;
                }
                if (f870b[p] && f817b) {
                    StringBuffer stringBuffer = new StringBuffer();
                    String[] strArr = f868g;
                    int i29 = p;
                    strArr[i29] = stringBuffer.append(strArr[i29]).append(f810z).append(f813C).toString();
                }
            }
            if (f781a[0]) {
                try {
                    if (a(f878L, 7)) {
                        f868g[q] = f878L;
                        f870b[q] = true;
                    }
                } catch (Exception unused4) {
                }
            }
            int m294a = m294a();
            ao = m294a;
            if (m294a > 0) {
                f841l = true;
            }
            new StringBuffer().append("isAvailable = ").append(f841l);
        } catch (Exception unused5) {
            f841l = false;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m290a() {
        return f841l;
    }

    /* renamed from: b, reason: collision with other method in class */
    public static boolean m291b() {
        return f841l;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m292a(String str, int i2) {
        new StringBuffer().append("enterIGP(loadingMsg = ").append(str).append(", appLanguage = ").append(0).append(" (").append(f821b[0]).append(")");
        f862p = Image.createImage(aA, aB);
        if (f881q) {
            m293c();
            f839k = true;
            f840I = f880N;
        } else {
            m301e();
            f887t = false;
            if (0 >= 0 && 0 < f821b.length) {
                ax = 0 <= f821b.length ? 0 : 0;
                f877K = str;
                ac = -1;
                Y = 0;
                ab = -1;
                aa = 0;
                ah = 0;
                ai = 0;
                f795c = new int[10];
                f839k = true;
                f776a = Font.getFont(0, 0, 8);
                f872a = (byte) 0;
                f873b = (byte) 0;
                m293c();
            }
            ad = 4 + W;
            aa = m295b();
            if (f836j) {
                f834a.setCommandListener(f838a);
            }
        }
        f829g = true;
        f830h = true;
        RecordStore recordStore = null;
        try {
            recordStore = RecordStore.openRecordStore("igp19", false);
        } catch (Exception unused) {
            try {
                recordStore = RecordStore.openRecordStore("igp19", true);
            } catch (Exception unused2) {
            }
        }
        if (recordStore != null) {
            try {
                recordStore.closeRecordStore();
            } catch (Exception unused3) {
            }
        }
    }

    public static boolean c() {
        return f842m;
    }

    private static boolean e() {
        boolean z2 = false;
        for (int i2 = 0; i2 < f821b.length; i2++) {
            if (f821b[i2].equals("SP")) {
                z2 = true;
            }
        }
        if (!z2) {
            return false;
        }
        try {
            String appProperty = f833a.getAppProperty(f801q);
            if (appProperty == null || appProperty.indexOf(f787j) == -1) {
                String appProperty2 = f833a.getAppProperty(new StringBuffer().append(e).append("-").append(f787j).toString());
                f879M = appProperty2;
                return appProperty2 != null;
            }
            int indexOf = appProperty.indexOf(f787j) + f787j.length() + 1;
            int length = indexOf + f787j.length();
            if (length >= appProperty.length() || !appProperty.substring(indexOf, length).equals(f787j)) {
                return false;
            }
            f879M = f878L;
            if (f817b) {
                String stringBuffer = new StringBuffer().append(f879M).append(f809y).toString();
                f879M = stringBuffer;
                int indexOf2 = stringBuffer.indexOf(f808x);
                if (indexOf2 >= 0) {
                    f879M = new StringBuffer().append(f879M.substring(0, indexOf2)).append(f787j).append(f879M.substring(indexOf2 + f808x.length())).toString();
                }
                if (f879M.length() == 0) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c, reason: collision with other method in class */
    private static void m293c() {
        if (f838a == null) {
            f838a = new l();
        }
        new Thread(f838a).start();
    }

    /* renamed from: a, reason: collision with other method in class */
    private static int m294a() {
        int i2 = 0;
        for (int i3 = 0; i3 < f870b.length; i3++) {
            if (f870b[i3]) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: b, reason: collision with other method in class */
    private static int m295b() {
        for (int i2 = 0; i2 < f870b.length; i2++) {
            if (f870b[i2]) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: d, reason: collision with other method in class */
    private static void m296d() {
        if (f876J == null) {
            return;
        }
        int length = f876J.length();
        if (length <= 0) {
            f876J = null;
            return;
        }
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        String str = "";
        az = 0;
        String upperCase = f876J.toUpperCase();
        f876J = upperCase;
        char[] charArray = upperCase.toCharArray();
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                break;
            }
            char c2 = charArray[i6];
            if ((c2 < ' ' || c2 > 'z') && c2 != 130 && c2 != '\n') {
                str = null;
                break;
            }
            if (c2 == '\n') {
                z2 = true;
            } else if (i6 < length - 1 && c2 == '\\' && (charArray[i6 + 1] == 'n' || charArray[i6 + 1] == 'N')) {
                z2 = true;
                i6++;
            }
            if (z2) {
                if (str.length() > 0) {
                    i5++;
                    if (i5 == 3) {
                        str = null;
                        break;
                    }
                    str = new StringBuffer().append(str).append('\n').toString();
                    if (i3 > az) {
                        az = i3;
                    }
                    i3 = 0;
                } else {
                    str = new StringBuffer().append(str).append("").toString();
                }
                z2 = false;
            } else {
                str = new StringBuffer().append(str).append(c2).toString();
                i3 += a((int) c2, Q);
                if (c2 == ' ') {
                    i2 = str.length() - 1;
                    i4 = i3;
                }
            }
            if (i3 >= aA) {
                if (i5 >= 3) {
                    str = null;
                    break;
                }
                if (i2 != i6) {
                    if (i2 == 0) {
                        str = null;
                        break;
                    }
                    str = new StringBuffer().append(str.substring(0, i2)).append("\n").append(str.substring(i2 + 1, str.length())).toString();
                    i3 -= i4;
                    if (i4 > az) {
                        az = i4;
                    }
                } else {
                    str = new StringBuffer().append(str).append("\n").toString();
                    i3 = 0;
                }
                i5++;
            }
            i6++;
        }
        if (str != null && !a(str, 7)) {
            str = null;
        }
        f876J = str;
        ay = i5;
        if (i3 > az) {
            az = i3;
        }
        az += a(79, Q) << 1;
    }

    /* JADX WARN: Type inference failed for: r0v164, types: [javax.microedition.lcdui.Image[], javax.microedition.lcdui.Image[][]] */
    /* renamed from: a, reason: collision with other method in class */
    private static void m297a(int i2) {
        M = 0;
        switch (i2) {
            case -1:
                f843b = new Image[K];
                f844c = new Image[W];
                ?? r0 = new Image[3];
                f863a = r0;
                r0[0] = new Image[f822c.length];
                f863a[1] = new Image[f823d.length];
                f863a[2] = new Image[f824e.length];
                return;
            case 0:
                d();
                return;
            case 1:
                byte[] a2 = a(i2);
                for (int i3 = 0; i3 < ax; i3++) {
                    M += a(a2);
                }
                a(a2);
                int a3 = a(a2);
                f825f = new String[a3];
                byte[] bArr = new byte[a3];
                System.arraycopy(a2, M, bArr, 0, a3);
                M += a3;
                a(a2);
                int i4 = M;
                M = i4 + 1;
                int i5 = a2[i4] & 255;
                int i6 = M;
                M = i6 + 1;
                int i7 = i5 | ((a2[i6] & 255) << 8);
                f826a = new short[i7];
                for (int i8 = 0; i8 < i7 - 1; i8++) {
                    int i9 = M;
                    M = i9 + 1;
                    int i10 = a2[i9] & 255;
                    int i11 = M;
                    M = i11 + 1;
                    f826a[i8] = (short) (i10 + ((a2[i11] & 255) << 8));
                }
                f826a[i7 - 1] = (short) a3;
                int i12 = 0;
                while (i12 < i7) {
                    int i13 = i12 == 0 ? 0 : f826a[i12 - 1] & 65535;
                    int i14 = (f826a[i12] & 65535) - i13;
                    if (i14 != 0) {
                        try {
                            f825f[i12] = new String(bArr, i13, i14, "UTF-8");
                        } catch (Exception unused) {
                        }
                    }
                    i12++;
                }
                if (f836j) {
                    f882a = new Command(m288a(x), 4, 1);
                    f883b = new Command(m288a(y), 2, 1);
                    if (f883b != null) {
                        f834a.removeCommand(f883b);
                    }
                    if (f882a != null) {
                        f834a.removeCommand(f882a);
                    }
                    f834a.addCommand(f882a);
                    f834a.addCommand(f883b);
                    return;
                }
                return;
            case 2:
                f794a = new Image[7];
                byte[] a4 = a(i2);
                byte[] bArr2 = new byte[a4.length];
                System.arraycopy(a4, 0, bArr2, 0, a4.length);
                int a5 = a(a4);
                M = 0;
                f794a[0] = m287a(a4);
                if (f820G.equals("128x")) {
                    f794a[5] = b(bArr2, 2, a5, 1, 4084831);
                } else {
                    f794a[5] = b(bArr2, 2, a5, 1, 8956605);
                }
                f794a[2] = b(bArr2, 2, a5, 1, 16711680);
                int a6 = a(a4);
                f793a = new byte[(a(a4) + 1) * (4 + aM)];
                int i15 = a6 / (6 + aM);
                for (int i16 = 0; i16 < i15; i16++) {
                    System.arraycopy(a4, M, f793a, a(a4) * (4 + aM), 4 + aM);
                    M += 4 + aM;
                }
                byte b2 = f793a[(32 * (4 + aM)) + R];
                N = b2;
                i = b2 == 13 ? 0 : -1;
                m296d();
                return;
            case 3:
                byte[] a7 = a(i2);
                for (int i17 = 0; i17 < K; i17++) {
                    if (i17 == 14) {
                        f847d = new Image[4];
                        byte[] m286a = m286a(a7);
                        f847d[0] = a(m286a, 0, m286a.length, 0, 0);
                        f847d[1] = a(m286a, 0, m286a.length, 0, f781a[0] ? 16744192 : 13568256);
                        f847d[2] = a(m286a, 0, m286a.length, 0, 5767410);
                        f847d[3] = a(m286a, 0, m286a.length, 0, 14588928);
                        f843b[i17] = f847d[0];
                    } else {
                        f843b[i17] = m287a(a7);
                    }
                }
                return;
            case 4:
                for (int i18 = 0; i18 < V; i18++) {
                    f844c[i18] = m287a(a(i2));
                }
                return;
            case 5:
                byte[] a8 = a(i2);
                byte[] m286a2 = m286a(a8);
                f844c[m] = Image.createImage(m286a2, 0, m286a2.length);
                for (int i19 = 0; i19 < ax; i19++) {
                    m287a(a8);
                }
                f845a = m287a(a8);
                return;
            case 6:
            case 7:
                int length = (i2 == 6 ? f822c.length : f823d.length) - 1;
                boolean z2 = i2 != 6;
                byte[] a9 = a(i2);
                int i20 = 0;
                while (i20 < length) {
                    f863a[z2 ? 1 : 0][i20] = m287a(a9);
                    i20++;
                }
                f863a[z2 ? 1 : 0][i20] = f843b[11];
                f844c[i2 == 6 ? n : o] = f843b[10];
                return;
            case 8:
                byte[] a10 = a(i2);
                f844c[p] = m287a(a10);
                if ((f821b[ax].equals("JP") || f821b[ax].equals("DOCOMO")) && f846b == null) {
                    f846b = m287a(a10);
                    return;
                }
                return;
            default:
                if (i2 == f782a[0]) {
                    f844c[q] = m287a(a(i2));
                    return;
                } else {
                    if (i2 == j) {
                        a();
                        return;
                    }
                    return;
                }
        }
    }

    private static void b(boolean z2) {
        for (int i2 = 0; i2 < f863a.length; i2++) {
            if (f863a[i2] != null) {
                for (int i3 = 0; i3 < f863a[i2].length; i3++) {
                    f863a[i2][i3] = null;
                }
            }
        }
        for (int i4 = 0; i4 < f844c.length; i4++) {
            f844c[i4] = null;
        }
        f845a = null;
        f846b = null;
        if (z2) {
            a();
            f793a = null;
            f794a = null;
            for (int i5 = 0; i5 < K; i5++) {
                f843b[i5] = null;
            }
            f843b = null;
            f826a = null;
            f825f = null;
            f795c = null;
            f877K = null;
            f844c = null;
            f863a = null;
            f848c = null;
            f849d = null;
            f850e = null;
            f851f = null;
            f852g = null;
            f853h = null;
            f854i = null;
            f855j = null;
            f856k = null;
            f857l = null;
            f858m = null;
            f859n = null;
            f862p = null;
            f861o = null;
            for (int i6 = 0; i6 < f860e.length; i6++) {
                f860e[i6] = null;
            }
        }
        System.gc();
    }

    public static void a(boolean z2) {
        if (!z2) {
            if (Y == 5) {
                Y = ab;
                ac = -1;
                return;
            }
            return;
        }
        if (Y == 0 || Y == 2) {
            ab = Y;
            Y = 5;
        }
        m301e();
    }

    private static int a(byte[] bArr, int i2, int i3, String str) {
        char[] charArray = str.toCharArray();
        for (int i4 = i2; i4 < i3 - 4; i4++) {
            if ((bArr[i4] & 255) == charArray[0] && (bArr[i4 + 1] & 255) == charArray[1] && (bArr[i4 + 2] & 255) == charArray[2] && (bArr[i4 + 3] & 255) == charArray[3]) {
                return i4;
            }
        }
        return -1;
    }

    private static Image a(byte[] bArr, int i2, int i3, int i4, int i5) {
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        int i6 = 0;
        for (int i7 = 0; i7 < iArr.length; i7++) {
            iArr[i7] = -1;
            iArr2[i7] = -1;
        }
        int a2 = a(bArr, 0, i3, "PLTE");
        int a3 = a(bArr, 0, i3, "tRNS");
        Image image = null;
        if (a2 > 0 && a3 > 0) {
            int i8 = ((bArr[a2 - 4] << 24) & (-16777216)) + ((bArr[a2 - 3] << 16) & 16711680) + ((bArr[a2 - 2] << 8) & 65280) + (bArr[a2 - 1] & 255);
            boolean z2 = false;
            for (int i9 = 0; i9 < i8 / 3; i9++) {
                if (bArr[a3 + 4 + i9] != 0) {
                    int i10 = bArr[a2 + 4 + (i9 * 3)] & 255;
                    int i11 = bArr[a2 + 4 + (i9 * 3) + 1] & 255;
                    int i12 = bArr[a2 + 4 + (i9 * 3) + 2] & 255;
                    if (i10 == 255 || i11 == 255 || i12 == 255) {
                        z2 = true;
                        break;
                    }
                    if (i10 == 0 || i11 == 0 || i12 == 0) {
                        z2 = true;
                        break;
                    }
                }
            }
            if (!z2) {
                i4 = 0 | (1 << 16) | 256 | 1;
            }
            for (int i13 = 0; i13 < i8 / 3; i13++) {
                if (bArr[a3 + 4 + i13] != 0 && (bArr[a2 + 4 + (i13 * 3)] & 255) == ((i4 >> 16) & 255 & 255) && (bArr[a2 + 4 + (i13 * 3) + 1] & 255) == ((i4 >> 8) & 255 & 255) && (bArr[a2 + 4 + (i13 * 3) + 2] & 255) == (i4 & 255)) {
                    iArr[i6] = i13;
                    int a4 = a(bArr, a2 + 4 + (i13 * 3), 3);
                    a(bArr, a2 + 4 + (i13 * 3), 3, i5);
                    iArr2[i6] = a4;
                    i6++;
                }
            }
            byte[] bArr2 = new byte[i8 + 4];
            System.arraycopy(bArr, a2, bArr2, 0, i8 + 4);
            long[] jArr = new long[256];
            for (int i14 = 0; i14 < 256; i14++) {
                long j2 = i14;
                for (int i15 = 0; i15 < 8; i15++) {
                    j2 = (j2 & 1) == 1 ? 3988292384L ^ (j2 >> 1) : j2 >> 1;
                }
                jArr[i14] = j2;
            }
            long j3 = 4294967295L;
            for (byte b2 : bArr2) {
                j3 = jArr[((int) (j3 ^ b2)) & 255] ^ (j3 >> 8);
            }
            int a5 = a(bArr, a2 + 4 + i8, 4);
            a(bArr, a2 + 4 + i8, 4, (int) (j3 ^ 4294967295L));
            System.gc();
            image = Image.createImage(bArr, 0, i3);
            for (int i16 = 0; i16 < i6; i16++) {
                a(bArr, a2 + 4 + (iArr[i16] * 3), 3, iArr2[i16]);
            }
            a(bArr, a2 + 4 + i8, 4, a5);
        }
        return image;
    }

    private static void a(byte[] bArr, int i2, int i3, int i4) {
        for (int i5 = i3 - 1; i5 >= 0; i5--) {
            bArr[((i2 + i3) - 1) - i5] = (byte) ((i4 & (255 << (i5 * 8))) >> (i5 * 8));
        }
    }

    private static int a(byte[] bArr, int i2, int i3) {
        int i4 = 0;
        for (int i5 = i3 - 1; i5 >= 0; i5--) {
            i4 += (bArr[((i2 + i3) - 1) - i5] << (i5 * 8)) & (255 << (i5 * 8));
        }
        return i4;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m298a(int i2) {
        if (f881q || !f841l) {
            return true;
        }
        if (f884r) {
            f884r = false;
        } else {
            Z = i2;
        }
        switch (Y) {
            case 0:
                if (ac >= ad) {
                    g();
                    Y = 1;
                    f();
                } else {
                    m297a(ac);
                }
                ac++;
                return false;
            case 1:
                switch (Z) {
                    case 21:
                        if (!f874o || ai <= 0) {
                            return false;
                        }
                        int i3 = ai - 1;
                        ai = i3;
                        if (i3 - ah >= 0) {
                            return false;
                        }
                        ah--;
                        return false;
                    case 22:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    default:
                        return false;
                    case 23:
                        if (ao <= 1) {
                            return false;
                        }
                        if (aa == 0) {
                            aa = W - 1;
                        } else {
                            aa--;
                        }
                        while (!f870b[aa]) {
                            if (aa == 0) {
                                aa = W - 1;
                            } else {
                                aa--;
                            }
                        }
                        f827e = true;
                        break;
                    case 24:
                        break;
                    case 25:
                    case 27:
                        Y = 6;
                        return false;
                    case 26:
                        Y = 4;
                        return false;
                    case 32:
                        if (!f874o || ai >= af - 1) {
                            return false;
                        }
                        int i4 = ai + 1;
                        ai = i4;
                        if (i4 - ah < ag) {
                            return false;
                        }
                        ah++;
                        return false;
                }
                if (ao <= 1) {
                    return false;
                }
                if (!f827e) {
                    if (aa == W - 1) {
                        aa = 0;
                    } else {
                        aa++;
                    }
                    while (!f870b[aa]) {
                        if (aa == W - 1) {
                            aa = 0;
                        } else {
                            aa++;
                        }
                    }
                    f828f = true;
                }
                ah = 0;
                ai = 0;
                f();
                return false;
            case 2:
                b(false);
                int i5 = aa;
                int i6 = f869e[i5] == 4 ? f869e[i5] : i5 == m ? 5 : i5 == n ? 6 : i5 == o ? 7 : i5 == p ? 8 : i5 == q ? f782a[0] : -1;
                ac = i6;
                m297a(i6);
                g();
                Y = 1;
                return false;
            case 3:
                switch (Z) {
                    case 25:
                        f840I = null;
                        return false;
                    case 26:
                        Y = 1;
                        f835H = null;
                        return false;
                    default:
                        return false;
                }
            case 4:
                b(true);
                if (f836j) {
                    f834a.setCommandListener(f837a);
                    if (f883b != null) {
                        f834a.removeCommand(f883b);
                        f883b = null;
                    }
                    if (f882a != null) {
                        f834a.removeCommand(f882a);
                        f882a = null;
                    }
                }
                f839k = false;
                return true;
            case 5:
            default:
                return false;
            case 6:
                String str = f868g[aa];
                if (f874o) {
                    str = f864a[ae][ai];
                }
                if (str == null || str.length() <= 0) {
                    return false;
                }
                if (f817b) {
                    int indexOf = str.indexOf(f811A);
                    str = indexOf == -1 ? new StringBuffer().append(str).append(f811A).append(f821b[ax]).toString() : new StringBuffer().append(str.substring(0, indexOf)).append(f811A).append(f821b[ax]).append(str.substring(indexOf + f811A.length() + 2)).toString();
                }
                f840I = str;
                return false;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m299a(int i2, int i3) {
        int m300b = m300b(i2, i3);
        if (m300b != 0) {
            Z = m300b;
            f884r = true;
        }
        aE = 0;
        f885s = false;
    }

    public static void b(int i2, int i3) {
        int m300b = m300b(i2, i3);
        if (m300b != 0) {
            aE = m300b;
        }
    }

    public static void c(int i2, int i3) {
        Z = 0;
        aE = 0;
        f885s = false;
        b(i2, i3);
    }

    /* renamed from: b, reason: collision with other method in class */
    private static int m300b(int i2, int i3) {
        int i4 = aB - i2;
        if (i3 < 0 || i4 < 0 || Y == 0 || !f839k) {
            return 0;
        }
        if (f874o) {
            int width = ((aB * 5) / 100) + 1 + f843b[5].getWidth();
            int i5 = aA / 100;
            int width2 = width + f863a[ae][0].getWidth() + i5;
            int i6 = i5 * 3;
            boolean z2 = i3 > ak + i6 && i3 < (ak + am) - i6;
            for (int i7 = ah; i7 < ah + ag; i7++) {
                if (z2 && i4 > aJ + (an * (i7 - ah)) && i4 < aJ + (an * (i7 - ah)) + an) {
                    if (ai == i7) {
                        return 25;
                    }
                    ai = i7;
                    return 0;
                }
            }
            if (z2) {
                z2 = i3 > ((f843b[12].getWidth() * 3) / 2) + 8 && i3 < aA - (((f843b[12].getWidth() * 3) / 2) - 8);
            }
            if (ag < af && z2) {
                if (ai > 0 && i4 > aK - ((width2 - 2) / 2) && i4 < aK + (width2 - 2)) {
                    return 21;
                }
                if (ai < af - 1 && i4 > aL - ((width2 - 2) / 2) && i4 < aL + (width2 - 2)) {
                    return 32;
                }
            }
        } else if (i3 > av && i3 < av + at && i4 > aw && i4 < aw + au) {
            return 27;
        }
        int width3 = aA - f843b[7].getWidth();
        int height = (aB >> 1) - f843b[7].getHeight();
        int height2 = f843b[7].getHeight() << 1;
        int width4 = f843b[7].getWidth() << 1;
        if (i4 >= height && i4 <= height + height2) {
            if (i3 >= 0 && i3 <= width4 + 0) {
                return 23;
            }
            if (i3 >= width3 - (width4 / 2) && i3 <= width3 + width4) {
                return 24;
            }
        }
        if (!f836j && i4 >= aB - f843b[13].getHeight() && i4 <= aB) {
            return ((i3 <= f778c || i3 >= f843b[13].getWidth() + f778c) && i3 > (aA - f779d) - f843b[13].getWidth() && i3 < aA - f779d) ? 26 : 0;
        }
        return 0;
    }

    /* renamed from: e, reason: collision with other method in class */
    private static void m301e() {
        Z = 0;
        aE = 0;
        f884r = true;
        f885s = false;
        X = 0;
        f827e = false;
        f828f = false;
    }

    private static void f() {
        aq = aa;
        ai = 0;
        af = 0;
        ah = 0;
        f874o = false;
        f871n = (f868g[aa] == null || f868g[aa].length() <= 0 || f868g[aa].compareTo("DEL") == 0) ? false : true;
        if (aa == n) {
            ae = 0;
            f874o = true;
            f871n = false;
        }
        if (aa == o) {
            ae = 1;
            f874o = true;
            f871n = false;
        }
        if (aa == p || aa == q) {
            f871n = true;
        }
        as = z;
        if (f869e[aa] == 4) {
            as = A;
        }
        if (f874o) {
            af = f867d[ae];
        }
    }

    public static void a(Graphics graphics) {
        if (f881q || !f841l || f862p == null) {
            return;
        }
        Graphics graphics2 = f862p.getGraphics();
        a(graphics2, 0, 0, aA, aB);
        switch (Y) {
            case 0:
                graphics2.setColor(0);
                graphics2.fillRect(0, 0, aA, aB);
                int i2 = aD;
                int i3 = (aA * 3) / 4;
                int i4 = ac;
                int i5 = ad;
                int i6 = i4;
                if (i6 > i5) {
                    i6 = i5;
                }
                int i7 = (aA - i3) / 2;
                graphics2.setClip(i7, 0, i3 + 2, aB);
                graphics2.setColor(16777215);
                graphics2.drawRect(i7, i2, i3, 6);
                graphics2.setColor(16711680);
                graphics2.fillRect(i7 + 1 + 1, i2 + 1 + 1, ((((i3 - 2) - 2) * i6) / i5) + 1, 3);
                if (f877K != null && !f877K.trim().equals("")) {
                    graphics2.setColor(16777215);
                    graphics2.setFont(f776a);
                    graphics2.drawString(f877K, aC, aD - 5, 33);
                    break;
                }
                break;
            case 1:
                b(graphics2);
                if ((System.currentTimeMillis() % 1000 > 500 || aE == 27) && f871n) {
                    graphics2.setColor(f777b);
                    int width = f847d[0].getWidth() / 2;
                    av -= width;
                    at += width * 2;
                    au++;
                    if (f781a[0]) {
                        graphics2.setColor(16744192);
                    }
                    if (aE == 27) {
                        graphics2.setColor(14588928);
                        a(graphics2, av - 2, aw - 2, at + 4, au + 4, 3);
                        graphics2.setColor(5767410);
                        a(graphics2, av, aw, at, au, 2);
                    } else {
                        a(graphics2, av, aw, at, au, 1);
                    }
                    S = 0;
                    a(as, graphics2, aC, aw + (au >> 1), 3);
                    break;
                }
                break;
            case 2:
                int height = f776a.getHeight();
                graphics2.setColor(6324884);
                graphics2.fillRect(0, (aD - height) - 5, aA, height << 1);
                int i8 = S;
                S = 0;
                a(J, graphics2, aC, aD - height, 65);
                S = i8;
                break;
            case 3:
                b(graphics2);
                int i9 = (aB * 40) / 100;
                int i10 = aA;
                int i11 = aB - (i9 << 1);
                int[] iArr = new int[i10 * i11];
                for (int i12 = 0; i12 < iArr.length; i12++) {
                    iArr[i12] = -220209185;
                }
                graphics2.drawRGB(iArr, 0, i10, 0, i9, i10, i11, true);
                graphics2.setColor(39423);
                graphics2.drawRect(0, i9, i10 - 1, (aB - (i9 << 1)) - 1);
                graphics2.drawRect(1, i9 + 1, i10 - 3, (aB - (i9 << 1)) - 3);
                a(D, graphics2, aC, aD, 3);
                c(graphics2);
                break;
        }
        graphics.setClip(0, 0, aB, aA);
        int width2 = f862p.getWidth();
        f862p.getWidth();
        int i13 = width2 + 0;
        int height2 = f862p.getHeight();
        f862p.getHeight();
        int i14 = height2 + 0;
        for (int i15 = 0; i15 < 1; i15++) {
            for (int i16 = 0; i16 < 1; i16++) {
                graphics.drawRegion(f862p, i13 * 0, i14 * 0, i13, i14, 5, i14 * 0, i13 * 0, 0);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void b(Graphics graphics) {
        f796a = true;
        a(as, (Graphics) null, 0, 0, 3);
        int a2 = a(32, Q) / 2;
        int a3 = a(32, R) / 3;
        at = U + a2;
        au = T + a3;
        if ((T + au) % 2 != 0) {
            au++;
        }
        av = aC - (at / 2);
        if (f869e[aa] == 4) {
            aw = g - (au / 2);
        } else if (aa == m || aa == p || aa == q) {
            aw = ((aB - f843b[12].getHeight()) - ar) - au;
        }
        if (f781a[0] && aa == q) {
            aw = (aB * 75) / 100;
        }
        graphics.setColor(16777215);
        if (f781a[0]) {
            graphics.setColor(0);
        }
        int i2 = aA;
        int i3 = aB;
        int i4 = i2;
        if (i3 + 0 > aB) {
            i3 = aB;
        }
        if (i4 + 0 > aA) {
            i4 = aA;
        }
        for (int i5 = 0; i5 < i3 + 0; i5++) {
            graphics.setColor(0 + ((i5 * 110) / i3), 0 + ((i5 * 148) / i3), 0 + ((i5 * 168) / i3));
            graphics.drawLine(0, i5, 0 + i4, i5);
        }
        c(graphics);
        int height = (aB - f843b[12].getHeight()) - ar;
        if (f874o) {
            int i6 = f;
            if (f875p) {
                a(graphics, true);
                i6 += f844c[aa].getHeight();
            }
            int height2 = f843b[13].getHeight() + ar;
            int i7 = i6 + f;
            int i8 = (aB - i7) - height2;
            int height3 = f863a[ae][f865a[ae][0]].getHeight();
            int i9 = ae;
            int i10 = 0;
            for (int i11 = 0; i11 < f866b[ae].length; i11++) {
                int i12 = 1;
                int i13 = 0;
                while (m288a(f866b[i9][i11]).indexOf("\n", i13) != -1) {
                    i13 = m288a(f866b[i9][i11]).indexOf("\n", i13) + 1;
                    i12++;
                }
                if (i12 > i10) {
                    i10 = i12;
                }
            }
            int max = Math.max(Math.max(2, i10) * N, height3 + (height3 / 4));
            int width = f843b[5].getWidth();
            int i14 = i8 / max;
            if ((max * af) + (((aB << 1) << 1) / 100) > i8) {
                i7 += width + (width >> 1);
                int i15 = i8 - (2 * (width + (width >> 1)));
                i8 = i15;
                i14 = i15 / max;
            }
            int i16 = i14;
            if (af < i14) {
                i16 = af;
            }
            int i17 = i7 + ((i8 >> 1) - ((i16 * max) >> 1));
            int i18 = (max * i16) + (((aB << 1) << 1) / 100);
            ag = i16;
            if (i14 < af) {
                if (ai > 0) {
                    a(graphics, aC, i17 - width, width, aE == 21 ? 16545540 : 16777215, true, false);
                    aK = i17 - width;
                }
                if (ai != af - 1) {
                    a(graphics, aC, i17 + (ag * max) + width, width, aE == 32 ? 16545540 : 16777215, true, true);
                    aL = i17 + (ag * max);
                }
            }
            int i19 = i17 + (max / 2) + 1;
            am = aA - (((2 * f843b[5].getWidth()) + (f843b[5].getWidth() / 4)) + 8);
            if (aA > aB) {
                am -= f843b[5].getWidth() / 2;
            }
            ak = (aA >> 1) - (am >> 1);
            int i20 = (aA << 1) / 100;
            int i21 = ak + i20;
            int width2 = i21 + f863a[ae][0].getWidth() + i20;
            f863a[ae][0].getWidth();
            graphics.setColor(0);
            a(graphics, ak - ((aA << 1) / 100), i17 - ((aB << 1) / 100), am + (((aA << 1) << 1) / 100), i18, 0);
            for (int i22 = ah; i22 < ah + i16; i22++) {
                int i23 = f865a[ae][i22];
                a(graphics, f863a[ae][i23], i21, i19, 6);
                S = 5;
                if (ae == 2 || i23 == f866b[ae].length - 1) {
                    S = 2;
                }
                a(m288a(f866b[ae][i23]), graphics, width2, i19, 6);
                i19 += max;
            }
            aj = ai - ah;
            al = i17 + (max * aj);
            an = max;
            aJ = i17;
            graphics.setColor(16545540);
            graphics.drawRoundRect(ak, al, am, an, (aA * 5) / 100, (aB * 5) / 100);
        } else if (aa == q) {
            a(graphics, f844c[q], aA / 2, f, 17);
            f796a = true;
            a(r, (Graphics) null, 0, 0, 0);
            f844c[aa].getHeight();
            if (f781a[0]) {
                S = 0;
            }
            a(m288a(s), graphics, aA - ((f843b[4].getWidth() + 8) << 1), aA >> 1, aB >> 1, 3);
        } else if (aa == m) {
            boolean z2 = aB >= 128;
            boolean z3 = f876J != null && f876J.length() > 0;
            int i24 = 0;
            int height4 = z2 ? f843b[10].getHeight() : 0;
            if (f875p) {
                a(graphics, false);
                i24 = (2 * f) + height4 + 1;
            }
            if (f844c[m].getWidth() > 220) {
                graphics.setColor(13421772);
                graphics.fillRect(aC + 14, i24, 3, 20);
                i24 += 20;
            } else if (f844c[m].getWidth() > 140) {
                graphics.setColor(14145495);
                graphics.fillRect(aC + 8, i24, 2, 11);
                i24 += 11;
            } else if (f844c[m].getWidth() > 100) {
                graphics.setColor(13487565);
                graphics.fillRect(aC + 6, i24, 1, 10);
                i24 += 10;
            }
            int height5 = i24 + (f844c[m].getHeight() - 1);
            a(graphics, f844c[m], aC, height5, 33);
            a(graphics, f845a, aC + (f844c[m].getWidth() >> 1) + 1, height5, 40);
            if (z3) {
                S = 0;
                int i25 = height - height5;
                int i26 = (N << 1) > i25 ? height5 + (N / 3) : height5 + ((i25 - (N * ay)) / 2);
                graphics.setColor(0);
                a(graphics, aC - (az / 2), i26 - ((aB << 1) / 100), az, (ay * N) + (((aB << 1) << 1) / 100), 0);
                a(f876J, graphics, aA, aC, i26, 17);
            }
        } else if (aa == p) {
            if (f875p) {
                a(graphics, false);
            }
            int i27 = (f780e + h) / 2;
            if (f819d) {
                graphics.drawRegion(f844c[aa], 0, 0, f844c[aa].getWidth(), f844c[aa].getHeight(), 0, aC, i27, 10);
                graphics.drawRegion(f844c[aa], 0, 0, f844c[aa].getWidth(), f844c[aa].getHeight(), 2, aC, i27, 6);
            } else {
                a(graphics, f844c[aa], aC, i27, 3);
            }
            if (f846b == null) {
                f796a = true;
                a(m288a(aq), (Graphics) null, 0, 0, 0, 0);
                int i28 = i27 - (T / 2);
                int i29 = S;
                S = 0;
                a(m288a(aq), graphics, f844c[aa].getWidth() / 2, aC, i28, 17);
                S = i29;
            } else {
                a(graphics, f846b, aC, aB / 2, 3);
            }
        } else {
            f796a = true;
            a(m288a(aq), graphics, 0, 0, 0, 0);
            int height6 = f844c[aa].getHeight();
            int height7 = U > (aA - 16) - (f843b[12].getWidth() << 1) ? f843b[12].getHeight() : 0;
            int max2 = Math.max(0, aB - ((height6 + T) + height7));
            int i30 = aA <= 176 ? 2 : 0;
            if (T > (N << 1) + i30 && max2 / 3 > (N + i30) / 2) {
                max2 = Math.max(0, aB - ((height6 + (N << 1)) + height7));
            }
            int i31 = max2 / 3;
            if (height7 > 0) {
                int height8 = aB - f843b[12].getHeight();
                int max3 = Math.max(0, aB - (height6 + T));
                if (T > (N << 1) + i30 && max3 / 3 > T - ((N + i30) << 1)) {
                    max3 = Math.max(0, aB - (height6 + (N << 1)));
                }
                int i32 = max3 / 3;
                if ((i32 * 2) + T + f844c[aa].getHeight() < height8) {
                    i31 = i32;
                }
            }
            int i33 = i31;
            a(graphics, f844c[aa], aC, i33, 17);
            int height9 = (((i33 + f844c[aa].getHeight()) + height) - T) / 2;
            if (f781a[0]) {
                S = 0;
            }
            S = 0;
            a(m288a(aq), graphics, 0, aC, height9, 17);
        }
        if (ao > 1) {
            int abs = Math.abs(((int) ((System.currentTimeMillis() / 80) % 8)) - 4);
            Object[] objArr = 5;
            Object[] objArr2 = 7;
            if (f827e || aE == 23) {
                objArr = 4;
                X++;
            }
            if (f828f || aE == 24) {
                objArr2 = 6;
                X++;
            }
            int width3 = abs + 1 + f843b[objArr == true ? 1 : 0].getWidth();
            f843b[objArr == true ? 1 : 0].getWidth();
            a(graphics, f843b[objArr == true ? 1 : 0], width3, aD, 10);
            a(graphics, f843b[objArr2 == true ? 1 : 0], aA - width3, aD, 6);
            if (X > 4) {
                f827e = false;
                f828f = false;
                X = 0;
            }
        }
    }

    private static void a(Graphics graphics, boolean z2) {
        int i2 = (aA * 3) / 100;
        int i3 = f;
        int height = i3 + f843b[10].getHeight() + f;
        int i4 = aA;
        int i5 = aB >= 400 ? 2 : 1;
        a(graphics, f843b[10], i2, i3, 20);
        if (z2) {
            S = 0;
            a(aq, graphics, i4, (height - f) + 3, 40);
        }
        graphics.setColor(10862283);
        int i6 = 0;
        while (i6 < i5) {
            graphics.drawLine(0, height + i6, i4, height + i6);
            i6++;
        }
        h = height + i6;
    }

    private static void a(Graphics graphics, int i2, int i3, int i4, int i5, boolean z2, boolean z3) {
        int i6 = z3 ? -1 : 1;
        if (i4 % 2 == 0) {
            i4--;
        }
        graphics.setColor(16545540);
        a(graphics, i2, i3, i2 - (i4 >> 1), i3 + (i6 * (i4 >> 1)), i2 + (i4 >> 1), i3 + (i6 * (i4 >> 1)));
        graphics.setColor(i5);
        a(graphics, i2, i3 + i6, (i2 - (i4 >> 1)) + 2, (i3 + (i6 * (i4 >> 1))) - i6, (i2 + (i4 >> 1)) - 2, (i3 + (i6 * (i4 >> 1))) - i6);
    }

    private static void c(Graphics graphics) {
        if (f836j) {
            return;
        }
        int i2 = aB - 2;
        int i3 = f778c;
        int i4 = aA - f779d;
        f780e = i2 - f843b[9].getHeight();
        ar = aB - i2;
        Image image = f843b[12];
        Image image2 = f843b[12];
        if (aE == 26) {
            image2 = f843b[13];
        }
        f873b = (byte) (f873b | 2);
        f872a = (byte) (f872a | 2);
        if ((f873b & 1) != 0) {
            a(graphics, image, i3, i2, 36);
        }
        if ((f873b & 2) != 0) {
            a(graphics, image2, i4, i2, 40);
        }
        int width = i3 + ((f843b[12].getWidth() / 2) - (f843b[9].getWidth() / 2));
        int width2 = i4 + ((-f843b[12].getWidth()) / 2) + (f843b[8].getWidth() / 2);
        int height = i2 + ((-f843b[12].getHeight()) / 2) + (f843b[9].getHeight() / 2);
        byte b2 = (byte) (f872a | 2);
        f872a = b2;
        if ((b2 & 1) != 0) {
            a(graphics, f843b[9], width, height, 36);
        }
        if ((f872a & 2) != 0) {
            a(graphics, f843b[8], width2, height, 40);
        }
    }

    private static Image b(byte[] bArr, int i2, int i3, int i4, int i5) {
        int i6 = 0;
        for (int i7 = 2; i6 == 0 && i7 < i3 + 2; i7++) {
            if ((bArr[i7] & 255) == 80 && (bArr[i7 + 1] & 255) == 76 && (bArr[i7 + 2] & 255) == 84 && (bArr[i7 + 3] & 255) == 69) {
                i6 = i7;
            }
        }
        int i8 = ((bArr[i6 - 4] << 24) & (-16777216)) + ((bArr[i6 - 3] << 16) & 16711680) + ((bArr[i6 - 2] << 8) & 65280) + (bArr[i6 - 1] & 255);
        bArr[i6 + 4 + 3] = (byte) ((i5 >> 16) & 255);
        bArr[i6 + 4 + 3 + 1] = (byte) ((i5 >> 8) & 255);
        bArr[i6 + 4 + 3 + 2] = (byte) i5;
        byte[] bArr2 = new byte[i8 + 4];
        System.arraycopy(bArr, i6, bArr2, 0, i8 + 4);
        long[] jArr = new long[256];
        for (int i9 = 0; i9 < 256; i9++) {
            long j2 = i9;
            for (int i10 = 0; i10 < 8; i10++) {
                j2 = (j2 & 1) == 1 ? 3988292384L ^ (j2 >> 1) : j2 >> 1;
            }
            jArr[i9] = j2;
        }
        long j3 = 4294967295L;
        for (byte b2 : bArr2) {
            j3 = jArr[((int) (j3 ^ b2)) & 255] ^ (j3 >> 8);
        }
        long j4 = j3 ^ 4294967295L;
        bArr[i6 + 4 + i8] = (byte) ((j4 & (-16777216)) >> 24);
        bArr[i6 + 4 + i8 + 1] = (byte) ((j4 & 16711680) >> 16);
        bArr[i6 + 4 + i8 + 2] = (byte) ((j4 & 65280) >> 8);
        bArr[i6 + 4 + i8 + 3] = (byte) (j4 & 255);
        System.gc();
        return Image.createImage(bArr, 2, i3);
    }

    private static void a(Graphics graphics, int i2, int i3, int i4, int i5, int i6, int i7) {
        graphics.fillTriangle(i2, i3, i4, i5, i6, i7);
    }

    private static void a(Graphics graphics, Image image, int i2, int i3, int i4) {
        graphics.drawImage(image, i2, i3, i4);
    }

    private static void a(Graphics graphics, int i2, int i3, int i4, int i5, int i6) {
        Image image = f847d[i6];
        graphics.fillRect(i2 + image.getWidth(), i3, i4 - (2 * image.getWidth()), i5);
        graphics.fillRect(i2, i3 + image.getHeight(), i4, (i5 - (2 * image.getHeight())) + 1);
        graphics.drawRegion(image, 0, 0, image.getWidth(), image.getHeight(), 0, i2, i3, 20);
        graphics.drawRegion(image, 0, 0, image.getWidth(), image.getHeight(), 5, (i2 + i4) - image.getWidth(), i3, 20);
        graphics.drawRegion(image, 0, 0, image.getWidth(), image.getHeight(), 3, (i2 + i4) - image.getWidth(), i3 + i5, 36);
        graphics.drawRegion(image, 0, 0, image.getWidth(), image.getHeight(), 6, i2, i3 + i5, 36);
    }

    private static void a(Graphics graphics, int i2, int i3, int i4, int i5) {
        graphics.setClip(Math.max(i2, 0), Math.max(i3, 0), Math.min(i4, aA), Math.min(i5, aB));
    }

    @Override // java.lang.Runnable
    public final void run() {
        new StringBuffer().append("Thread.activeCount() = ").append(Thread.activeCount());
        while (f839k) {
            try {
                if (f840I != null) {
                    String str = f840I;
                    d = str;
                    if (str != null && d.length() > 0) {
                        String str2 = d;
                        d = null;
                        new StringBuffer().append("urlPlatformRequest = ").append(str2);
                        try {
                            f833a.platformRequest(str2);
                            Thread.sleep(200L);
                        } catch (Exception unused) {
                        }
                        Y = 1;
                        f833a.notifyDestroyed();
                    }
                    f840I = null;
                }
                Thread.sleep(1000L);
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: f, reason: collision with other method in class */
    private static boolean m302f() {
        if (f841l) {
            if (f830h) {
                return f829g;
            }
            try {
                RecordStore.openRecordStore("igp19", false).closeRecordStore();
                f829g = true;
            } catch (Exception unused) {
            }
            f830h = true;
        }
        return f829g;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m303a(Graphics graphics, Image image, int i2, int i3, int i4) {
        if (m302f() || !f841l || image == null || graphics == null) {
            return false;
        }
        if (System.currentTimeMillis() - f831a > 800) {
            f832i = !f832i;
            f831a = System.currentTimeMillis();
        }
        if (!f832i) {
            return true;
        }
        a(graphics, image, i2, i3, 6);
        return true;
    }

    public final void commandAction(Command command, Displayable displayable) {
        if (f836j) {
            if (command == f882a) {
                m298a(25);
            } else if (command == f883b) {
                m298a(26);
            }
        }
    }

    private static InputStream a(String str) {
        return "a".getClass().getResourceAsStream(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0185 A[Catch: Exception -> 0x035d, TryCatch #0 {Exception -> 0x035d, blocks: (B:7:0x0058, B:9:0x0060, B:11:0x0068, B:14:0x0356, B:15:0x0071, B:17:0x0079, B:19:0x0080, B:21:0x0087, B:23:0x008e, B:25:0x0095, B:27:0x009c, B:29:0x00a3, B:33:0x00af, B:36:0x00c1, B:38:0x00ca, B:40:0x00d1, B:44:0x0152, B:45:0x017c, B:47:0x0185, B:49:0x018f, B:51:0x0199, B:53:0x01a3, B:55:0x01ad, B:57:0x01e9, B:59:0x01f3, B:61:0x0248, B:62:0x020c, B:64:0x0216, B:66:0x022f, B:68:0x01b7, B:71:0x024e, B:73:0x025d, B:75:0x0268, B:77:0x0273, B:79:0x027c, B:80:0x02b1, B:81:0x02c4, B:85:0x02d1, B:87:0x02e2, B:91:0x02f8, B:93:0x032d, B:95:0x033d, B:97:0x0340, B:89:0x0346, B:101:0x00dd, B:103:0x00e5, B:105:0x00ec, B:107:0x00f8, B:109:0x0103, B:111:0x010a, B:113:0x0111, B:115:0x012c, B:117:0x0135, B:119:0x013f, B:120:0x014e, B:121:0x0118), top: B:6:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void g() {
        /*
            Method dump skipped, instructions count: 863
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l.g():void");
    }

    private static short[] a(String str, int i2, boolean z2) {
        int length = str.length();
        short s2 = 0;
        short s3 = 1;
        short s4 = 0;
        boolean z3 = false;
        short s5 = 0;
        char[] charArray = str.toCharArray();
        int i3 = 0;
        while (i3 < length) {
            char c2 = charArray[i3];
            if (c2 == ' ') {
                s2 = (short) (s2 + a((int) c2, Q));
                short s6 = s4;
                s4 = (short) i3;
                z3 = true;
                s5 = 0;
                if (s4 == length - 2 && s2 + a((int) charArray[s4 + 1], Q) > i2) {
                    s4 = s6;
                    short s7 = (short) (s3 + 1);
                    f889b[s3] = (short) (s4 + 1);
                    s3 = (short) (s7 + 1);
                    f889b[s7] = s2;
                    s2 = 0;
                }
                boolean z4 = s2 > i2;
                boolean z5 = z4;
                if (z4) {
                    z3 = false;
                    int i4 = s4;
                    while (i4 >= 0 && charArray[i4] == ' ') {
                        i4--;
                        s2 = (short) (s2 - a(32, Q));
                    }
                    int i5 = 0;
                    while (s4 < length && charArray[s4] == ' ') {
                        s4 = (short) (s4 + 1);
                        i5++;
                    }
                    if (i5 == 1 && i3 == length - 2) {
                        s4 = s6;
                    } else {
                        short s8 = (short) (s4 - 1);
                        s4 = s8;
                        i3 = s8;
                    }
                }
                if (z5) {
                    short s9 = (short) (s3 + 1);
                    f889b[s3] = (short) (s4 + 1);
                    s3 = (short) (s9 + 1);
                    f889b[s9] = s2;
                    s2 = 0;
                }
            } else if (c2 == '|') {
                if (!z2) {
                    break;
                }
                s2 = (short) (s2 + a((int) c2, Q));
                s4 = (short) i3;
                z3 = true;
                s5 = 0;
                if (s2 > i2) {
                    z3 = false;
                    int i6 = s4;
                    while (i6 >= 0 && charArray[i6] == ' ') {
                        i6--;
                        s2 = (short) (s2 - a(32, Q));
                    }
                    while (s4 < length && charArray[s4] == ' ') {
                        s4 = (short) (s4 + 1);
                    }
                    short s10 = (short) (s4 - 1);
                    s4 = s10;
                    i3 = s10;
                    short s11 = (short) (s3 + 1);
                    f889b[s3] = (short) (s4 + 1);
                    s3 = (short) (s11 + 1);
                    f889b[s11] = s2;
                    s2 = 0;
                }
            } else if (c2 == '\n') {
                short s12 = (short) (s3 + 1);
                f889b[s3] = (short) i3;
                s3 = (short) (s12 + 1);
                f889b[s12] = s2;
                s2 = 0;
                s5 = 0;
            } else {
                int a2 = a((int) c2, Q) + i;
                s5 = (short) (s5 + a2);
                short s13 = (short) (s2 + a2);
                s2 = s13;
                if (s13 > i2 && z3) {
                    z3 = false;
                    int i7 = s4;
                    while (i7 >= 0 && charArray[i7] == ' ') {
                        i7--;
                        s2 = (short) (s2 - a(32, R));
                    }
                    short s14 = (short) (s3 + 1);
                    f889b[s3] = (short) (s4 + 1);
                    s3 = (short) (s14 + 1);
                    f889b[s14] = (short) (s2 - s5);
                    s2 = 0;
                    i3 = s4;
                }
            }
            i3++;
        }
        if (s2 != 0) {
            short s15 = (short) (s3 + 1);
            f889b[s3] = (short) length;
            s3 = (short) (s15 + 1);
            f889b[s15] = s2;
        }
        f889b[0] = (short) (s3 / 2);
        return f889b;
    }

    /* renamed from: a, reason: collision with other method in class */
    private static String m304a(String str) {
        String str2 = "";
        char[] charArray = str.toCharArray();
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (charArray[i2] != '|') {
                str2 = new StringBuffer().append(str2).append(charArray[i2]).toString();
            }
        }
        return str2;
    }
}
