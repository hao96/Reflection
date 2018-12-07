package model;

/**
 * @program: reflection
 * @description:
 * @author: hetao
 * @create: 2018-12-06 16:58
 **/

public class Hetao extends Fruit{

    private String color;



    public Hetao() {
    }

    public Hetao(String color,String name){

    }

    public Hetao(String color) {
        this.color = color;
    }



    private void myName(){}

    public static void myWeight(){}

    public String myColor(){
        return this.color;
    }




    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
