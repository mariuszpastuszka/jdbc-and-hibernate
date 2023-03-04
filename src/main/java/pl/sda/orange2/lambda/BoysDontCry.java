package pl.sda.orange2.lambda;

// It's functional interface because has one abstract method
@FunctionalInterface
public interface BoysDontCry {
    void silnoreki();
    default void cry() {}
}
