import java.util.ArrayList;

public class code8 {
    ArrayList myCart = new ArrayList();

    public void createList(){
        myCart.add("Doll");
        myCart.add("Bus");
        myCart.add("Teddy");
        System.out.printf("Cart contents are: " + myCart);
    }

    public static void main(String[] args) {
        code8 objUser=new code8();
        objUser.createList();
        StaticMembers objStatic = new StaticMembers();
        objStatic.displayCount();

    }
}
