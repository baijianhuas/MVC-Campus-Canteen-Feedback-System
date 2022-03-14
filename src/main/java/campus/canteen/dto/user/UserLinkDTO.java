package campus.canteen.dto.user;

import campus.canteen.entity.user.UserPicture;

import java.io.Serializable;

public class UserLinkDTO implements Serializable {
    private static final long serialVersionUID = -558005429949054040L;
    private int id;
    private int userId;
    private UserPicture icon;
    private String title;
    private String url;
    private String desc;
    private int priority;
}
