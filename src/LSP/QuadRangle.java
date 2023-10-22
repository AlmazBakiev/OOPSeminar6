package LSP;

public abstract class QuadRangle {
    // Абстракный класс QuadRangle нужен для того чтобы при вызове метода area() класс-родитель и класс-потомок
    // работали без нарушения и использовались одинаково
    public abstract int area();
}
