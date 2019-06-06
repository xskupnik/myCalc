/**
 * Created by dohnalovar on 5/28/2019
 */
package com.dohnalovar;

public class Leaf implements INode {

    public int getValue() {
        return value;
    }

    public Leaf(int value) {
        this.value = value;
    }

    int value;

    @Override
    public int evaluate() {
        return getValue();
    }
}
