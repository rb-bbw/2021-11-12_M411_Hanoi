package ch.bbw;

import java.util.Stack;

public class Main {
    private static Stack<Integer> source = new Stack<>();
    private static Stack<Integer> help = new Stack<>();
    private static Stack<Integer> target = new Stack<>();

    public static void main(String[] args) {
        int count = 5;
        init(count);
        move(count, source, help, target);
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
            show();
            move(count-1, b, a, c);
        }
    }
}
