import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        DynamicArray M = new DynamicArray();
        int t, index, value;
        System.out.println("Введите элементы массива (0 - закончить ввод) :");
        while((t = in.nextInt()) != 0)
        {
            M.add(t);
        }
        M.info();
        System.out.print("Введите индекс изменяемого элемента : ");
        index = in.nextInt();
        System.out.print("Введите новое значение : ");
        value = in.nextInt();
        if (M.change(index, value))
        {
            System.out.println("Элемент был изменен.");
            M.info();
        }
        else System.out.println("Элемент с данным индексом не найден.");
        System.out.print("Введите значение добавляемого в массив элемента : ");
        value = in.nextInt();
        M.add(value);
        M.info();
        System.out.print("Введите индекс удаляемого элемента : ");
        index = in.nextInt();
        if (M.delete(index))
        {
            System.out.println("Элемент был изменен.");
            M.info();
        }
        else System.out.println("Элемент с данным индексом не найден.");
        in.close();
    }

}
