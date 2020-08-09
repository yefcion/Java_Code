package http;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class HttpRequestSimuTest {

    @Test
    public void post() {
        JSONObject jsonObject1 = new JSONObject();
        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("deviceID", "110");
        jsonObject2.put("state", "0");
        jsonObject2.put("channel", "channel");
        jsonObject1.put("item", jsonObject2);
        jsonObject1.put("requestCommand", "control");
        String result = HttpRequestSimu.post(jsonObject1, "http://172.30.12.188:5003/test/hello");

        System.out.println(result);
    }

    @Test
    public void get() {
        String result = HttpRequestSimu.get("http://www.baidu.com");
        System.out.println(result);
    }

    @Test
    public void testGet() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("name",	"root");
        map.put("password", "123456");
        String result = HttpRequestSimu.get(map, "http://172.30.12.188:5003/test/hello");
        System.out.println(result);
    }
}
