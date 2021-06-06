package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.MyData;

public class InvariantApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("Eko");
        // doIt(stringMyData);
        // MyData<Object> objectMyData = stringMyData;

        MyData<Object> objectMyData = new MyData<>(1000);
        // MyData<Integer> integerMyData = objectMyData;
        // doItInteger(objectMyData);

    }

    public static void doIt(MyData<Object> objectMyData){
        // do nothing
    }
    public static void doItInteger(MyData<Integer> integerMyData){
        // do nothing
    }

}
