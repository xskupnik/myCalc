package com.dohnalovar;
/**
 * Created by dohnalovar on 5/28/2019
 */
public class Division implements INode {

    public Division(INode first, INode second) {
        this.first = first;
        this.second = second;
    }

    INode first;
    INode second;

    @Override
    public int evaluate() {
        return first.evaluate() / second.evaluate();
    }


}
