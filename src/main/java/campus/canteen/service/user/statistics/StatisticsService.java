package campus.canteen.service.user.statistics;

import campus.canteen.dto.user.UserStatisticsDTO;
import campus.canteen.result.ResultBean;

public interface StatisticsService {
    /**
     * 获取博主统计信息
     *
     * @param userId 博主id
     * @return 查询结果
     */
    ResultBean<UserStatisticsDTO> getUserStatistics(int userId);
}
