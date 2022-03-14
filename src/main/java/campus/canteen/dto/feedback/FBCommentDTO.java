package campus.canteen.dto.feedback;


import campus.canteen.dto.user.UserDTO;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
public class FBCommentDTO implements Serializable {
    private static final long serialVersionUID = 7217522025154588809L;
    private int id;
    private int blogId;
    private UserDTO spokesman;
    private UserDTO listener;
    private String content;
    private Timestamp releaseDate;
    private String state;
}
