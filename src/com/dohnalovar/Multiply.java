/**
 * Created by dohnalovar on 5/28/2019
 */
package com.dohnalovar;

import java.util.ArrayList;

public class Multiply implements INode {

    public Multiply(ArrayList<INode> childs) {
        this.childs = childs;
    }

    ArrayList<INode> childs;

    @Override
    public int evaluate() {
        int result = 1;
        for (INode i : childs) {
            result *= i.evaluate();
        }
        return result;
    }
}
