package campus.canteen.service.audience;

import campus.canteen.dto.feedback.FBComment;
import campus.canteen.dto.feedback.FBMainContent;
import campus.canteen.dto.user.User;
import campus.canteen.entity.feedback.FB;
import campus.canteen.entity.feedback.FBStatistics;
import campus.canteen.result.ResultBean;

import java.util.List;

public class FBBrowseService {

    /**
     * 获得文章主体信息
     *
     * @param feedbackid
     * @return
     */
    ResultBean<FBMainContent> getFBMainContent(int feedbackid) {
        return null;
    }

    /**
     * 获取文章统计信息
     *
     * @param feedbackid
     * @return 查询结果
     */
    ResultBean<FBStatistics> getFBStatistics(int feedbackid) {
        return null;
    }

    /**
     * 获取博主信息
     *
     * @param feedbackid 文章id
     * @return 查询结果
     */
    ResultBean<User> getUser(int feedbackid) {
        return null;
    }

    /**
     * 获得文章评论列表
     *
     * @param feedbackid 文章id
     * @return 查询结果
     */
    ResultBean<List<FBComment>> listFBComment(int feedbackid) {
        return null;
    }

    /**
     * 持久化评论记录，同时文章评论次数加一
     *
     * @param content     评论内容
     * @param spokesmanId 评论者id（只有已注册的博主才能发起评论）
     * @param listenerId  被评论者id
     * @param feedbackid          被评论文章id
     * @return 操作结果
     */
    ResultBean<Void> insertComment(String content, int spokesmanId, int listenerId, int feedbackid) {
        return null;
    }

    /**
     * 文章被分享，分享次数加一
     *
     * @param feedbackid 文章id
     * @return 操作结果
     */
    ResultBean<Void> insertShareCountIncrement(int feedbackid) {
        return null;
    }

    /**
     * 持久化赞赏记录，同时文章赞赏次数加一
     *
     * @param feedbackid       文章id
     * @param paierId  支付者feedbackid（若已登录则为登陆者feedbackid，为null则为未注册未登录的读者/游客）
     * @param earnerId 文章作者id
     * @param money    金额
     * @return 操作结果
     */
    ResultBean<Void> insertAdmire(int feedbackid, int paierId, int earnerId, float money) {
        return null;
    }

    /**
     * 持久化文章收藏记录，同时文章收藏次数加一
     *
     * @param feedbackid 文章id
     * @param cllocterId 收藏者id
     * @param reason     收藏理由
     * @param categoryId 收藏到自己的哪一个类别之下
     * @return 执行结果
     */
    ResultBean<Void> insertCollect(int feedbackid, int cllocterId, String reason, int categoryId) {
        return null;
    }

    /**
     * 投诉文章，同时投诉记录加一
     *
     * @param feedbackid           文章id
     * @param complainerId 投诉者id
     * @param reason       投诉理由
     * @return 执行结果
     */
    ResultBean<Void> insertComplain(int feedbackid, int complainerId, String reason) {
        return null;
    }
}
