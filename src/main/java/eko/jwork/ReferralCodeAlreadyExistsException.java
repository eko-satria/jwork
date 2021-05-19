package eko.jwork;
import java.util.*;

public class ReferralCodeAlreadyExistsException extends Exception {
    private Bonus bonus_error;

    public ReferralCodeAlreadyExistsException(Bonus bonus_input)
    {
        super("Referal Code: ");
        this.bonus_error=bonus_input;
    }

    public String getMessage()
    {
        return super.getMessage() + bonus_error.getRefferalCode() + " already exists.";
    }
}