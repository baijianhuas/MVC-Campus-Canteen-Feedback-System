package campus.canteen.entity.feedback;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
public class FBCategory implements Serializable {
    private static final long serialVersionUID = -7413640669767387180L;
    private Integer id;
    private Integer userId;
    private String title;
    private String desc;
    private Timestamp createDate;
}
