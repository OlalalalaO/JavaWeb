package _20210227_Junit.test;

import _20210227_Junit.Calculator;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/*
Junit:白盒测试
    1.定义一个测试类
        建议：
            测试类名：被测试的类名+test
            包名：xxxx.xxx.xx.test
    2.定义测试方法
        建议：
            方法名：test测试的方法名  testAdd()
            返回值：void
            参数：空餐
    3.给方法加注解@test
    4.导入依赖环境
判定结果：断言

 @before，在所有方法执行前，执行该方法，资源申请
 @after ，在所有方法执行后，执行改方法，资源释放


 */
public class CaculatorTest {
    /**
     * 测试add方法
     */
    @Test
    public void testAdd(){
        //1.创建计算器对象
        Calculator c = new Calculator();

        //2.调用add方法
        int result = c.add(1,2);
        int sub = c.sub(1,2);
        //3.断言
        assertEquals(3,result);
        assertEquals(-1,sub);
    }
}
