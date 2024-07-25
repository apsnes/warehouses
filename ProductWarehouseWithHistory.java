
public class ProductWarehouseWithHistory extends ProductWarehouse {
    
    private ChangeHistory history;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity, initialBalance);
        this.history = new ChangeHistory();
        this.history.add(initialBalance);
    }
    
    public String history() {
        return this.history.toString();
    }
    
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.history.add(this.getBalance());
    }
    
    public double takeFromWarehouse(double amount) {
        double output = super.takeFromWarehouse(amount);
        this.history.add(this.getBalance());
        return output;
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + this.getName() + "\nHistory: " + this.history() + "\nLargest amount of product: " + this.history.maxValue() + "\nSmallest amount of product: " + this.history.minValue() + "\nAverage: " + this.history.average());
    }  
}
