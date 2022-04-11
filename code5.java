public class code5 {
    final float PI=3.14F;
    public void display(float pi){
        PI=pi;
        System.out.printf("The value of PI is: " + PI);
    }
    public static void main(String[] args){
        final FinalDemo objFinalDemo = new FinalDemo();
        objFinalDemo.display(22.7F);
    }
}
