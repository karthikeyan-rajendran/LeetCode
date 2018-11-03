package my.projects;

public class MyClass {

    private static String test = "1";

    public static void main(String args[]){
        System.out.println("my first test : " + test);
        SecondClass secondClass = new SecondClass();
        System.out.println(secondClass.returns());

        System.out.println(SecondClass.staticreturns());
    };

}