package campus.canteen.entity.feedback;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
public class FBComment implements Serializable {
    private static final long serialVersionUID = -7413640669767387180L;
    private Integer id;
    private Integer feedbackId;
    private Integer spokesmanId;
    private Integer listenerId;
    private String content;
    private Timestamp releaseDate;
    private Integer state;
}
