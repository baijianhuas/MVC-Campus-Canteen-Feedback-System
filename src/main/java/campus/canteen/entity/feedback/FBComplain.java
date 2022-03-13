package campus.canteen.entity.feedback;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
public class FBComplain implements Serializable {
    private static final long serialVersionUID = -7413640669767387180L;
    private Integer id;
    private Integer blogId;
    private Integer complainerId;
    private String content;
    private Timestamp time;
}
