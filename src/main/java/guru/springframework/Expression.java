package guru.springframework;

public interface Expression {
    Expression times(int multiplier);

    Expression plus(Expression addmend);

    Money reduce(Bank bank, String to);
}
