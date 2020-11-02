package fpgamegithubredux;

public class StatAction {
    private final int statID;
    private final CharAction charAction;

    public StatAction(int aStatID, CharAction aCharAction)
    {
        statID = aStatID;
        charAction = aCharAction;
    }

    public int statID()   { return statID; }
    public CharAction charAction() { return charAction; }
}
