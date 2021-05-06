public class FeeCalculator implements Runnable{
    private Invoice invoice;

    FeeCalculator(Invoice invoice){
        this.invoice = invoice;
    }

    @Override
    public void run() {
        System.out.println("Calculating Invoice ID: " + invoice.getid());
        invoice.setTotalFee();
        System.out.println("finish calculating invoice id: " + invoice.getid());
    }
}
