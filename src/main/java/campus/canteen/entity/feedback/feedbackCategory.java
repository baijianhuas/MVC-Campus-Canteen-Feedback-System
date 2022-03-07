package campus.canteen.entity.feedback;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class feedbackCategory {
    private Integer id;
    private Integer userId;
    private String title;
    private String desc;
    private Timestamp createDate;
}
