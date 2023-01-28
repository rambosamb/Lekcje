package Lekcja6.Zadanie5;


public class Tree {
    private static Tree Tree = new Tree();
    private Tree()
    {}
    public static Tree newTree()
    {
        return Tree;
    }

}