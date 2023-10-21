package example.chap03;

public class Mouse{
    public String name;
    public int age;
    public static int countOfTail; // 공통 필드

    public void sing(){
        System.out.println(name + " 찍찍!!");
    }
}