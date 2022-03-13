package campus.canteen.entity.user;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserProfile implements Serializable {
    private static final long serialVersionUID = -7413640669767387180L;
    private Integer id;
    private String phone;
    private String email;
    private String aboutMe;
}
