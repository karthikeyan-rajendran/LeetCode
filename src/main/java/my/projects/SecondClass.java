package my.projects;

public class SecondClass {

    private String statvariable = "test";

    public String returns(){
        statvariable = "test1";
        return "test return : " + statvariable;
    }

    public static String staticreturns(){
        return "static return test";
    }

}
