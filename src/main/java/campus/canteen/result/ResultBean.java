package campus.canteen.result;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ResultBean<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 结果状态为成功
     */
    public static final int SUCCESS = 0;

    /**
     * 结果状态为失败
     */
    public static final int FAIL = 1;

    private int code = SUCCESS;
    private String msg = "success";

    private T data;

    public ResultBean(T data) {
        this.data = data;
    }

    public ResultBean(Throwable e) {
        this.msg = e.toString();
        this.code = FAIL;
    }


}
