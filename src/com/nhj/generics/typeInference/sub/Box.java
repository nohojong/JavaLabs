package com.nhj.generics.typeInference.sub;

import com.nhj.generics.typeInference.Converter;

public class Box<T> {

    private T value;

    // 일반 생성자
    public Box(T value) {
        this.value = value;
    }

    // 제너릭 생성자 - 다른 타입으로부터 유연하게 생성
    public <U> Box(U input, Converter<U, T> converter) {
        this.value = converter.convert(input);
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Box{" +
                "value=" + value +
                '}';
    }
}