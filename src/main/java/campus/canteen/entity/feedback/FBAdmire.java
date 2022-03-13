package campus.canteen.entity.feedback;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
public class FBAdmire implements Serializable {
    private static final long serialVersionUID = 4120356662820230266L;
    private Integer id;
    private Integer feedbackId;
    private Integer paierId;
    private Integer earnerId;
    private Double money;
    private Timestamp tranDate;
}
