package com.shang.example1_1;

/**
 * @program: shang-design_mode
 * @description: 叶子结点再无子节点
 * @author: Shang
 * @create: 2024-10-31 16:07
 * @version: 1.0
 **/
public class Leaf extends Component{
    @Override
    public void add(Component c) {

    }

    @Override
    public void remove(Component c) {

    }

    @Override
    public Component getChild(int i) {
        return new Leaf();
    }

    @Override
    public void operation() {

    }
}
