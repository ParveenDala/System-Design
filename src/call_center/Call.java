package call_center;

/****
 * Parveen Dala
 * Call Center
 */
public class Call {

    private long id;
    private Rank rank;
    private Caller caller;
    private Employee handler;

    protected Call(long id, Caller caller) {
        this.id = id;
        rank = Rank.Responder;
        this.caller = caller;
    }

    protected long getId() {
        return id;
    }

    protected void addHandler(Employee handler) {
        this.handler = handler;
    }

    protected Caller getCaller() {
        return caller;
    }

    protected void reply(String s) {
        System.out.println(s);
    }

    protected Rank getRank() {
        return rank;
    }

    protected void setRank(Rank rank) {
        this.rank = rank;
    }

    protected boolean incrementRank() {
        if (rank == Rank.Responder)
            rank = Rank.Manager;
        else if (rank == Rank.Manager)
            rank = Rank.Director;
        return true;
    }

    public void disconnect() {
        if (handler != null)
            handler.callCompleted();
        else
            CallHandler.getInstance().disconnectWaitingCall(this);
    }
}
