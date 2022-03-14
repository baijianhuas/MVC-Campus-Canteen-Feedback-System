package campus.canteen.service.audience;

import campus.canteen.dto.feedback.FBCommentDTO;
import campus.canteen.dto.feedback.FBMainContentDTO;
import campus.canteen.dto.user.UserDTO;
import campus.canteen.entity.feedback.FBStatistics;
import campus.canteen.result.ResultBean;

import java.util.List;

public interface FBBrowseService {

    /**
     * 获得文章主体信息
     *
     * @param feedbackid
     * @return
     */
    ResultBean<FBMainContentDTO> getFBMainContent(int feedbackid);

    /**
     * 获取文章统计信息
     *
     * @param feedbackid
     * @return 查询结果
     */
    ResultBean<FBStatistics> getFBStatistics(int feedbackid);

    /**
     * 获取博主信息
     *
     * @param feedbackid 文章id
     * @return 查询结果
     */
    ResultBean<UserDTO> getUser(int feedbackid);

    /**
     * 获得文章评论列表
     *
     * @param feedbackid 文章id
     * @return 查询结果
     */
    ResultBean<List<FBCommentDTO>> listFBComment(int feedbackid);

    /**
     * 持久化评论记录，同时文章评论次数加一
     *
     * @param content     评论内容
     * @param spokesmanId 评论者id（只有已注册的博主才能发起评论）
     * @param listenerId  被评论者id
     * @param feedbackid          被评论文章id
     * @return 操作结果
     */
    ResultBean<Void> insertComment(String content, int spokesmanId, int listenerId, int feedbackid);

    /**
     * 文章被分享，分享次数加一
     *
     * @param feedbackid 文章id
     * @return 操作结果
     */
    ResultBean<Void> insertShareCountIncrement(int feedbackid);

    /**
     * 持久化赞赏记录，同时文章赞赏次数加一
     *
     * @param feedbackid       文章id
     * @param paierId  支付者feedbackid（若已登录则为登陆者feedbackid，为null则为未注册未登录的读者/游客）
     * @param earnerId 文章作者id
     * @param money    金额
     * @return 操作结果
     */
    ResultBean<Void> insertAdmire(int feedbackid, int paierId, int earnerId, float money);

    /**
     * 持久化文章收藏记录，同时文章收藏次数加一
     *
     * @param feedbackid 文章id
     * @param cllocterId 收藏者id
     * @param reason     收藏理由
     * @param categoryId 收藏到自己的哪一个类别之下
     * @return 执行结果
     */
    ResultBean<Void> insertCollect(int feedbackid, int cllocterId, String reason, int categoryId);

    /**
     * 投诉文章，同时投诉记录加一
     *
     * @param feedbackid           文章id
     * @param complainerId 投诉者id
     * @param reason       投诉理由
     * @return 执行结果
     */
    ResultBean<Void> insertComplain(int feedbackid, int complainerId, String reason);
}
