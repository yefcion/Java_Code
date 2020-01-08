package practise;

import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * @author： xu.yefcion
 * @description：
 * @date： 2020/1/8 21:57
 */

public class JedisOpera {
    public static void main(String[] args) {
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");
        System.out.println("连接成功");
        //查看服务是否运行
        System.out.println("服务正在运行: " + jedis.ping());
    }

    /**
     * Redis Java String(字符串) 实例
     */
    public void JeString() {
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");
        //设置 redis 字符串数据
        jedis.set("runoobkey", "www.runoob.com");
        // 获取存储的数据并输出
        System.out.println("redis 存储的字符串为: " + jedis.get("runoobkey"));
    }

    /**
     * Redis Java List(列表) 实例
     */
    public void JeList() {
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");
        // 存储数据到列表中
        jedis.lpush("site-list", "yefcion.github.io");
        jedis.lpush("site-list", "google");
        jedis.lpush("site-list", "baidu");
        // 获取存储的数据并输出
        List<String> list = jedis.lrange("site-list", 0, 2);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("List sites are: " + list.get(i));
        }
    }

    /**
     * Redis Java Keys 实例
     */
    public void JeKeys() {
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");

        // 获取数据并输出
        Set<String> keys = jedis.keys("*");
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String key = it.next();
            System.out.println(key);
        }
    }
}
