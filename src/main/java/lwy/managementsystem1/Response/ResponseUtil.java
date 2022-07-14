package lwy.managementsystem1.Response;

public class ResponseUtil {
    /**
     * 成功返回
     * @param object 返回数据
     * @return
     */
    public static ResponseEntity success(Object object){
        ResponseEntity resp = new ResponseEntity();
        resp.setCode(ResponseEnum.SUCCESS.getCode());
        resp.setMsg(ResponseEnum.SUCCESS.getMsg());
        resp.setData(object);
        return resp;
    }


    /**
     * 成功返回  无数据
     * @return
     */
    public static ResponseEntity success(){
        return success(null);
    }


    /**
     * 失败返回
     * @param responseEnum 响应标识
     * @return
     */
    public static ResponseEntity error(ResponseEnum responseEnum){
        ResponseEntity resp = new ResponseEntity();
        resp.setCode(responseEnum.getCode());
        resp.setMsg(responseEnum.getMsg());
        return resp;
    }

}
