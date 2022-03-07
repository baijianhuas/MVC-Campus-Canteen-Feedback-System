package campus.canteen.entity.feedback;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class feedbackCollect {
    private Integer id;
    private Integer feedbackId;
    private Integer userId;
    private String reason;
    private Timestamp collectDate;
}
