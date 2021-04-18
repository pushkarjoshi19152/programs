 class ClassA extends Thread{
    public void run() {
    System.out.println("Start Thread A ....");
    for(int i = 1; i <= 5; i++) {
    System.out.println("From Thread A: i = "+ i);
    }
    System.out.println("... Exit Thread A");
    }
    }

    class ClassB extends Thread{
    public void run() {
    System.out.println("Start Thread B ....");
    for(int j = 1; j <= 5; j++) {
    System.out.println("From Thread B: j = "+ j);
    }
    System.out.println("... Exit Thread B");
    }
    }

    class ClassC extends Thread{
    public void run() {
    System.out.println("Start Thread C ....");
    for(int k = 1; k <= 5; k++) {
    System.out.println("From Thread C: j = "+ k);
    }
    System.out.println("... Exit Thread C");
    }
    }


    class ThreadPriorityTest{
    public static void main (String args[]) {
    ClassA t1 = new ClassA();
    ClassB t2 = new ClassB();
    ClassC t3 = new ClassC();

    t3.setPriority(Thread.MAX_PRIORITY);
    t2.setPriority(t2.getPriority() + 1);
    t1.setPriority(Thread.MIN_PRIORITY);
    t1.start(); t2.start(); t3.start();
    System.out.println("... End of executuion ");
}
}
