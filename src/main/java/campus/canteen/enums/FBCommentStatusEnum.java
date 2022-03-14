package campus.canteen.enums;

import campus.canteen.entity.feedback.FB;

public enum FBCommentStatusEnum {
    VERIFY(0, "审核中");


    private final int code;
    private final String msg;

    FBCommentStatusEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
