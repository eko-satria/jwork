public enum InvoiceStatus{
    ONGOING("ONGOING"),
    FINISHED("FINISHED"),
    CANCELED("CANCELED");

    String status;

    InvoiceStatus(String status){
        this.status = status;
    }

    public String toString(){
        return status;
    }
}