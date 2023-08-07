package HW3;

public class SexException extends Exception {
    public SexException() {
    }

    public void sexException(String i) {
        System.out.printf("Вы ввели некорректны пол: %s", i);
        System.out.println();
    }
}
