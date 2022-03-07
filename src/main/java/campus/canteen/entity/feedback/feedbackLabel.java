package campus.canteen.entity.feedback;

import lombok.Data;

@Data
public class feedbackLabel {
    private Integer id;
    private Integer userId;
    private String title;
    private java.sql.Timestamp createDate;
}
