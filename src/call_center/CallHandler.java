package call_center;

import java.util.ArrayList;
import java.util.List;

/****
 * Parveen Dala
 * Call Center
 */
public class CallHandler {

    private static CallHandler INSTANCE;

    private final int TOTAL_RESPONDENTS = 10;
    private final int TOTAL_MANAGERS = 3;
    private final int TOTAL_DIRECTORS = 2;

    /**
     * List of employees, by level.
     * employeesByLevels[0] = respondents
     * employeesByLevels[1] = managers
     * employeesByLevels[2] = directors
     */
    List<List<Employee>> employeesByLevels;

    /* Queues for each call's rank */
    List<List<Call>> waitingCalls;

    private long CALL_ID;

    private CallHandler() {
        initEmployees();
    }

    private void initEmployees() {

        waitingCalls = new ArrayList<>();
        waitingCalls.add(new ArrayList<>());
        waitingCalls.add(new ArrayList<>());
        waitingCalls.add(new ArrayList<>());

        employeesByLevels = new ArrayList<>();
        List<Employee> respondents = new ArrayList<>();
        for (int i = 0; i < TOTAL_RESPONDENTS; i++) {
            respondents.add(new Respondent("R" + i));
        }
        employeesByLevels.add(respondents);

        List<Employee> managers = new ArrayList<>();
        for (int i = 0; i < TOTAL_MANAGERS; i++) {
            managers.add(new Manager("M" + i));
        }
        employeesByLevels.add(managers);

        List<Employee> directors = new ArrayList<>();
        for (int i = 0; i < TOTAL_DIRECTORS; i++) {
            directors.add(new Director("D" + i));
        }
        employeesByLevels.add(directors);

    }

    public static CallHandler getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CallHandler();

        }
        return INSTANCE;
    }

    public void connect(Caller caller) {
        Call call = new Call(CALL_ID++, caller);
        System.out.println("\nGot new call " + call.getId());
        caller.setCall(call);
        dispatchCall(call);
    }

    /*
     * Route the call to an available emplotee, or saves in a queue
     * if no employee available
     */
    protected synchronized void dispatchCall(Call call) {
        Employee employee = getHandlerForTheCall(call);
        if (employee != null) {
            System.out.println(call.getId() + " Assigned to " + employee.getName());
            call.addHandler(employee);
            employee.receiveCall(call);
        } else {
            call.reply("Please wait for free employee to reply - " + call.getId());
            waitingCalls.get(call.getRank().getValue()).add(call);
        }
    }

    private Employee getHandlerForTheCall(Call call) {
        Rank rank = call.getRank();
        List<Employee> employeeList = employeesByLevels.get(rank.getValue());
        if (employeeList != null && employeeList.size() > 0) {
            for (Employee employee : employeeList) {
                if (employee.isFree())
                    return employee;
            }
        }
        return null;
    }

    protected synchronized boolean assignCall(Employee employee) {
        System.out.println("\nAvailable calls " + waitingCalls.get(0).size() + "  " + waitingCalls.get(1).size() + "  " + waitingCalls.get(2).size());
        List<Call> callLists = waitingCalls.get(employee.getRank().getValue());
        if (callLists != null && callLists.size() > 0) {
            Call call = callLists.get(0);
            if (call != null) {
                callLists.remove(call);
                call.addHandler(employee);
                System.out.println(call.getId() + " Assigned to " + employee.getName());
                employee.receiveCall(call);
                return true;
            }
        }
        System.out.println("Calls not available for " + employee.getRank());
        return false;
    }

    protected void disconnectWaitingCall(Call call) {
        boolean disconnected = false;
        List<Call> waitingCalls = this.waitingCalls.get(call.getRank().getValue());
        for (Call locCal : waitingCalls) {
            if (locCal.getId() == call.getId()) {
                disconnected = true;
                waitingCalls.remove(locCal);
                System.out.println("Disconnected waiting call " + call.getId());
                break;
            }
        }
        if (!disconnected)
            System.out.println("Waiting call Not found... " + call.getId());

        call.getCaller().setCall(null);
    }
}
