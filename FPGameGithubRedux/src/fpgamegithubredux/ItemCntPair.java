package fpgamegithubredux;

public class ItemCntPair {
    //item, then count, in that order
    private final Item item;
    private final int count;

    public ItemCntPair(Item anItem, int aCount)
    {
        item = anItem;
        count = aCount;
    }

    public Item item()   { return item; }
    public int count() { return count; }
}
