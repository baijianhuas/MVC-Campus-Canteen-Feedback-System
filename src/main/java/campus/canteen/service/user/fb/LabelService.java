package campus.canteen.service.user.fb;

import campus.canteen.entity.feedback.FBLabel;
import campus.canteen.result.ResultBean;

public interface LabelService {
    /**
     * 新增标签
     *
     * @param userId 标签创建者（用户）id
     * @param title     标签名
     * @return 新纪录id
     */
    int insertLabel(int userId, String title);

    /**
     * 修改标签
     *
     * @param labelId      标签id
     * @param newUserId 新的标签所有者
     * @param newTitle     新标签名
     */
    void updateLabel(int labelId, int newUserId, String newTitle);

    /**
     * 删除标签
     *
     * @param labelId 标签id
     * @return 被删除的记录
     */
    FBLabel deleteLabel(int labelId);

    /**
     * 获得用户创建的所有标签
     *
     * @param userId 用户id
     * @return 查询结果
     */
    ResultBean<FBLabel> listLabel(int userId);
}
