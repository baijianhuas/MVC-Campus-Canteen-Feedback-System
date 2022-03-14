package campus.canteen.service.user.profile;

import campus.canteen.dto.user.CollectFBListItemDTO;
import campus.canteen.entity.feedback.FBCollect;
import campus.canteen.manager.FBSortRule;
import campus.canteen.result.ResultBean;

import java.util.List;

public interface CollectFBService {
    /**
     * 获得博主收藏的博文清单
     *
     * @param userId  博主id
     * @param categoryId 收藏到的类别
     * @param offset     结果集起始位置
     * @param rows       行数
     * @param sortRule   排序规则，为null则不做约束
     * @return 查询结果
     */
    ResultBean<List<CollectFBListItemDTO>> listCollectFB(int userId, int categoryId,
                                                         int offset, int rows, FBSortRule sortRule);

    /**
     * 新增收藏文章
     *
     * @param userId  收藏者id
     * @param feedbackId     博文id
     * @param categoryId 收藏到自己的哪一个类别之下
     * @param authorId   作者id
     * @param reason     收藏理由
     * @return 执行结果，新增记录id
     */
    ResultBean<Integer> insertCollectFB(int userId, int feedbackId, int categoryId, int authorId, String reason);

    /**
     * 取消收藏
     *
     * @param feedbackId 博文id
     * @return 收藏记录
     */
    FBCollect deleteCollectFB(int feedbackId);

    /**
     * 更新收藏博文所在类别
     *
     * @param feedbackId        收藏博文id
     * @param newCategoryId 新的类别
     */
    void updateCollectFBCategory(int feedbackId, int newCategoryId);
}
