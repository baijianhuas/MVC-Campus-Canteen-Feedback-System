package campus.canteen.entity.user;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class feedbackPicture {
    private Integer id;
    private Integer userId;
    private String desc;
    private Integer category;
    private String path;
    private String title;
    private Timestamp uploadDate;
}
