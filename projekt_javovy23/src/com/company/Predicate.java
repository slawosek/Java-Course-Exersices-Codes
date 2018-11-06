package com.company;

@FunctionalInterface
public interface Predicate<T> {

    boolean test(T t);

    default Predicate<T> and(Predicate<T> other){
        return t -> test(t) && other.test(t);
    }
    default Predicate<T> or(Predicate<T> other){
        return t -> test(t) || other.test(t);
    }
    static <U>Predicate<U> isEqual(U u){
        return s -> s.equals(u);
    }
}
