package learn;

import model.Hetao;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @program: reflection
 * @description:
 * @author: hetao
 * @create: 2018-12-06 18:39
 **/

public class ReflectionTest3 {

    public static void main(String[] args) {


        /**
         * 因为 Constructor Method Field 都继承或间接继承了 AccessibleObject类
         * 通过 setAccessible(boolean) 是否 能够被访问
         * 可以简单理解成 访问任何有访问限制的构造器、字段、方法。
         */


        /**
         * 得到 构造函数
         *
         * 3
         * model.Hetao
         * class model.Hetao
         * [class java.lang.String]
         * model.Hetao
         * class model.Hetao
         * [class java.lang.String, class java.lang.String]
         * model.Hetao
         * class model.Hetao
         * []
         *
         * 只能得到 访问权限为 public的构造函数
         */

        System.out.println(Hetao.class.getConstructors().length);
        for (Constructor constructor : Hetao.class.getConstructors()){
            System.out.println(constructor.getName());
            System.out.println(constructor.getDeclaringClass());
            System.out.println(Arrays.asList(constructor.getParameterTypes()));
        }

        /**
         * 得到 方法
         *
         * 13
         * myWeight
         * myColor
         * getColor
         * setColor
         * (Object)
         * wait
         * wait
         * wait
         * equals
         * toString
         * hashCode
         * getClass
         * notify
         * notifyAll
         *
         * 得到 本类及父类的所有public修饰的 实例方法和类方法
         */

        System.out.println(Hetao.class.getMethods().length);
        for (Method method : Hetao.class.getMethods()){
            System.out.println(method.getName());
        }


        /**
         * 0
         */
        System.out.println(Hetao.class.getFields().length);


    }

}
