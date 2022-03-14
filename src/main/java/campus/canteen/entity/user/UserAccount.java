package campus.canteen.entity.user;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
public class UserAccount implements Serializable {
    private static final long serialVersionUID = -7413640669767387180L;
    private Integer id;
    private String username;
    private String password;
    private String intro;
    private Timestamp registerDate;
}
