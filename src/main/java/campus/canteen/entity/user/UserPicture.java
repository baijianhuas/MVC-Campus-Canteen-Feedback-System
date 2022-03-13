package campus.canteen.entity.user;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
public class UserPicture implements Serializable {
    private static final long serialVersionUID = -7413640669767387180L;
    private Integer id;
    private Integer userId;
    private String desc;
    private Integer category;
    private String path;
    private String title;
    private Timestamp uploadDate;
}
