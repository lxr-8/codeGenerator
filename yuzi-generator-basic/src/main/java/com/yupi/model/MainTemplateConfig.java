package com.yupi.model;

import lombok.Data;

/**
 * @author Ma Chao
 * @version 1.0
 * @date 2024-11-30 16:37
 * 动态模版配置
 */
@Data
public class MainTemplateConfig {
    /**
     * 是否生成循环
     */
    private Boolean loop;
    /**
     * 作者注释
     */
    private String author = "yupi";
    /**
     * 输出信息
     */
    private String outputText = "sum = ";
}
