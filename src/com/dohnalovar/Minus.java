/**
 * Created by dohnalovar on 5/28/2019
 */
package com.dohnalovar;

public class Minus implements INode {
    public INode getFirst() {
        return first;
    }

    public INode getSecond() {
        return second;
    }

    public Minus(INode first, INode second) {
        this.first = first;
        this.second = second;
    }

    INode first;
    INode second;

    @Override
    public int evaluate() {
        return first.evaluate()-second.evaluate();
    }
}
