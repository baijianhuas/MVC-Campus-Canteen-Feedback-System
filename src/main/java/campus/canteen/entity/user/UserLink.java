package campus.canteen.entity.user;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserLink implements Serializable {
    private static final long serialVersionUID = -7413640669767387180L;
    private Integer id;
    private Integer userId;
    private Integer iconId;
    private String title;
    private String url;
    private String desc;
    private Integer priority;
}
