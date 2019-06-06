package com.dohnalovar;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        INode test1 = new Leaf(2);
        INode test2 = new Leaf(-1);
        AbsolutValue test3 = new AbsolutValue(test2);
        System.out.println("2 = "+test1.evaluate());
        System.out.println("abs(-1) = "+test3.evaluate());
        Minus minus = new Minus(test1, test2);
        System.out.println("2 - (-1) = "+minus.evaluate());

        // minus for tree: 3 - ( 2 - 1 )
        INode tree = new Minus(new Leaf(3),
            new Minus(new Leaf(2), new Leaf(1)));
        System.out.println("3 - ( 2 - 1 ) = "+tree.evaluate());

        // division
        INode division = new Division(
            new Leaf(5), new Leaf(2));
        System.out.println("5 / 2 = "+division.evaluate());

        // plus 3 + 4 + 5
        ArrayList<INode> array = new ArrayList<INode>();
        array.add(new Leaf(3));
        array.add(new Leaf(4));
        array.add(new Leaf(5));
        Plus plus = new Plus(array);
        System.out.println("3 + 4 + 5 = "+plus.evaluate());

        array.add(new Minus(new Leaf(6),
                                               new Leaf(1)));
        System.out.println("3 + 4 + 5 + ( 6 - 1 ) = "+plus.evaluate());

        // multiply 3 * 4 * 5 * ( 6 - 1 )
        Multiply multiply = new Multiply(array);
        System.out.println("3 * 4 * 5 * ( 6 - 1 ) = "+multiply.evaluate());

        // y = abs(1-3)
        INode y = new AbsolutValue(
            new Minus(new Leaf(1),
                new Leaf(3)));
        System.out.println("y = abs(1 - 3)");

        // x = (1 + y)
        ArrayList<INode> plus3 = new ArrayList<INode>();
        plus3.add(new Leaf(1));
        plus3.add(y);
        INode x = new Plus(plus3);
        System.out.println("x = (1 + y)");

        ArrayList<INode> plus1 = new ArrayList<INode>();
        plus1.add(new Leaf(5));
        plus1.add(x);
        INode plus1Node = new Plus(plus1);

        ArrayList<INode> plus2 = new ArrayList<INode>();
        plus2.add(x);
        plus2.add(y);
        plus2.add(new Leaf(1));
        INode plus2Node = new Plus(plus2);

        ArrayList<INode> multiply1 = new ArrayList<INode>();
        multiply1.add(plus1Node);
        multiply1.add(plus2Node);

        INode formula = new Minus(new Leaf(3), new Multiply(multiply1));
        System.out.println("3 - (5 + x) * (x + y + 1) = "+formula.evaluate());

    }

}
