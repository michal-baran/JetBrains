import java.lang.reflect.Method;

class MethodFinder {
    public static String findMethod(String methodName, String[] classNames) throws ClassNotFoundException {
        Method[] methods;
        for (String s : classNames) {
            methods = Class.forName(s).getMethods();
            for (Method m : methods) {
                if (methodName.equals(m.getName())) {
                    return s;
                }
            }
        }
        return null;
    }
}
class Main {
    public static void main(String[] args) throws ClassNotFoundException{
        System.out.println(String.class);
        System.out.println(String.class.getClass());
        System.out.println("".getClass());
//        System.out.println(Class.forName("String"));
        System.out.println(String.class.getSuperclass());
    }
}