package com.yupi.maker.generator;

import cn.hutool.core.io.FileUtil;

import java.nio.charset.StandardCharsets;

/**
 * @author Ma Chao
 * @version 1.0
 * @date 2024-12-04 19:43
 */
public class ScriptGenerator {
    public static void doGenerate(String outputPath, String jarPath){
        // 直接写入脚本文件
        // 生成Windows脚本
        StringBuilder sb = new StringBuilder();
        sb.append("@echo off").append("\n");
        sb.append(String.format("java -jar %s %%*", jarPath)).append("\n");
        FileUtil.writeBytes(sb.toString().getBytes(StandardCharsets.UTF_8), outputPath + ".bat");
    }
}
