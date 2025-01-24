package ceshi;

public class TestMyThread {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName() +"的优先级：" + Thread.currentThread().getPriority());

    }
}