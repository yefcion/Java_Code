package rolectrl;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author： xu.yefcion
 * @description：
 * @date： 2020/2/1 14:15
 */

public class JudgeRole {
    public String judge(String roleName){
        return RoleEnum.valueOf(roleName).op();
    }

    @Test
    public void testJudge(){
        String back = judge("ROLE_ADMIN");
        System.out.println(back);
    }

    @Test
    public void stre(){
        String s = "ko\njk";
        String l = "\"ko\\njk\"";
        String k = l.replace("\"","");

        System.out.println(s);
        System.out.println(l);
        System.out.println(k);
    }

    @Test
    public void eat(){
        List<String> breakfast = new ArrayList<>();
        breakfast.add("煮粥+红枣");
        breakfast.add("煮鸡蛋");
        breakfast.add("清水面条");
        breakfast.add("蒸包子");
        breakfast.add("面包+牛奶");

        List<String> lunch = new ArrayList<>();
        lunch.add("煎鸡胸肉");
        lunch.add("西兰花");
        lunch.add("青椒肉丝");

        List<String> dinner = new ArrayList<>();
        dinner.add("西红柿鸡蛋面");
        dinner.add("速冻水饺");

        for (String a:breakfast){
            for (String b:lunch){
                for (String c:dinner){
                    System.out.println(a+"\t"+b+"\t"+c);
                }
            }
        }
    }
}
