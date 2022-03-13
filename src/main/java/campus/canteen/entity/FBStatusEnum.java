package campus.canteen.entity;

import campus.canteen.entity.feedback.FB;

public enum FBStatusEnum {


    /**
     * 博文是公开的，所以人都可以看到
     */
    PUBLIC(1, "公开"),

    /**
     * 博文是私有的，只有博主才可以看到
     */
    PRIVATE(2, "私有"),

    /**
     * 文章已经被删除了，根据回收策略进行删除
     */
    DELETED(-1, "已删除"),

    /**
     * 正在审核
     */
    VERIFY(0, "审核中"),

    /**
     * 显示在首页
     */
    HOMEPAGE(3, "首页");

    private final int code;
    private final String msg;

    FBStatusEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
