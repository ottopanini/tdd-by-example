package guru.springframework;

public class Franc {
    private int amount;

    public Franc(int amount) {
        this.amount = amount;
    }

    Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    public boolean equals(Object value) {
        Franc franc = (Franc) value;
        return amount == franc.amount;
    }
}
