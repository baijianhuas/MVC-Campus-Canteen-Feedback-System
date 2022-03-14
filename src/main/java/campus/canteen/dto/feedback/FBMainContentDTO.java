package campus.canteen.dto.feedback;

import campus.canteen.entity.feedback.FBCategory;
import campus.canteen.entity.feedback.FBLabel;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
public class FBMainContentDTO implements Serializable {
    private static final long serialVersionUID = -9215772012725472707L;
    private int id;
    private FBCategory[] categories;
    private FBLabel[] labels;
    private String title;
    private String content;
    private String summary;
    private String[] keyWords;
    private Timestamp releaseDate;
    private Timestamp nearestModifyDate;
    private String state;
    private int wordCount;
}
