package campus.canteen.entity.feedback;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class feedback {
    //id
    private Integer id;

    //所属id
    private Integer userId;

    //所属类别id
    private String categoryIds;

    //包含的标签
    private String labelIds;

    //文章状态
    private Integer state;

    //标题
    private String title;

    //主体内容
    private String content;

    //摘要
    private String summary;

    //首次发布日期
    private Timestamp releaseDate;

    //最后一次修改时间
    private Timestamp nearestModifyDate;

    //关键字
    private String keyWords;

    //评论次数
    private Integer commentCount;

    //浏览次数
    private Integer viewCount;

    //回复该评论的次数
    private Integer replyCommentCount;

    //被收藏次数
    private Integer collectCount;

    //举报次数
    private Integer complainCount;

    //被分享次数
    private Integer shareCount;

    //赞赏次数
    private Integer admireCount;

}
