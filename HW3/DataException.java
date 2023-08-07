package HW3;

public class DataException extends Exception{
    public DataException() {
    }

    public void dataException(String i) {
        System.out.printf("Неверный формат: ", i);
        System.out.println();
    }
}
