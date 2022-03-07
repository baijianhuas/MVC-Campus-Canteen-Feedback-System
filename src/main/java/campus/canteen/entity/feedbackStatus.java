package campus.canteen.entity;

public enum feedbackStatus {

    /**
     * 是公开的，所以人都可以看到
     */
    PUBLIC(1),

    /**
     * 是私有的，只有博主才可以看到
     */
    PRIVATE(2),

    /**
     * 已经被删除了，根据回收策略进行删除
     */
    DELETED(-1);


    private final int code;

    feedbackStatus(int code) {
        this.code = code;
    }

    public int code() {
        return code;
    }
}
