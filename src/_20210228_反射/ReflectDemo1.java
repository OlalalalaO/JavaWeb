package _20210228_反射;

public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        //1.
        Class cls1 = Class.forName("_20210228_反射.Person");
        System.out.println(cls1);
        //2.
        Class cls2 = Person.class;
        System.out.println(cls2);
        //3.
        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);
        //cls1与cls2与cls3都是一个对象


    }
}
