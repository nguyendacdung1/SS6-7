public class code7 {
    public static int staticCounter = 0;
    int instanceCounter = 0;

    static {
        System.out.printf("I ama staticblock");
    }

    public static void stacticMethod(){
        System.out.printf("I am static Method");
    }
    public void displayCount(){
        staticCounter++;
        instanceCounter++;

        System.out.printf("Static Counter is: "+staticCounter);
        System.out.printf("Instance Counter is: "+instanceCounter);
    }

    public static void main(String[] args) {
        System.out.printf("I am the main method");
        StaticMembers.staticMethod();
        StaticMembers objStatic1 = new StaticMembers();
        objStatic1.displayCount();
        StaticMembers objStatic2 = new StaticMembers();
        objStatic2.displayCount();
        StaticMembers objStatic3 = new StaticMembers();
        objStatic3.displayCount();
    }
}
