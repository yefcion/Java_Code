package tools;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import data.controller.ErrorTypeMe;
import data.controller.User;
import org.junit.Test;

import java.util.List;


/**
 * @author： xu.yefcion
 * @description： JSON 格式转换
 * @date： 2019/11/29 23:49
 */
public class JsonConvert {
    /**
     * FastJson对于json格式字符串的解析主要用到了一下三个类
     * （1）JSON：fastJson的解析器，用于JSON格式字符串与JSON对象及javaBean之间的转换。
     * （2）JSONObject：fastJson提供的json对象。
     * （3）JSONArray：fastJson提供json数组对象。
     */

    /**
     * java 对象转 json 字符串
     */
    public static void bean2json() {
        User user = new User();
        user.setAction("eat");
        user.setId("16");
        user.setOrdinal(100L);
        user.setParent("parents");

        String json = JSON.toJSONString(user);
        System.out.println(json);
    }

    /**
     * json 字符串转 java 对象
     */
    public static void json2bean() {
        String json = "{\"action\":\"eat\",\"id\":\"16\",\"ordinal\":100,\"parent\":\"parents\"}";
        JSONObject jsonObject = JSON.parseObject(json);
        // 这里的感觉像 map
        String action = jsonObject.getString("action");
        System.out.println(action);
    }

    /**
     * 复杂 json 格式字符串与 JSONObject 之间的转换
     * 多层嵌套 json
     */
    public static void json2beanComplex() {
        String str = "{\"meta\":{\"code\":\"0\",\"message\":\"同步成功!\"},\"data\":{\"orderno\":\"U_2018062790915774\",\"suborderno\":\"SUB_2018062797348039\",\"type\":\"organunit\",\"result\":{\"organunit\":{\"totalCount\":2,\"successCount\":0,\"failCount\":2,\"errors\":[{\"code\":\"UUM70004\",\"message\":\"组织单元名称不能为空\",\"data\":{\"id\":\"254\",\"suborderNo\":\"SUB_2018062797348039\",\"organUnitType\":\"部门\",\"action\":\"add\",\"parent\":\"10000\",\"ordinal\":0,\"organUnitFullName\":\"组织单元全称\"},\"success\":false},{\"code\":\"UUM70004\",\"message\":\"组织单元名称不能为空\",\"data\":{\"id\":\"255\",\"suborderNo\":\"SUB_2018062797348039\",\"organUnitType\":\"部门\",\"action\":\"add\",\"parent\":\"10000\",\"ordinal\":0,\"organUnitFullName\":\"组织单元全称\"},\"success\":false}]},\"role\":{\"totalCount\":0,\"successCount\":0,\"failCount\":0,\"errors\":[]},\"user\":{\"totalCount\":0,\"successCount\":0,\"failCount\":0,\"errors\":[]}}}}";
        JSONObject jsonObject = JSON.parseObject(str);
        JSONObject meta = jsonObject.getJSONObject("meta");
        String code = meta.getString("code");
        System.out.println(code);

        JSONObject data = jsonObject.getJSONObject("data");
        JSONObject result = data.getJSONObject("result");
        JSONObject organunit = result.getJSONObject("organunit");

        JSONArray errorArr = organunit.getJSONArray("errors");
        List<ErrorTypeMe> errorList = JSON.parseObject(errorArr.toJSONString(), new TypeReference<List<ErrorTypeMe>>() {
        });
        System.out.println(errorArr);
        System.out.println(errorList);
    }

    /**
     * json 字符串转 java 简单对象
     */
    public static void jsonStrToJavaBean() {
        String jsonStr = "{\"action\":\"add\",\"id\":\"1\",\"ordinal\":8,\"organUnitFullName\":\"testJSON\",\"parent\":\"0\",\"suborderNo\":\"58961\"}";

        User user = JSON.parseObject(jsonStr, User.class);
        System.out.println("user对象" + user.toString());
        System.out.println("action=" + user.getAction() + "---id=" + user.getId());

        /**
         * 另一种方式转对象
         */
        User dd = JSON.parseObject(jsonStr, new TypeReference<User>() {
        });
        System.out.println("另一种方式获取user对象" + dd.toString());
        System.out.println("另一种方式获取=" + dd.getAction() + "---id=" + dd.getId());
    }

    /**
     * 数组型 json 字符串与 JSONArray 对象之间的转换
     */
    public static void jsonStrToJSONArray() {
        String str = "{\"errors\":[{\"code\":\"UUM70004\",\"message\":\"组织单元名称不能为空\",\"data\":{\"id\":\"254\",\"suborderNo\":\"SUB_2018062797348039\",\"organUnitType\":\"部门\",\"action\":\"add\",\"parent\":\"10000\",\"ordinal\":0,\"organUnitFullName\":\"组织单元全称\"},\"success\":false},{\"code\":\"UUM70004\",\"message\":\"组织单元名称不能为空\",\"data\":{\"id\":\"255\",\"suborderNo\":\"SUB_2018062797348039\",\"organUnitType\":\"部门\",\"action\":\"add\",\"parent\":\"10000\",\"ordinal\":0,\"organUnitFullName\":\"组织单元全称\"},\"success\":false}]}";
        JSONObject jsonObject = JSON.parseObject(str);
        JSONArray error = jsonObject.getJSONArray("errors");
        List<ErrorTypeMe> errors = JSON.parseObject(error.toJSONString(), new TypeReference<List<ErrorTypeMe>>() {
        });
        errorArr(errors);
    }

    /**
     * 数组型 json 字符串与 JSONArray 对象之间的转换
     */
    public static void jsonStrToJSONArray2() {
        String str = "{\"errors\":[{\"code\":\"UUM70004\",\"message\":\"组织单元名称不能为空\",\"data\":{\"id\":\"254\",\"suborderNo\":\"SUB_2018062797348039\",\"organUnitType\":\"部门\",\"action\":\"add\",\"parent\":\"10000\",\"ordinal\":0,\"organUnitFullName\":\"组织单元全称\"},\"success\":false},{\"code\":\"UUM70004\",\"message\":\"组织单元名称不能为空\",\"data\":{\"id\":\"255\",\"suborderNo\":\"SUB_2018062797348039\",\"organUnitType\":\"部门\",\"action\":\"add\",\"parent\":\"10000\",\"ordinal\":0,\"organUnitFullName\":\"组织单元全称\"},\"success\":false}]}";
        //获取jsonObject对象
        JSONObject jsonObject = JSON.parseObject(str);
        //把对象转换成jsonArray数组
        JSONArray error = jsonObject.getJSONArray("errors");
        //将数组转换成字符串
        String jsonString = JSONObject.toJSONString(error);
        //将字符串转成list集合
        List<ErrorTypeMe> errors = JSONObject.parseArray(jsonString, ErrorTypeMe.class);
        //把字符串转换成集合
        errorArr(errors);
    }

    /**
     * javaBean 转 json 对象
     */
    public static void jsonBenToJsonObject() {
        User data = new User();
        data.setAction("add");
        data.setId("1");
        data.setOrdinal(8L);
        data.setOrganUnitFullName("testJSON");
        data.setParent("0");
        data.setSuborderNo("58961");
        JSONObject jsonObj = (JSONObject) JSON.toJSON(data);
        JSON json = (JSON) JSON.toJSON(data);
        System.out.println("jsonObj" + jsonObj);
        System.out.println("json对象" + json);
    }

    private static void errorArr(List<ErrorTypeMe> errors) {
        for (ErrorTypeMe e : errors) {
            //ErrorTypeMe的属性
            System.out.println("ErrorTypeMe属性=" + e.getSuccess());
            System.out.println("ErrorTypeMe属性=" + e.getCode());
            System.out.println("ErrorTypeMe属性=" + e.getMessage());
            //ErrorTypeMe集合属性
            List<User> users = e.getUser();
            for (User d : users) {
                System.out.println("user对象属性=" + d.getId());
                System.out.println("user对象属性=" + d.getAction());
                System.out.println("user对象属性=" + d.getSuborderNo());
            }
        }
    }
}
