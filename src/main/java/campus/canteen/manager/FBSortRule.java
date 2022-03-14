package campus.canteen.manager;

import campus.canteen.commom.Order;
import campus.canteen.commom.Rule;

public class FBSortRule {
    private final Rule rule;
    private final Order order;

    public FBSortRule(Rule rule, Order order) {
        this.rule = rule;
        this.order = order;
    }

    public Rule getRule() {
        return rule;
    }

    public Order getOrder() {
        return order;
    }
}
