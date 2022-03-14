package campus.canteen.dto.user;

import java.io.Serializable;

public class UserStatisticsDTO implements Serializable {
    private static final long serialVersionUID = 7340323568288854227L;
    private int feedbackCount;
    private long wordCount;
    private long likedCount;
    private int categoryCount;
    private int labelCount;
    private int collectCount;
    private int collectedCount;
}
