package org.computer;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        long seed = 12345L;
        Random random1 = new Random(seed);
        Random random2 = new Random(seed);

        // 打印两个随机数生成器的相同种子生成的随机数
        System.out.println(random1.nextInt(1000));
        System.out.println(random2.nextInt(1000));
        System.out.println(random1.nextDouble());
        System.out.println(random2.nextDouble());
    }
}
