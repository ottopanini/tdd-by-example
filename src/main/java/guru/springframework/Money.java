package guru.springframework;

public abstract class Money {
    protected int amount;

    static Money dollar(int amount) {
        return new Dollar(amount);
    }

    static Money franc(int amount) {
        return new Franc(amount);
    }

    public abstract Money times(int multiplier);

    @Override
    public boolean equals(Object value) {
        Money money = (Money) value;
        return amount == money.amount && getClass().equals(value.getClass());
    }
}
