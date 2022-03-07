package campus.canteen.entity.user;

import lombok.Data;

@Data
public class feedbackLink {
    private Integer id;
    private Integer userId;
    private Integer iconId;
    private String title;
    private String url;
    private String desc;
    private Integer priority;
}
