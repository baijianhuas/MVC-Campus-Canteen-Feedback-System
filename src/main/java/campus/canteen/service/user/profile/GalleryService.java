package campus.canteen.service.user.profile;

import campus.canteen.entity.user.UserPicture;
import campus.canteen.enums.UserPictureCategoryEnum;

public interface GalleryService {
    /**
     * 新增图片
     *
     * @param userId 用户id
     * @param desc      图片描述
     * @param category  图片所属类别
     * @param title     名字
     * @return 新纪录id
     */
    int insertPicture(int userId, String desc, UserPictureCategoryEnum category, String title);

    /**
     * 删除图片记录
     *
     * @param pictureId    图片id
     * @param deleteOnDisk 是否同时从存储设备中删除
     * @return 被删除的图片记录
     */
    UserPicture deletePicture(int pictureId, boolean deleteOnDisk);

    /**
     * 更新图片种类
     *
     * @param pictureId   图片id
     * @param newCategory 新的类别
     */
    void updatePictureCategory(int pictureId, UserPictureCategoryEnum newCategory);

    /**
     * 获得图片
     *
     * @param pictureId 图片id
     * @return 查询结果
     */
    UserPicture getPicture(int pictureId);
}
