package ch11exception.book.exercise.p07;

public class NotExistIdException extends Exception {
    public NotExistIdException() {
    }

    public NotExistIdException(String message) {
        super(message);
    }
}
