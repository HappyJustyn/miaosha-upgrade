package com.imooc.miaosha.result;

import lombok.Getter;

/**
 * code,msg封装类
 *
 * @author Justyn
 * @version 1.0
 * @date 2021/12/29 19:44
 */
@Getter
public class CodeMsg {
    private Integer code;
    private String msg;

    // 通用
    public static CodeMsg SUCCESS = new CodeMsg(0, "success");
    public static CodeMsg SERVER_ERROR = new CodeMsg(500100, "服务端异常");
    public static CodeMsg ARGS_ERROR = new CodeMsg(500101, "参数校验异常");


    // 登录模块 5002XX
    public static CodeMsg SESSION_ERROR = new CodeMsg(500210, "session不存在或已失效");
    public static CodeMsg PASSWORD_EMPTY = new CodeMsg(500211, "密码不能为空");
    public static CodeMsg MOBILE_EMPTY = new CodeMsg(500212, "手机号不能为空");
    public static CodeMsg MOBILE_ERROR = new CodeMsg(500213, "手机号格式错误");
    public static CodeMsg MOBILE_NOT_EXIST = new CodeMsg(500214, "手机号不存在");
    public static CodeMsg PASSWORD_ERROR = new CodeMsg(500215, "密码错误");


    // 商品模块 5003XX

    // 订单模块 5004XX
    public static CodeMsg ORDER_NOT_EXIST = new CodeMsg(500400, "订单不存在");


    // 秒杀模块 5005XX
    public static CodeMsg MIAOSHA_OVER = new CodeMsg(500500, "秒杀结束");
    public static CodeMsg REPEAT_MIAOSHA = new CodeMsg(500501, "不能重复秒杀");


    private CodeMsg(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
