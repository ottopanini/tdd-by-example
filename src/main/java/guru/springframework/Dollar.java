package guru.springframework;

public class Dollar {
    private int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    public boolean equals(Object value) {
        Dollar dollar = (Dollar) value;
        return amount == dollar.amount;
    }
}
