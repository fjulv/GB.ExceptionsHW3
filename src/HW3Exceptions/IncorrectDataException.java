package HW3Exceptions;

public class IncorrectDataException extends RuntimeException{
    public IncorrectDataException() {
        System.out.println("Вы ввели некорректные данных, введите данные в формате: \n" +
                "фамилия, имя, отчество - строки\n" +
                "дата рождения - строка формата dd.mm.yyyy\n" +
                "номер телефона - целое беззнаковое число без форматирования\n" +
                "пол - символ латиницей f или m");
    }
}
