package ch.bbw;

import java.util.Stack;

public class Main {
    private static Stack<Integer> a = new Stack<>();
    private static Stack<Integer> b = new Stack<>();
    private static Stack<Integer> c = new Stack<>();

    public static void main(String[] args) {
        init(5);
        show();
    }
    private static void init(int count){
        for(int i = count; i > 0; i--){
            a.push(i);
        }
    }
    private static void show() {
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
    }
}
