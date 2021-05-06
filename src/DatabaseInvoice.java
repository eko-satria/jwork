import java.util.ArrayList;

public class DatabaseInvoice {
    private static final ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<>();
    private static int lastId = 0;

    public static final ArrayList<Invoice> getInvoiceDatabase() {
        return INVOICE_DATABASE;
    }

    public static final int getLastId() {
        return lastId;
    }

    public static final Invoice gettInvoiceById(int id) {
        for(Invoice invoice : INVOICE_DATABASE) {
            if(invoice.getid() == id) {
                return invoice;
            }
        }
        return null;
    }

    public static ArrayList<Invoice> getInvoiceByJobseeker(int jobseekerid) {
        for(Invoice jobseeker : INVOICE_DATABASE) {
            if(jobseeker.getid() == jobseekerid) {
                INVOICE_DATABASE.add(jobseeker);
                return INVOICE_DATABASE;
            }
        }
        return null;
    }

    public static boolean addInvoice (Invoice invoice) {
        INVOICE_DATABASE.add(invoice);
        lastId = invoice.getid() + 1;
        
        return true;
    }

    public static boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus)
    {
        for(Invoice invoice : INVOICE_DATABASE)
        {
            if(invoice.getid() == id)
            {
                if(invoiceStatus == InvoiceStatus.ONGOING)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean removeInvoice (int id) {
        for(Invoice invoice : INVOICE_DATABASE) {
            if (invoice.getid() == id) {
                INVOICE_DATABASE.remove(invoice);
                return true;
            }
        }
        return false;
    }
}
