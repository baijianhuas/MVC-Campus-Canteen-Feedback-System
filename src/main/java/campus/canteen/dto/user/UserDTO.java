package campus.canteen.dto.user;

import campus.canteen.entity.user.UserPicture;
import campus.canteen.entity.user.UserProfile;

import java.io.Serializable;
import java.sql.Timestamp;

public class UserDTO implements Serializable {
    private static final long serialVersionUID = 4552057430001933904L;
    private int id;
    private UserProfile profileId;
    private UserPicture avatar;
    private String username;
    private String password;
    private Timestamp registerDate;
}
