package campus.canteen.service.user.profile;

import campus.canteen.dto.user.UserLinkDTO;
import campus.canteen.entity.user.UserLink;
import campus.canteen.result.ResultBean;

import java.util.List;

public interface LinkService {
    /**
     * 获取友情链接，自动按优先级从高到底排序
     *
     * @param userId 用户id
     * @param offset    结果集起始位置
     * @param rows      行数
     * @return 查询结果
     */
    ResultBean<List<UserLinkDTO>> listUserLink(int userId, int offset, int rows);

    /**
     * 新增友情链接
     *
     * @param userId 用户id
     * @param iconId    图标id
     * @param title     名字
     * @param url       url
     * @param desc      描述
     * @param priority  优先级
     * @return 新纪录id
     */
    int insertUserLink(int userId, int iconId, String title, String url, String desc, int priority);

    /**
     * 删除链接
     *
     * @param linkId 链接id
     * @return 删除的记录
     */
    UserLink deleteUserLink(int linkId);

    /**
     * 更新链接
     *
     * @param linkId       链接id
     * @param newUserId 新的用户（链接所属用户），不改变传 -1
     * @param newIconId    新的图片id，不改变传 -1
     * @param newTitle     新的标题，不改变传 null
     * @param newUrl       新的url，不改变传 null
     * @param newDesc      新的描述，不改变传 null
     * @param newPriority  新的优先级，不改变传 -1
     */
    void updateUserLink(int linkId, int newUserId, int newIconId, String newTitle,
                           String newUrl, String newDesc, int newPriority);
}
