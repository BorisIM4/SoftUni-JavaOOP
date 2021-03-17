package L7_Reflection.P3_High_Quality_Mistakes;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class reflection = Reflection.class;

        Method[] methods = reflection.getDeclaredMethods();
        List<Method> getters = new ArrayList<>();
        List<Method> setters = new ArrayList<>();

        for (Method method : methods) {
            if(method.getName().startsWith("get")){
                getters.add(method);
            }else if (method.getName().startsWith("set")){
                setters.add(method);
            }
        }


 /*
        getters
                .stream()
                .sorted(Comparator.comparing(Method::getName))
                .forEach(g -> System.out.printf("%s will return class %s%n",g.getName(),g.getReturnType().getName()));
        setters
                .stream()
                .sorted(Comparator.comparing(Method::getName))
                .forEach(s -> System.out.printf("%s and will field of class %s%n",s.getName(), s.getReturnType().getName()));*/


        Field[] fields = Reflection.class.getDeclaredFields();

        Arrays.stream(fields)
                .filter(f -> !Modifier.isPrivate(f.getModifiers()))
                .sorted((Comparator.comparing(Field::getName)))
                .forEach(f-> System.out.println(f.getName() + " must be private!"));

        getters.stream()
                .filter(g -> !Modifier.isPublic(g.getModifiers()))
                .sorted((Comparator.comparing(Method::getName)))
                .forEach(g -> System.out.println(g.getName() + " have to be public!"));

        setters.stream()
                .filter(s -> !Modifier.isPrivate(s.getModifiers()))
                .sorted((Comparator.comparing(Method::getName)))
                .forEach(s -> System.out.println(s.getName() + " have to be private!"));
    }
}
