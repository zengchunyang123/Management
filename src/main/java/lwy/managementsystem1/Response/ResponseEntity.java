package lwy.managementsystem1.Response;

import java.io.Serializable;

public class ResponseEntity<T> implements Serializable {
    private static final long serialVersionUID = 3595741978061989861L;
    private Integer code;//状态码
    private String msg;//状态码对应信息
    private T data;//要返回的数据


    public Integer getCode() {
        return code;
    }


    public void setCode(Integer code) {
        this.code = code;
    }


    public String getMsg() {
        return msg;
    }


    public void setMsg(String msg) {
        this.msg = msg;
    }


    public T getData() {
        return data;
    }


    public void setData(T data) {
        this.data = data;
    }

}
