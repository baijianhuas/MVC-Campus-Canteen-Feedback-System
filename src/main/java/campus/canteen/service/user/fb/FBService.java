package campus.canteen.service.user.fb;

import campus.canteen.enums.FBStatusEnum;

public interface FBService {
    /**
     * 新增文章
     *
     * @param userId  用户id
     * @param categories 类别
     * @param labels     标签
     * @param status     状态
     * @param title      标题
     * @param content    内容
     * @param summary    摘要
     * @param keyWords   关键字
     * @return 新纪录id
     */
    int insertBlog(int userId, int[] categories, int[] labels, FBStatusEnum status,
                   String title, String content, String summary, String[] keyWords);

    void updateBlogCategory(int feedbackId,int[] newCategories);

    void updateBlogLabel(int feedbackId,int[] newCategories);

    void updateBlogContent(int feedbackId,String newContent);
}
