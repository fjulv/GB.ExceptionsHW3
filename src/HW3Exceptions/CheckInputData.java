package HW3Exceptions;

public class CheckInputData {
    public boolean checkData(String str) {
        String[] string = str.split(" ");

        if (string.length == 6) {
            return true;
        } else throw new IncorrectAmountOfDataException();
    }
}
