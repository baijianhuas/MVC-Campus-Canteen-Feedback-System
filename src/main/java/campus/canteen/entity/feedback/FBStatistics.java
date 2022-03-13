package campus.canteen.entity.feedback;

import lombok.Data;

import java.io.Serializable;

@Data
public class FBStatistics implements Serializable {
    private static final long serialVersionUID = -7413640669767387180L;
    private Integer id;
    private Integer commentCount;
    private Integer viewCount;
    private Integer replyCommentCount;
    private Integer collectCount;
    private Integer complainCount;
    private Integer shareCount;
    private Integer admireCount;
    private Integer likeCount;
}
