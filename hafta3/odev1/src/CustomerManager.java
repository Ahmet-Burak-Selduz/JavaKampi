public class CustomerManager {
    private Customer customer;
    private CreditManager creditManager;

    public CustomerManager(Customer customer, CreditManager creditManager){
        this.customer = customer;
        this.creditManager = creditManager;
    }
    public void save(){
        System.out.println("Müşteri Kaydedildi: ");
    }
    public void delete(){
        System.out.println("Müşteri Silindi: ");
    }
    public void giveCredit(){
        this.creditManager.calculate();
        System.out.println("Kredi Verildi.");
    }
}
