package campus.canteen.entity.feedback;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
public class FB implements Serializable {
    private static final long serialVersionUID = -4505057630620968435L;
    private Integer id;
    private Integer userId;
    private String categoryIds;
    private String labelIds;
    private Integer state;
    private String title;
    private String content;
    private String summary;
    private Timestamp releaseDate;
    private Timestamp nearestModifyDate;
    private String keyWords;
    private Integer wordCount;

}
