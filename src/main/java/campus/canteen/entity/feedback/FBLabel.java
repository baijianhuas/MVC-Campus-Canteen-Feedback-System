package campus.canteen.entity.feedback;

import lombok.Data;

import java.io.Serializable;

@Data
public class FBLabel implements Serializable {
    private static final long serialVersionUID = -7413640669767387180L;
    private Integer id;
    private Integer userId;
    private String title;
    private java.sql.Timestamp createDate;
}
