package io;

public class PrinterStars implements IPrinter{
    @Override
    public void print(String text) {
        System.out.println(text);
    }

    @Override
    public void print(int number) {
        for (int i = 0; i < number; i++) {
            print("*");
            System.out.println();
        }
    }
}
