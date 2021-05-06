import java.util.*;

public class BonusNotFoundException extends Exception {
    private int bonus_error;

    public BonusNotFoundException(int bonus_input)
    {
        super("bonus ID: ");
        this.bonus_error = bonus_input;
    }

    public String getMessage()
    {
        return super.getMessage()+bonus_error+"not found";
    }
}
