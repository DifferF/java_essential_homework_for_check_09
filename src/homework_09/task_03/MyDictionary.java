package homework_09.task_03;


/*
Задание 3
Создайте проект, используя IntelliJ IDEA. Создайте класс MyDictionary.
Реализуйте в простейшем приближении возможность использования его экземпляра.
Минимально требуемый интерфейс взаимодействия с экземпляром, должен включать метод добавления пар элементов,
индексатор для получения значения элемента по указанному индексу и свойство только для чтения для получения общего количества пар элементов.
 */

public class MyDictionary<T> {

    T firstList[] = (T[]) new Object[10];
    T secondList[] = (T[]) new Object[10];
    int index = 0;

    MyDictionary() {
    }

    void addValue(T valueFirstList, T valueSecondList) {

        if (index == this.firstList.length - 1) {
            resizeList();
        }

        this.firstList[index] = valueFirstList;
        this.secondList[index] = valueSecondList;
        index++;
    }

    void resizeList() {
        T newList[] = (T[]) new Object[firstList.length + 10];
        T newSecondList[] = (T[]) new Object[firstList.length + 10];

        for (int i = 0; i < firstList.length; i++) {
            newList[i] = firstList[i];
            newSecondList[i] = secondList[i];
        }
        firstList = newList;
        secondList = newList;
    }
    public void getValue(int index){
        if (index < firstList.length){
            System.out.println(firstList[index] + " - " + secondList[index]);
        } else {
            throw new IndexOutOfBoundsException(("Out of array"));
        }
    }

    int length(){
        return index;
    }

    public void getTranslate(String world){
        int counter = 0;
        for (int i =0; i< this.length(); i++){
            if(world.equals(firstList[i])){
                System.out.println(firstList[i] + " - " + secondList[i]);
                counter++;
            }
        }
        if (counter == 0){
            System.out.println("Нет такого слова");
        }
    }

}

class Main{
    public static void main(String[] args) {
        MyDictionary slovar = new MyDictionary<>();
        slovar.addValue("me","я");
        slovar.addValue("you","ви");
        slovar.addValue("they","вони");

        slovar.getValue(2);
        System.out.println(slovar.length());

        slovar.getTranslate("you");
    }
}
