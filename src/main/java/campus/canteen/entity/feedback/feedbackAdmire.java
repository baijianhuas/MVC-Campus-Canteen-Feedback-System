package campus.canteen.entity.feedback;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class feedbackAdmire {
    private Integer id;
    private Integer feedbackId;
    private Integer paierId;
    private Integer earnerId;
    private Double money;
    private Timestamp tranDate;
}
