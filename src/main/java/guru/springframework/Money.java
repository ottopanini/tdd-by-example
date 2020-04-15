package guru.springframework;

public class Money {
    protected int amount;

    @Override
    public boolean equals(Object value) {
        Money money = (Money) value;
        return amount == money.amount;
    }
}
