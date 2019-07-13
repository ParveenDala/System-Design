package call_center;

/****
 * Parveen Dala
 * Call Center
 */
public class Employee {

    private String name;
    private Rank rank;
    private Call currentCall;
    private boolean isFree = true;

    public Employee(String name, Rank rank) {
        this.name = name;
        this.rank = rank;
    }

    protected void receiveCall(Call call) {
        isFree = false;
        System.out.println(name + " Received call " + call.getId());
        this.currentCall = call;
        setTimer();
    }

    private void setTimer() {
        new java.util.Timer().schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        if (!isFree && currentCall != null) {
                            if (Math.random() < 0.5)
                                escalateAndReassign();
                            else
                                callCompleted();
                        }
                    }
                },
                5000
        );
    }

    protected void callCompleted() {
        currentCall.getCaller().setCall(null);
        System.out.println(name + " disconnected call " + currentCall.getId());
        assignNewCall();
    }

    private void escalateAndReassign() {
        currentCall.incrementRank();
        System.out.println(name + " Escalated call " + currentCall.getId());
        CallHandler.getInstance().dispatchCall(currentCall);
        assignNewCall();
    }

    private void assignNewCall() {
        isFree = true;
        System.out.println(name + " is free, Assign new call if available\n");
        CallHandler.getInstance().assignCall(this);
    }

    protected boolean isFree() {
        return isFree;
    }

    protected String getName() {
        return name;
    }

    protected Rank getRank() {
        return rank;
    }
}
