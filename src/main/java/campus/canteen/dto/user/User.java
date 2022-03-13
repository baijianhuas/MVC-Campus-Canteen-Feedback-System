package campus.canteen.dto.user;

import campus.canteen.entity.user.UserPicture;
import campus.canteen.entity.user.UserProfile;

import java.io.Serializable;
import java.sql.Timestamp;

public class User implements Serializable {

    private static final long serialVersionUID = 4552057430001933904L;

    //id
    private int id;

    //个人资料
    private UserProfile profileId;

    //头像（需要单独从相册中查询）
    private UserPicture avatar;

    //用户名
    private String username;

    //密码
    private String password;

    //注册时间
    private Timestamp registerDate;

}
