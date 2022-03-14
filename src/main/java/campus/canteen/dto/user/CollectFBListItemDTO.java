package campus.canteen.dto.user;

import campus.canteen.dto.feedback.FBMainContentDTO;

import java.io.Serializable;
import java.sql.Timestamp;

public class CollectFBListItemDTO implements Serializable {
    private static final long serialVersionUID = 1348316821909506029L;
    private int id;
    private FBMainContentDTO feedback;
    private UserDTO user;
    private UserDTO authorId;
    private String reason;
    private Timestamp collectDate;
    private int categoryId;
}
