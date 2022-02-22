package com.company;

public class Main {

    public static void main(String[] args) {
        int myValue = 10_000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted Max Value = " + (myMaxIntValue + 1));
        System.out.println("Busted Min Value = " + (myMinIntValue - 1));
        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("myMinByteValue = " + myMinByteValue);
        System.out.println("myMaxByteValue = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("myMinShortValue = " + myMinShortValue);
        System.out.println("myMaxShortValue = " + myMaxShortValue);

        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("myMinLongValue = " + myMinLongValue);
        System.out.println("myMaxLongValue = " + myMaxLongValue);
        long myMaxLongTest = 2_147_483_647_234L;

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);

        byte challengeByte = 30;
        short challengeShort = 500;
        int challengeInt = 4200;

        long challengeLong = 50000 + (10 * (challengeInt + challengeByte + challengeShort));
        System.out.println("challengeLong = " + challengeLong);
    }
}
