package lpApiAutomation.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrew on 4/9/16.
 */
public class LpVisitor {
    private String visitor_id;
    private List sessions = new ArrayList();

    public LpVisitor() {
        // TODO: gen a id
    }

    public String getVisitor_id() {
        return visitor_id;
    }

    public void setVisitor_id(String visitor_id) {
        this.visitor_id = visitor_id;
    }
}
