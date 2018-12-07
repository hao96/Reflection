package model;

/**
 * @program: reflection
 * @description:
 * @author: hetao
 * @create: 2018-12-06 16:59
 **/

public class Apple {

    private String color;

    public Apple(String color) {
        this.color = color;
    }


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
