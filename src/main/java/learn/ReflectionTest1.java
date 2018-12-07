package learn;

import model.Hetao;

import java.lang.reflect.InvocationTargetException;

/**
 * @program: reflection
 * @description:
 * @author: hetao
 **/

public class ReflectionTest1 {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, ClassNotFoundException {

        /**
         * 创建实例的方法
         */

        // 1，使用new关键字创建实例
        Hetao hetao = new Hetao();
        hetao.setColor("red");
        System.out.println("我的颜色：" + hetao.myColor());

        // 2，利用反射机制创建实例
        Class hetaoClass = Class.forName("model.Hetao");

        //从java 9 以后废弃了 Class.newInstance()
//        Hetao hetao2 = (Hetao) hetaoClass.newInstance();

        //使用 Class.getConstructor().newInstance()
        Hetao hetao2 = (Hetao) hetaoClass.getConstructor().newInstance();
        hetao2.setColor("yellow");
        System.out.println("我的颜色：" + hetao2.myColor());


    }





}
