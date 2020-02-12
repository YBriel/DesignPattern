package responsibilitychain;

/**
 * Author： yuzq
 * Description:
 * Date: 2019/12/25   11:02
 */
public class LeaveRequest {

    private String name;
    private String reason;
    private int days;

    public LeaveRequest(String name, String reason, int days) {
        this.name = name;
        this.reason = reason;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
