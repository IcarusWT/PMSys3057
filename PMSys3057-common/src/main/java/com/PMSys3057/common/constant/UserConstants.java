package com.PMSys3057.common.constant;

// 用户常量信息
public class UserConstants
{
    public static final String NORMAL = "0";                // 正常状态
    public static final String EXCEPTION = "1";             // 异常状态
    public static final String USER_BLOCKED = "1";          // 用户封禁状态
    public static final String ROLE_BLOCKED = "1";          // 角色封禁状态
    public static final String DEPT_NORMAL = "0";           // 部门正常状态

    public static final int USERNAME_MIN_LENGTH = 2;        // 用户名最小长度
    public static final int USERNAME_MAX_LENGTH = 20;       // 用户名最大长度

    public final static String USER_NAME_UNIQUE = "0";      // 登录名称唯一时候的返回码
    public final static String USER_NAME_NOT_UNIQUE = "1";  // 登录名称不唯一时的返回码

    public final static String USER_PHONE_UNIQUE = "0";     // 手机号唯一时候的返回码
    public final static String USER_PHONE_NOT_UNIQUE = "1"; // 手机号不唯一时候的返回码

    public final static String USER_EMAIL_UNIQUE = "0";     // email唯一时候的返回码
    public final static String USER_EMAIL_NOT_UNIQUE = "1"; // email不唯一时候的返回码

    public final static String DEPT_NAME_UNIQUE = "0";      // 部门名称唯一时返回结果码
    public final static String DEPT_NAME_NOT_UNIQUE = "1";  // 部门名称不唯一时返回结果码

    public final static String ROLE_NAME_UNIQUE = "0";      // 角色名称唯一时返回结果码
    public final static String ROLE_NAME_NOT_UNIQUE = "1";  // 角色名称不唯一时返回结果码

    public final static String POST_NAME_UNIQUE = "0";      // 岗位名称唯一时返回结果码
    public final static String POST_NAME_NOT_UNIQUE = "1";  // 岗位名称不唯一时返回结果码

    public final static String ROLE_KEY_UNIQUE = "0";       // 角色权限唯一时返回结果码
    public final static String ROLE_KEY_NOT_UNIQUE = "1";   // 角色权限不唯一时返回结果码

    public final static String POST_CODE_UNIQUE = "0";      // 岗位编码唯一时返回结果码
    public final static String POST_CODE_NOT_UNIQUE = "1";  // 岗位编码不唯一时返回结果码

    public final static String MENU_NAME_UNIQUE = "0";      // 菜单名称唯一时返回结果码
    public final static String MENU_NAME_NOT_UNIQUE = "1";  // 菜单名称不唯一时返回结果码

    public final static String DICT_TYPE_UNIQUE = "0";      // 字典类型唯一时返回结果码
    public final static String DICT_TYPE_NOT_UNIQUE = "1";  // 字典类型不唯一时返回结果码

    public final static String CONFIG_KEY_UNIQUE = "0";     // 参数键名唯一时返回结果码
    public final static String CONFIG_KEY_NOT_UNIQUE = "1"; // 参数键名不唯一时返回结果码

    public static final int PASSWORD_MIN_LENGTH = 5;        // 最短密码长度
    public static final int PASSWORD_MAX_LENGTH = 20;       // 最长密码长度

    public static final String MOBILE_PHONE_NUMBER_PATTERN = "^0{0,1}(13[0-9]|15[0-9]|14[0-9]|18[0-9])[0-9]{8}$";       // 手机号码格式限制

    // 邮箱格式限制
    public static final String EMAIL_PATTERN = "^((([a-z]|\\d|[!#\\$%&'\\*\\+\\-\\/=\\?\\^_`{\\|}~]|[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])+" +
            "(\\.([a-z]|\\d|[!#\\$%&'\\*\\+\\-\\/=\\?\\^_`{\\|}~]|[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])+)*)|" +
            "((\\x22)((((\\x20|\\x09)*(\\x0d\\x0a))?(\\x20|\\x09)+)?(([\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x7f]|\\x21|[\\x23-\\x5b]|[\\x5d-\\x7e]|" +
            "[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])|(\\\\([\\x01-\\x09\\x0b\\x0c\\x0d-\\x7f]|" +
            "[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF]))))*(((\\x20|\\x09)*(\\x0d\\x0a))?(\\x20|\\x09)+)?(\\x22)))@" +
            "((([a-z]|\\d|[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])|" +
            "(([a-z]|\\d|[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])([a-z]|\\d|-|\\.|_|~|[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])*([a-z]|\\d|[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])))\\.)+" +
            "(([a-z]|[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])|(([a-z]|[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])([a-z]|\\d|-|\\.|_|~|" +
            "[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])*([a-z]|[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])))\\.?";
}
