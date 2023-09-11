package HW3Exceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParseData {
    String gender = null;
    String phoneNumber = null;
    String birthday = null;
    String surname = null;
    String firstName = null;
    String patronymic = null;

    public String[] getData(String string) {

        String[] inStr = string.split(" ");
        String[] outStr = new String[4];

        for (int i = 0; i < inStr.length; i++) {
            if (isAlpha(inStr[i])) {
                surname = inStr[i];
                firstName = inStr[i + 1];
                patronymic = inStr[i + 2];
                i += 2;
            } else if (isBirthday(inStr[i])) {
                birthday = inStr[i];
            } else if (isNumeric(inStr[i])) {
                phoneNumber = inStr[i];
            } else if (isGender(inStr[i])) {
                gender = inStr[i];
            } else throw new IncorrectDataException();
        }

        outStr[0] = surname + " " + firstName + " " + patronymic;
        outStr[1] = birthday;
        outStr[2] = phoneNumber;
        outStr[3] = gender;

        return outStr;
    }

    private boolean isNumeric(String str) {
        try {
            Long.parseLong(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isGender(String str) {
        return str.equals("m") || str.equals("f");
    }

    private boolean isBirthday(String str) {
        SimpleDateFormat format = new SimpleDateFormat("dd.mm.yyyy");
        try {
            Date date = format.parse(str);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    private boolean isAlpha(String name) {
        return name.length() != 1 && name.matches("[а-яА-Я]+");
    }
}
