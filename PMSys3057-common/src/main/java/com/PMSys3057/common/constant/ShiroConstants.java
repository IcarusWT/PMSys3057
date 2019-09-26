package com.PMSys3057.common.constant;

// Shiro通用常量
public interface ShiroConstants
{
    public static final String CURRENT_USER = "currentUser";         // 当前登录的用户
    public static final String CURRENT_USERNAME = "username";        // 用户名
    public static String MESSAGE = "message";                        // 消息key
    public static String ERROR = "errorMsg";                         // 错误key
    public static String ENCODING = "UTF-8";                         // 编码格式
    public String ONLINE_SESSION = "online_session";                 // 当前在线会话

    public static final String CURRENT_CAPTCHA = "captcha";          // 验证码key
    public static final String CURRENT_ENABLED = "captchaEnabled";   // 验证码开关
    public static final String CURRENT_TYPE = "captchaType";         // 验证码类型
    public static final String CURRENT_VALIDATECODE = "validateCode";// 验证码
    public static final String CAPTCHA_ERROR = "captchaError";       // 验证码错误
}
