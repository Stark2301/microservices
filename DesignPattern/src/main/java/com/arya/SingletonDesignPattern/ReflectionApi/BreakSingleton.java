package com.arya.SingletonDesignPattern.ReflectionApi;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakSingleton {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

/*        SingletonDesign s = SingletonDesign.getSingletonDesign();
        System.out.println(s.hashCode());*/

//        SingletonDesign singletonDesign = SingletonDesign.getSingletonDesign();

            //We make the Singleton break with the help of Reflection Api --> by setting the Constructor Accessible --> True

      /*      Constructor<SingletonDesign> getSingleton = SingletonDesign.class.getDeclaredConstructor();
            getSingleton.setAccessible(true);
            SingletonDesign singletonDesign1 = getSingleton.newInstance();
            System.out.println(singletonDesign1.hashCode());*/

//
//        SingletonDesign singletonDesign2 = SingletonDesign.getSingletonDesign();
//
//        Constructor<SingletonDesign> getSingleton2 = SingletonDesign.class.getDeclaredConstructor();
//        getSingleton2.setAccessible(true);


        ReflectionBreakSingleton reflectionBreakSingleton = ReflectionBreakSingleton.reflectionBreakSingleton();
        System.out.println(reflectionBreakSingleton.hashCode());

        Constructor<ReflectionBreakSingleton> constructor = ReflectionBreakSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        ReflectionBreakSingleton s2 =constructor.newInstance();
        System.out.println(s2.hashCode());
    }
}
