package com.shang.example2_1;

/**
 * @program: shang-design_mode
 * @description: 客户端
 * @author: Shang
 * @create: 2024-10-31 19:50
 * @version: 1.0
 **/
public class Client {
    public static void main(String[] args) {
        // root下面有三个文件夹 bin lib tem
        Directory rootDir = new Directory("root");

        // bin 有两个文件 app.properties mode.bd
        Directory binDir = new Directory("bin");
        File app = new File("app.properties",5718);
        binDir.addEntry(app);
        binDir.addEntry(new File("mode.bd",79011));

        // 下面有一个文件夹spring spring下面有三个文件 mvc.xml boot.xml security.xml
        Directory libDir = new Directory("lib");
        Directory spring = new Directory("spring");
        spring.addEntry(new File("mvc.xml",415));
        spring.addEntry(new File("boot.xml",3413));
        spring.addEntry(new File("security.xml",65));

        libDir.addEntry(spring);

        // 下面什么都没有
        Directory temDir = new Directory("tem");

        // 在root下面添加文件夹
        rootDir.addEntry(binDir);
        rootDir.addEntry(libDir);
        rootDir.addEntry(temDir);

        // 测试删除无文件的文件夹
        // rootDir.removeEntry(temDir);

        // 测试删除有文件的文件夹
        // rootDir.removeEntry(binDir);

        // 测试删除文件
        // binDir.removeEntry(app);
        app.removeEntry(app); // 该删除只是将文件内容删除 但是文件夹中还包含该文件的样子

        // 打印文件 这个prefix为File的打印带去了文件夹前缀（文件前面可能会有文件夹）
        // 也为Directory带去了前缀（文件夹前面也有文件夹） 传入的""起一个字符串拼接的作用
        rootDir.printEntry("");



    }
}
