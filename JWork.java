
/**
 * Write a description of class JWork here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JWork
{
    public static void main(String[] args) {
        Location location1 = new Location("Jakarta", "Jakarta", "description");
        Recruiter recruiter1 = new Recruiter(1, "eko", "eko12@gmail.com", "088883546", location1);
        Job job1 = new Job(1, "Senior Designer", 1000000, JobCategory.WebDeveloper, recruiter1);
        Jobseeker jobseeker1 = new Jobseeker(1, "eko", "eko12@gmail.com", "pass", "12-2-12");
        Invoice invoice1 = new Invoice(1, 352, "12-2-14", 50000, jobseeker1, PaymentType.EwalletPayment, InvoiceStatus.FINISHED);
        
        recruiter1.setName("Indira");
        invoice1.printData();
    }
}
