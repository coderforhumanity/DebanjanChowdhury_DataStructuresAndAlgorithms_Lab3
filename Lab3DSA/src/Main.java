import java.io.*;

import com.lab3dsa.assignments.BalancingBrackets;
import com.lab3dsa.assignments.SumPair;

public class Main {

    public static void main(String[] args)
    {
        // Balancing Brackets (Assignment 1)
        String expr1 = "( [ [ { } ] ] )";
        String expr2 = "( [ [ { } ] ] ) )";

        if (BalancingBrackets.areBracketsBalanced(expr1))
            System.out.println("The entered String has Balanced Brackets");
        else
            System.out.println("The entered Strings do not contain Balanced Brackets");

        if (BalancingBrackets.areBracketsBalanced(expr2))
            System.out.println("The entered String has Balanced Brackets");
        else
            System.out.println("The entered Strings do not contain Balanced Brackets");


        // Sum Pair (Assignment 2)
        SumPair.Node root = null;
        root = SumPair.insert(root, 40);
        root = SumPair.insert(root, 20);
        root = SumPair.insert(root, 60);
        root = SumPair.insert(root, 10);
        root = SumPair.insert(root, 30);
        root = SumPair.insert(root, 50);
        root = SumPair.insert(root, 70);


        int sum = 130;
        SumPair.findPair(root, sum);

        sum = 0;
        SumPair.findPair(root, sum);









    }







}