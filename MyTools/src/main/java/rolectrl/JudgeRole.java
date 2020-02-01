package rolectrl;

import org.junit.Test;

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
}
