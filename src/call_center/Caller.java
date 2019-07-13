package call_center;

/****
 * Parveen Dala
 * Call Center
 */
public class Caller {

    private String name;
    private Call call;

    public Caller(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    protected void setCall(Call call) {
        this.call = call;
    }

    public Call getCall() {
        return call;
    }
}
