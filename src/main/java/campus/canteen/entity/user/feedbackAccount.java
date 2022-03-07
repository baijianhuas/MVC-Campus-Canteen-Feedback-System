package campus.canteen.entity.user;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class feedbackAccount {
    private Integer id;
    private Integer profileId;
    private String username;
    private String password;
    private String intro;
    private Timestamp registerDate;
}
