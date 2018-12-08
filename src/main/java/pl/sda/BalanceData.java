package pl.sda;

import java.math.BigDecimal;
import java.util.List;

public class BalanceData {

    private List<BigDecimal> incomes;
    private List<BigDecimal> outcomes;

    BalanceData(){
    }

    BalanceData(List<BigDecimal> incomes, List<BigDecimal> outcomes) {
        this.incomes = incomes;
        this.outcomes = outcomes;
    }

    public List<BigDecimal> getIncomes() {
        return incomes;
    }

    public void setIncomes(List<BigDecimal> incomes) {
        this.incomes = incomes;
    }

    public List<BigDecimal> getOutcomes() {
        return outcomes;
    }

    public void setOutcomes(List<BigDecimal> outcomes) {
        this.outcomes = outcomes;
    }
}
