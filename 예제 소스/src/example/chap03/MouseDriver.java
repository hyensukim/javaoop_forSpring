package example.chap03;

public class MouseDriver {
    public static void main(String[] args) {
        Mouse.countOfTail = 1;

        Mouse mickey = new Mouse();
        Mouse jerry = new Mouse();
        Mouse mightMouse = new Mouse();

        //객체명.countOfTail
        System.out.println(mickey.countOfTail);
        System.out.println(jerry.countOfTail);
        System.out.println(mightMouse.countOfTail);

        System.out.println(Mouse.countOfTail);
    }
    
}
