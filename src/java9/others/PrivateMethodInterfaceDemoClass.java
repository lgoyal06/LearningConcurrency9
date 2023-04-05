package java9.others;

public class PrivateMethodInterfaceDemoClass implements PrivateMethodInterface {
    public static void main(String... s) {
        PrivateMethodInterfaceDemoClass obj = new PrivateMethodInterfaceDemoClass();
        obj.method1();
        obj.method2();
    }
}
