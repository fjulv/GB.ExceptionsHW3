package HW3Exceptions;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ConsoleMenu consoleMenu = new ConsoleMenu();
        String inputText = consoleMenu.ShowMenu();

        CheckInputData checkInputData = new CheckInputData();
        boolean isChecked = checkInputData.checkData(inputText);

        ParseData parseData = new ParseData();

        FileManager fileManager = new FileManager();

        String[] foundString = new String[4];

        if (isChecked) {
            foundString = parseData.getData(inputText);
        }

        fileManager.writeFile("C:\\Users\\user\\Desktop\\javaGB\\ExceptionsHW3\\src\\HW3Exceptions\\/" + parseData.surname + ".txt", Arrays.toString(foundString));
    }
}
