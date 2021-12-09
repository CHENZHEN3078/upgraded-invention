package work;

public class CatNotFoundException extends RuntimeException {
    public CatNotFoundException() {
    }

    public CatNotFoundException(String message) {
        super(message);
    }
}
