package com.example.java_hw9_enum;

public class Main {
    public static void main(String[] args) {
        Size s = Size.S;
        int sWidth = s.getWidth();
        int sLength = s.getLength();

        Size m = Size.M;
        int mWidth = m.getWidth();
        int mLength = m.getLength();

        Size l = Size.L;
        int lWidth = l.getWidth();
        int lLength = l.getLength();

        Size xl = Size.XL;
        int xlWidth = xl.getWidth();
        int xlLength = xl.getLength();

        System.out.println("Size S - width: " + sWidth + ", length: " + sLength);
        System.out.println("Size M - width: " + mWidth + ", length: " + mLength);
        System.out.println("Size L - width: " + lWidth + ", length: " + lLength);
        System.out.println("Size XL - width: " + xlWidth + ", length: " + xlLength);
    }
}
