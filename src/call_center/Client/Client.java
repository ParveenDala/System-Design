package call_center.Client;

import call_center.CallHandler;
import call_center.Caller;

/****
 * Parveen Dala
 * Call Center
 */
public class Client {

    public static void main(String[] args) {
        CallHandler callHandler = CallHandler.getInstance();

        int n = 18;
        Caller[] callers = new Caller[n];
        for (int i = 0; i < callers.length; i++) {
            callers[i] = new Caller(String.valueOf(i));
            callHandler.connect(callers[i]);
        }

        disconnect(callers[0]);
        disconnect(callers[0]);
        disconnect(callers[15]);
    }

    private static void disconnect(Caller caller) {
        System.out.println();
        if (caller.getCall() != null) {
            print("Caller " + caller.getName() + " Wants to disconnect the call.... Disconnecting");
            caller.getCall().disconnect();
        } else {
            print("Caller " + caller.getName() + " Wants to disconnect the call.... Call already disconnected");
        }
    }

    private static void print(String s) {
        System.out.println(s);
    }

}
