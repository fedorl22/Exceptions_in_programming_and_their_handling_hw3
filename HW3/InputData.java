package HW3;

import java.util.Arrays;
import java.util.Scanner;

public class InputData {
    public String[] enterData() {
        try (Scanner iScanner = new Scanner(System.in)) {
            while (true) {
                System.out.print(
                        " Введите следующие данные через пробел: Фамилия Имя Отчество дата_рождения(форматdd.mm.yyyy) номер_телефона(только цифры), пол(f/m) :");
                String data = iScanner.nextLine();
                String[] arrayData = data.split(" ");
                System.out.println(data);
                System.out.println(Arrays.toString(arrayData));
                if (arrayData.length == 6) {
                    return arrayData;
                } else if (arrayData.length < 6) {
                    System.out.println("Вы ввели не все данные, попробуйте еще раз.");
                } else
                    System.out.println("Вы ввели лишьние данные, попробуйте еще раз.");
            }
        }

    }
}
