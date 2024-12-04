package com.yupi.maker.generator;

import java.io.*;

/**
 * @author Ma Chao
 * @version 1.0
 * @date 2024-12-02 23:29
 */
public class JarGenerator {
    public static void doGenerate(String projectDir) throws IOException, InterruptedException {
        // 清理之前的构建并打包
        // 注意不同的操作系统，执行的命令不同
        String winMavenCommand = "mvn.cmd clean package -DskipTests=true";
        String mavenCommand = winMavenCommand;
        // 这里一定要拆分！
        ProcessBuilder processBuilder = new ProcessBuilder(mavenCommand.split(" "));
        processBuilder.directory(new File(projectDir));
        Process process = processBuilder.start();
        // 读取命令的输出
        InputStream inputStream = process.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        // 等待命令执行完成
        int exitCode = process.waitFor();
        System.out.println("命令执行完成，退出码：" + exitCode);
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        doGenerate("D:\\yuzi-generator\\yuzi-generator-maker\\generated\\acm-template-pro-generator");
    }
}
