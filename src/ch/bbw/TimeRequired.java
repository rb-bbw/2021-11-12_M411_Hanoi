package ch.bbw;

import java.util.Stack;

public class TimeRequired {
    private static Stack<Integer> source = new Stack<>();
    private static Stack<Integer> help = new Stack<>();
    private static Stack<Integer> target = new Stack<>();

    public static void main(String[] args) {
        for(int i = 1; i>0; i++){ // infinite
            init(i);
            long start = System.nanoTime();
            move(i, source, help, target);
            long delta = System.nanoTime() - start;
            System.out.println(i + " discs took " + (delta / 1000000000) + " seconds");
        }
    }
    private static void init(int count){
        for(int i = count; i > 0; i--){
            source.push(i);
        }
    }
    private static void show() {
        System.out.println(source.toString());
        System.out.println(help.toString());
        System.out.println(target.toString());
        System.out.println();
    }
    private static void move(int count, Stack<Integer> a, Stack<Integer> b, Stack<Integer> c) {
        if(count > 0){
            move(count-1, a, c, b);
            c.push(a.pop());
            move(count-1, b, a, c);
        }
    }
}
