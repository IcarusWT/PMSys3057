package com.PMSys3057.common.constant;

// 任务调度通用常量
public interface ScheduleConstants
{
    public static final String TASK_CLASS_NAME = "__TASK_CLASS_NAME__";
    public static final String TASK_PROPERTIES = "__TASK_PROPERTIES__";
    public static final String MISFIRE_DEFAULT = "0";           // 默认
    public static final String MISFIRE_IGNORE_MISFIRES = "1";   // 立即触发执行
    public static final String MISFIRE_FIRE_AND_PROCEED = "2";  // 触发一次执行
    public static final String MISFIRE_DO_NOTHING = "3";        // 不触发立即执行

    public enum Status
    {
        NORMAL("0"),        // 正常
        PAUSE("1");         // 暂停

        private String value;

        private Status(String value)
        {
            this.value = value;
        }

        public String getValue()
        {
            return value;
        }
    }
}
