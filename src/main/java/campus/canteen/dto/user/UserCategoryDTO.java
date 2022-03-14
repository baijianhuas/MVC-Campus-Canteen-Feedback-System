package campus.canteen.dto.user;

import campus.canteen.entity.user.UserPicture;

import java.sql.Timestamp;

public class UserCategoryDTO {
    private static final long serialVersionUID = -7413640669767387180L;
    private int id;
    private int userId;
    private String title;
    private String desc;
    private Timestamp createDate;
    private UserPicture icon;
}
