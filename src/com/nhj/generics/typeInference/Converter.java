package com.nhj.generics.typeInference;

@FunctionalInterface
public interface Converter<U, T> {
    T convert(U input);
}