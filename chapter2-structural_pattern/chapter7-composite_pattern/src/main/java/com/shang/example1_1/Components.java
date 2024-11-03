package com.shang.example1_1;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: shang-design_mode
 * @description: 容器节点 可以包含子节点
 * @author: Shang
 * @create: 2024-10-31 16:08
 * @version: 1.0
 **/
public class Components extends Component{
    // 维护一个容器对象
    private List<Component> components = new ArrayList<>();
    @Override
    public void add(Component c) {
        components.add(c);
    }

    @Override
    public void remove(Component c) {
        components.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return (Component) components.get(i);
    }

    @Override
    public void operation() {
        //在树枝节点中的业务方法,将递归调用其他节点中的operation() 方法
        for (Component component : components) {
            component.operation();
        }
    }
}
