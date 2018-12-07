package learn;

import model.Hetao;

/**
 * @program: reflection
 * @description:
 * @author: hetao
 * @create: 2018-12-06 18:07
 **/

public class ReflectionTest2 {

    public static void main(String[] args) throws ClassNotFoundException {
        /**
         *得到 class对象 的三种方式
         */

        //1，直接 类名.class
        Class hetaoClass = Hetao.class;

        //2，调用对象的getClass()方法
        Hetao hetao1 = new Hetao();
        Class hetao1Class = hetao1.getClass();

        //3，Class.forName()方法
        Class hetao2Class = Class.forName("model.Hetao");
    }
}
