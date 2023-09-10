package HW3Exceptions;

import java.util.Scanner;

public class ConsoleMenu {
    public String ShowMenu() {
        Scanner scanner = new Scanner(System.in);
        String stringData;
        System.out.println("Добро пожаловать в прилжение!\n Введите данные в формате: \n" +
                "фамилия, имя, отчество - строки\n" +
                "дата рождения - строка формата dd.mm.yyyy\n" +
                "номер телефона - целое беззнаковое число без форматирования\n" +
                "пол - символ латиницей f или m");
        stringData = scanner.nextLine();
        return stringData;
    }
}
