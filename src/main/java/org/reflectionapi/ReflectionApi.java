package org.reflectionapi;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionApi {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Class<User> user = (Class<User>) Class.forName("org.reflectionapi.User");
        System.out.println(user.getName());

        Method m = user.getDeclaredMethod("hello", String.class);
        m.setAccessible(true);

    }
}
