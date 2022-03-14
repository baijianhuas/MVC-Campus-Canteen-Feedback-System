package campus.canteen.service.user;

import campus.canteen.dto.user.UserDTO;
import campus.canteen.entity.user.UserAccount;
import campus.canteen.result.ResultBean;

public interface UserAccountService {
    /**
     * 新增账户
     *
     * @param userName 用户名
     * @param password 密码
     * @return 用户id
     */
    int insertAccount(String userName, String password);

    /**
     * 根据用户名或密码获取用户账户，可用于 登陆/注册 时校验用户
     *
     * @param userName 用户名
     * @param password 密码
     * @return 查询结果
     */
    UserAccount getAccount(String userName, String password);

    /**
     * 根据用户id获取用户账户
     *
     * @param userId 用户id
     * @return 查询结果
     */
    UserAccount getAccount(int userId);

    /**
     * 更新账户信息
     *
     * @param userId   用户id
     * @param newUserName 新用户名
     * @param newPassword 新密码
     */
    void updateAccount(int userId, String newUserName, String newPassword);

    /**
     * 获取用户信息
     *
     * @param feedbackId 博文id
     * @return 查询结果
     */
    ResultBean<UserDTO> getUserByFB(int feedbackId);

    /**
     * 获取用户信息
     *
     * @param userId 用户id
     * @return 查询结果
     */
    ResultBean<UserDTO> getUser(int userId);
}
