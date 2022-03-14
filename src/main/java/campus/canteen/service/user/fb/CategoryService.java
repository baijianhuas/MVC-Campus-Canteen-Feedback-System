package campus.canteen.service.user.fb;

import campus.canteen.dto.user.UserCategoryDTO;
import campus.canteen.result.ResultBean;

import java.util.List;

public interface CategoryService {
    /**
     * 获取用户创建的博文类别，按时间倒序排序
     *
     * @param userId 用户id
     * @param offset    结果集起始位置
     * @param rows      行数
     * @return 查询结果
     */
    ResultBean<List<UserCategoryDTO>> listBlogCategory(int userId, int offset, int rows);

    /**
     * 修改类别
     *
     * @param categoryId   类别id
     * @param newUserId 新的类别所属用户，不修改传 -1
     * @param newTitle     新标题，不修改传 null
     * @param newDesc      新描述，不修改传 null
     */
    void updateBlogCategory(int categoryId, int newUserId, String newTitle, String newDesc);

    /**
     * 新增博文类别
     *
     * @param userId 类别所属用户id
     * @param title     标题
     * @param desc      描述
     * @return 新纪录id
     */
    int insertBlogCategory(int userId, String title, String desc);

    /**
     * 删除类别，同时删除类别下的所有博文
     *
     * @param userId  用户id
     * @param categoryId 类别id
     */
    void deleteCategoryAndBlogsAsWell(int userId, int categoryId);

    /**
     * 删除类别，同时移动类别下所有文章到新的类别中
     *
     * @param userId     用户id
     * @param categoryId    要删除的类别
     * @param newBloggerId  新的类别创建者（用户）id
     * @param newCategoryId 新的类别（新类别创建者创建的类别）
     */
    void deleteCategoryAndMoveBlogsTo(int userId, int categoryId, int newBloggerId, int newCategoryId);

}
