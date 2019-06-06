/**
 * Created by dohnalovar on 5/28/2019
 */
package com.dohnalovar;

public class AbsolutValue implements INode {

    public AbsolutValue(INode first) {
        this.first = first;
    }

    INode first;

    @Override
    public int evaluate() {
        int x = first.evaluate();
        return x>0 ? x : -x;
    }


}
