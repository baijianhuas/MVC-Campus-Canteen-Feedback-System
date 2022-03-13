package campus.canteen.dto.feedback;


import campus.canteen.dto.user.User;
import campus.canteen.entity.feedback.FB;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
public class FBComment implements Serializable {

    private static final long serialVersionUID = 7217522025154588809L;

    // 评论id
    private int id;

    // 博文id
    private int blogId;

    // 评论者
    private User spokesman;

    // 被评论者（博文作者）
    private User listener;

    // 评论内容
    private String content;

    // 评论时间
    private Timestamp releaseDate;

    // 评论状态
    private String state;
}
