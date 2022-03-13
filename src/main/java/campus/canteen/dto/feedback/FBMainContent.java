package campus.canteen.dto.feedback;

import campus.canteen.entity.feedback.FBCategory;
import campus.canteen.entity.feedback.FBLabel;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
public class FBMainContent implements Serializable {

    private static final long serialVersionUID = -9215772012725472707L;

    //博文id
    private int id;

    //博文所属类别
    private FBCategory[] categories;

    //博文包含的标签
    private FBLabel[] labels;

    //博文标题
    private String title;

    //博文主体内容
    private String content;

    //博文摘要
    private String summary;

    //博文关键字
    private String[] keyWords;

    //首次发布日期
    private Timestamp releaseDate;

    //最后一次修改时间
    private Timestamp nearestModifyDate;

    //文章状态
    private String state;

    //总字数
    private int wordCount;
}
