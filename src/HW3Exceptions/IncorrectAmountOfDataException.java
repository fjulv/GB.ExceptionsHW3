package HW3Exceptions;

public class IncorrectAmountOfDataException extends RuntimeException{
    public IncorrectAmountOfDataException() {
        super("Вы ввели некорректное количество данных, введите данные в формате: \n" +
        "фамилия, имя, отчество - строки\n" +
                "дата рождения - строка формата dd.mm.yyyy\n" +
                "номер телефона - целое беззнаковое число без форматирования\n" +
                "пол - символ латиницей f или m");
    }
}
