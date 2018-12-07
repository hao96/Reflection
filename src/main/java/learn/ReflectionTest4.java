package learn;

import model.Hetao;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @program: reflection
 * @description:
 * @author: hetao
 **/

public class ReflectionTest4 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        //利用反射机制创建实例
        Hetao hetao = Hetao.class.getDeclaredConstructor(String.class).newInstance("yellow");
        //得到该类的一个实例方法
        Method myColor = Hetao.class.getMethod("myColor");
        //若有 访问限制
        //myColor.setAccessible(true);
        //调用方法 若为类方法，hetao会被忽略，可以为空
        String myColorStr = (String) myColor.invoke(hetao);

        System.out.println(myColorStr);

    }
}
