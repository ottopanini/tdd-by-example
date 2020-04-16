package guru.springframework;

public interface Expression {
    Expression plus(Expression addmend);

    Money reduce(Bank bank, String to);
}
