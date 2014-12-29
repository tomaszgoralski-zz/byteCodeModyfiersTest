package reflection;

public class Test {

    private final static String MY_STATIC = "myStatic";
    private String test = "test";

    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException {

        System.out.println(StaticReflectionModifier.getStaticValue("reflection.Test","MY_STATIC"));
        System.out.println(InstanceReflectionModifier.getInstanceValue(new Test(),"test"));

    }

}
