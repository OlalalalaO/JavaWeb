package _20210228_反射;

import java.lang.reflect.Field;

public class RefiectDemo2 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //获取Person的字节码对象
        Class<Person> personClass = Person.class;
        //获取成员变量


        //获取所有public修饰的成员变量
        Field[] field = personClass.getFields();
        for (Field field1 : field) {
            System.out.println(field1);
        }
        System.out.println("--------------");


        //获取指定名称的成员变量
        Field a = personClass.getField("a");
        //获取a的值
        Person person = new Person();
        Object value = a.get(person);
        System.out.println(value);
        //设置a的值
        a.set(person,"张三");
        System.out.println(person);
        System.out.println("===============");
        //获取所有的成员变量，不考虑修饰符
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
    }
}
