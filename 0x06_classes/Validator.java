public class Validator {


    public validator() {}

    public boolean validate(String password) {
        if (checkLength(password) && checkNumber(password)) {
            return true;
        }


        return false;
    }

    private boolean checkLength(String str) {
        if (str.length() >= 8) {
            return true;
        }

        return  false;
    }


    private boolean checkNumber(String str) {
        if (str.matches("[0-9]+")) {
            return true;
        } return  false;
    }

    private boolean checkLower(String str) {
        if (str.matches("[a-z]+")) {
            return true;
        } return  false;
    }

    private boolean checkUpper(String str) {
        if (str.matches("[A-Z]+")) {
            return true;
        } return  false;
    }

}
