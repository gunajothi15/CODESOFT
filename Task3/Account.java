package Task3;
import java.util.ArrayList;
import java.util.List;

public class Account {
    private String name;
    private double bal;
    private List<String> hist;

    public Account(String name, double initialBal) {
        this.name = name;
        this.bal = initialBal;
        this.hist = new ArrayList<>();
        this.hist.add("Initial bal: Rs." + initialBal);
    }

    public String getName() {
        return name;
    }

    public double getBal() {
        return bal;
    }

    public boolean deposit(double amt) {
        if (amt > 0) {
            bal += amt;
            hist.add("Dep: Rs." + amt);
            return true;
        }
        return false;
    }

    public boolean withdraw(double amt) {
        if (amt > 0 && amt <= bal) {
            bal -= amt;
            hist.add("Wdw: Rs." + amt);
            return true;
        }
        return false;
    }

    public List<String> getHist() {
        return hist;
    }
}