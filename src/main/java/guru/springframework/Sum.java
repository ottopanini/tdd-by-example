package guru.springframework;

public class Sum implements Expression {
    public Expression augmend;
    public Expression addmend;

    public Sum(Expression augmend, Expression addmend) {
        this.augmend = augmend;
        this.addmend = addmend;
    }

    @Override
    public Expression plus(Expression addmend) {
        return null;
    }

    public Money reduce(Bank bank, String to) {
        int amount = augmend.reduce(bank, to).amount + addmend.reduce(bank, to).amount;
        return new Money(amount, to);
    }
}
