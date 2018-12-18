public static void maopao(int[] a) {
    int l = a.length;
    while (l > 0) {
        for (int i = 0; i < l - 1; i++) {
            if (a[i] > a[i + 1]) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            }
        }
        l--;
    }
}
