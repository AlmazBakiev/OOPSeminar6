package DIP;

public interface Engine {
    // За счет введения данного интерфейса нет зависимоти класса верхнего уровня от класса нижнего уровня
    public void start();
}
