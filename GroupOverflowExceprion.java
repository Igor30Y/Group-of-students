package StudentPr;
public class GroupOverflowExceprion extends Exception{
    public GroupOverflowExceprion() {
    }

    public GroupOverflowExceprion(String message) {
        super(message);
    }

    public GroupOverflowExceprion(String message, Throwable cause) {
        super(message, cause);
    }

    public GroupOverflowExceprion(Throwable cause) {
        super(cause);
    }
}
