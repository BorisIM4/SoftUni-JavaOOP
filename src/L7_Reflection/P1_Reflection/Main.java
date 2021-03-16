package L7_Reflection.P1_Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Class<Reflection> clazz = Reflection.class;
        System.out.println("class " + clazz.getSimpleName());

        Class<? super Reflection> baseClazz = clazz.getSuperclass();
        System.out.println("class " + baseClazz.getName());

        Class<?>[] clazzInterfaces = clazz.getInterfaces();
        Arrays.stream(clazzInterfaces).forEach(i -> System.out.println("interface " + i.getName()));

        try {
            Constructor<Reflection> ctor = clazz.getDeclaredConstructor();
            Reflection reflection = ctor.newInstance();
            System.out.println(reflection.toString());
        } catch (NoSuchMethodException
                | InvocationTargetException
                | IllegalAccessException
                | InstantiationException e) {
            e.printStackTrace();
        }
    }
}
