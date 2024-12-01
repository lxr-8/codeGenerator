package com.yupi;

import com.yupi.cli.CommandExecutor;

/**
 * @author Ma Chao
 * @version 1.0
 * @date 2024-11-28 17:12
 */// 按两次 Shift 打开“随处搜索”对话框并输入 `show whitespaces`，
// 然后按 Enter 键。现在，您可以在代码中看到空格字符。
public class Main {
    public static void main(String[] args) {
        CommandExecutor commandExecutor = new CommandExecutor();
        commandExecutor.doExecute(args);
    }
}