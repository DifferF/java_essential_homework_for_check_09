package homework_09.task_05;

        /*
        Задание 5+
        Создайте проект, используя IntelliJ IDEA.
        Создайте класс MyClass, содержащий статический фабричный метод - T factoryMethod(),
        который будет порождать экземпляры типа, указанного в качестве параметра типа (указателя места заполнения типом – Т).
         */

public class MyClass<T> {

    private T field;
    static String qwerty;

    public MyClass(T qwerty) {
        this.field = qwerty;
        this.qwerty = String.valueOf(field.getClass());
    }




    public static void factoryMethod() {

        System.out.println(qwerty);
    }

}

class Mainn {
    public static void main(String[] args) {
        MyClass myClass = new MyClass(2.0f);
        myClass.factoryMethod();
    }
}