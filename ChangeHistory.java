import java.util.ArrayList;

public class ChangeHistory {
    
    private ArrayList<Double> values;
    
    public ChangeHistory() {
        this.values = new ArrayList<Double>();
    }
    
    public void add(double status) {
        this.values.add(status);
    }
    
    public void clear() {
        this.values.clear();
    }
    
    public String toString() {
        return this.values.toString();
    }
    
    public double maxValue() {
        if (this.values.isEmpty()) {
            return 0.0;
        }
        Double highest = 0.0;
        for (Double value : this.values) {
            if (value > highest) {
                highest = value;
            }
        }
        return highest;
    }
    
    public double minValue() {
        if (this.values.isEmpty()) {
            return 0.0;
        }
        Double lowest = this.values.get(0);
        for (Double value : this.values) {
            if (value < lowest) {
                lowest = value;
            }
        }
        return lowest;
    }
    
    public double average() {
        if (this.values.isEmpty()) {
            return 0.0;
        }
        Double count = 0.0;
        Double sum = 0.0;
        for (Double value : this.values) {
            sum += value;
            count++;
        }
        return (sum * 1.0) / count;
    }
    
    
    
}
