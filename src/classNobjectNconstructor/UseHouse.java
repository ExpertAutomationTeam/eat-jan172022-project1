package classNobjectNconstructor;

import classNmethodNobject.Calculator;

public class UseHouse {
    public static void main(String[] args) {

        //object = class instance
        House myHouse = new House(); //using constructor3
//        myHouse.room();
//        myHouse.kitchen();

        House yourHouse = new House("white"); //using constructor1
        yourHouse.room();

        House everyonesHouse = new House("red", 1000);//using constructor2
        everyonesHouse.kitchen();

        Calculator cal = new Calculator();
        //cal.addition(3, 8);

    }
}
