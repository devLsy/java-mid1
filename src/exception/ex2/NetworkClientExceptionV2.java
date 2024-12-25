package exception.ex2;

/**
 * checked 예외 선언
 */
public class NetworkClientExceptionV2 extends Exception {

    private String errorCose;

    public NetworkClientExceptionV2(String errorCose, String message) {
        super(message);
        this.errorCose = errorCose;
    }
    
    public String getErrorCose() {
        return errorCose;
    }
}
