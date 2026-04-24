package defpackage;

/* loaded from: Gangstar_Rio_Samsung_F480_EN_IGP_EU_TS_118.jar:o.class */
final class o {
    private static int[] a = {0, -1, 0, 1, -1, 0, 1, 0, -1, -1, 1, -1, -1, 1, 1, 1};

    /* renamed from: a, reason: collision with other field name */
    private short[] f960a;
    private short[] b;
    private short[] c;
    private short[] d;
    private short[] e;

    /* renamed from: a, reason: collision with other field name */
    private int f961a;

    /* renamed from: b, reason: collision with other field name */
    private int f962b;

    /* renamed from: c, reason: collision with other field name */
    private int f963c;

    /* renamed from: d, reason: collision with other field name */
    private int f964d;

    /* renamed from: e, reason: collision with other field name */
    private int f965e;
    private int f;

    /* renamed from: a, reason: collision with other field name */
    private byte[] f966a;
    private int g;

    /* renamed from: f, reason: collision with other field name */
    private short[] f967f;
    private int h;
    private int i;

    /* renamed from: a, reason: collision with other field name */
    private boolean f968a = false;

    public final void a(int i, int i2, byte[] bArr, int i3, int i4, int i5, int i6, int i7) {
        this.f965e = i;
        this.f = i2;
        this.f966a = bArr;
        this.g = -32;
        this.f961a = 10;
        this.f962b = 14;
        this.f963c = 5;
        this.f964d = 8;
        this.f960a = new short[3000];
        this.b = new short[3000];
        this.c = new short[3000];
        this.d = new short[3000];
        this.e = new short[3000];
        this.i = -1;
        this.f967f = new short[3000];
        this.h = -1;
        this.f968a = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v129, types: [int] */
    /* JADX WARN: Type inference failed for: r0v70, types: [int] */
    public final void a(int i, int i2, int i3, int i4, int i5) {
        int i6 = this.f965e;
        int i7 = this.f;
        int i8 = 3;
        for (int i9 = 0; i9 < 3000; i9++) {
            this.f960a[i9] = -1;
            this.b[i9] = -1;
            this.c[i9] = -1;
            this.d[i9] = 0;
            this.e[i9] = 0;
            this.f967f[i9] = 0;
        }
        this.i = -1;
        int i10 = (i2 * i6) + i;
        while (i10 != -1) {
            m333b(i10);
            short s = this.d[i10];
            this.d[i10] = -1;
            this.e[i10] = -1;
            int i11 = i10 % i6;
            int i12 = i10 / i6;
            if (i11 == i4 && i12 == i5) {
                break;
            }
            int i13 = 0;
            while (i13 < this.f964d) {
                int i14 = i11 + a[i13 << 1];
                int i15 = i12 + a[(i13 << 1) + 1];
                if (i14 >= 0 && i14 < i6 && i15 >= 0 && i15 < i7) {
                    int i16 = (i15 * i6) + i14;
                    if (this.d[i16] != -1) {
                        short s2 = this.f961a;
                        if (i13 >= 4) {
                            s2 = this.f962b;
                            int i17 = i10 % i6;
                            int i18 = i10 / i6;
                            if (i13 != 4) {
                            }
                        }
                        if ((this.f966a[(i15 * this.f965e) + i14] & this.g) == 0) {
                            int i19 = s + s2 + (i8 == i13 ? 0 : this.f963c);
                            int abs = Math.abs(i14 - i4);
                            int abs2 = Math.abs(i15 - i5);
                            int i20 = this.f964d == 4 ? this.f961a * (abs + abs2) : abs > abs2 ? (this.f962b * abs2) + (this.f961a * (abs - abs2)) : (this.f962b * abs) + (this.f961a * (abs2 - abs));
                            if (this.b[i16] == -1 && this.c[i16] == -1 && this.i != i16) {
                                this.f960a[i16] = (short) i10;
                                this.d[i16] = (short) i19;
                                this.e[i16] = (short) i20;
                                m332a(i16);
                            } else if (this.d[i16] > i19) {
                                this.f960a[i16] = (short) i10;
                                this.d[i16] = (short) i19;
                                m333b(i16);
                                m332a(i16);
                            }
                        }
                    }
                }
                i13++;
            }
            int i21 = this.i;
            i10 = i21;
            if (i21 != -1) {
                short s3 = this.f960a[i10];
                i8 = i10 % i6 != s3 % i6 ? i10 % i6 > s3 % i6 ? 3 : 2 : i10 / i6 != s3 / i6 ? 1 : 0;
            }
        }
        if (i10 == -1) {
            this.h = -1;
            return;
        }
        this.h = 0;
        while (i10 != -1) {
            short[] sArr = this.f967f;
            int i22 = this.h;
            this.h = i22 + 1;
            sArr[i22] = (short) (((i10 / i6) * this.f965e) + (i10 % i6));
            i10 = this.f960a[i10];
        }
        this.h--;
    }

    public final int a() {
        return this.h + 1;
    }

    public final int a(int i) {
        return this.f967f[i] % this.f965e;
    }

    public final int b(int i) {
        return this.f967f[i] / this.f965e;
    }

    /* renamed from: a, reason: collision with other method in class */
    private void m332a(int i) {
        if (this.i == -1) {
            this.i = i;
            return;
        }
        int i2 = this.d[i] + this.e[i];
        int i3 = this.i;
        while (true) {
            int i4 = i3;
            if (i4 == -1) {
                return;
            }
            if (i2 < this.d[i4] + this.e[i4]) {
                if (this.b[i4] == -1) {
                    this.i = i;
                } else {
                    this.c[this.b[i4]] = (short) i;
                }
                this.b[i] = this.b[i4];
                this.c[i] = (short) i4;
                this.b[i4] = (short) i;
                return;
            }
            if (this.c[i4] == -1) {
                this.c[i4] = (short) i;
                this.b[i] = (short) i4;
                return;
            }
            i3 = this.c[i4];
        }
    }

    /* renamed from: b, reason: collision with other method in class */
    private void m333b(int i) {
        if (this.c[i] != -1) {
            this.b[this.c[i]] = this.b[i];
        }
        if (this.i == i) {
            this.i = this.c[i];
        } else if (this.b[i] != -1) {
            this.c[this.b[i]] = this.c[i];
        }
        this.b[i] = -1;
        this.c[i] = -1;
    }
}
