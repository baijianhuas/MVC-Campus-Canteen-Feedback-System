package campus.canteen.entity.feedback;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class feedbackComment {
    private Integer id;
    private Integer feedbackId;
    private Integer spokesmanId;
    private Integer listenerId;
    private String content;
    private Timestamp releaseDate;
    private Integer state;
}
