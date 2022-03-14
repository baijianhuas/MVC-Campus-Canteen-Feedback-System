package campus.canteen.BAI.feed;

import campus.canteen.BAI.BaseFB;
import campus.canteen.entity.feedback.FB;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public abstract interface BaiFB extends BaseFB<FB> {
    public List<FB> listFB(@Param("userId") int userId,
                           @Param("status") int status) ;

    public List<FB> listFBWithLimit(@Param("userId") int userId,
                                    @Param("status") int status,
                                    @Param("offset") int offset,
                                    @Param("rows") int rows) ;

    public List<FB> listAll() ;

}
