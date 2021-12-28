package kr.or.shi.interface05.case03;

import java.util.*;

public class Shelf {
    protected ArrayList<String> shelf;
    
    public Shelf()
    {
        shelf = new ArrayList<>();
    }

    public ArrayList<String> getShelf()
    {
        return shelf;
    }

    public int getCount()
    {
        return shelf.size();
    }
    
}
