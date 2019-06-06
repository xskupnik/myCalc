package com.dohnalovar;
import java.util.ArrayList;

/**
 * Created by dohnalovar on 5/28/2019
 */
public class Plus implements INode {

    public Plus(ArrayList<INode> childs) {
        this.childs = childs;
    }

    ArrayList<INode> childs;


    @Override
    public int evaluate() {
        int result = 0;
        for (INode i : childs) {
            result += i.evaluate();
        }
        return result;
    }
}
