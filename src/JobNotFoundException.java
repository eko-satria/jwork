import java.util.*;

public class JobNotFoundException extends Exception {
    private int job_error;

    public JobNotFoundException(int job_input)
    {
        super("job ID: ");
        this.job_error = job_input;
    }

    public String getMessage()
    {
        return super.getMessage()+job_error+"not found";
    }
}
