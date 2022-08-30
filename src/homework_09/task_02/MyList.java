package homework_09.task_02;


    /*
    Задание 2+
    Создайте проект, используя IntelliJ IDEA.
    Создайте класс MyList. Реализуйте в простейшем приближении возможность использования его экземпляра аналогично экземпляру класса List.
    Минимально требуемый интерфейс взаимодействия с экземпляром, должен включать метод добавления элемента,
    индексатор для получения значения элемента по указанному индексу и свойство только для чтения для получения общего количества элементов.
     */

public class MyList<T> {

    T arrayT[] = (T[]) new Object[10];
    int currentIndex = 0;

    MyList() {
    }

    void addValue (T valueInList){

        if (currentIndex == this.arrayT.length -1){
            resizeList();
        }
        this.arrayT[currentIndex] = valueInList;
        currentIndex++;
    }

    void resizeList(){
        T newList[] = (T[]) new Object[arrayT.length + 10];

        for (int i = 0; i < arrayT.length; i++){
            newList[i] = arrayT[i];
        }
        arrayT = newList;
    }

    public T getValue(int index){
        if (index < arrayT.length){
            return arrayT[index];
        } else {
            throw new IndexOutOfBoundsException("Out of Array");
        }
    }

    int length(){
      return currentIndex;
    }
}

class Main{

    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.addValue(00);
        myList.addValue(11);
        myList.addValue(22);
        myList.addValue(33);
        myList.addValue(44);
        myList.addValue(55);
        myList.addValue(66);
        myList.addValue(77);
        myList.addValue(88);
        myList.addValue(99);

        myList.addValue(1);
        myList.addValue(2);
        myList.addValue(3);

        System.out.println((myList.getValue(1)));
        System.out.println((myList.getValue(10)));
        System.out.println("Длина листа = " + myList.length());

        MyList<String> arrayString = new MyList<>();
        arrayString.addValue("String");
        System.out.println(arrayString.getValue(0));
    }
}
