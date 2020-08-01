package com.spring.mybatis.common;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author： xu.yefcion
 * @description：
 * @date： 2020.8.1 23:29
 */
@Data
public class XRspEntity<T> {
    /**
     * 业务返回码, 0表示成功，其他都是异常码
     */
    @ApiModelProperty(value = "响应码, 0表示成功，其他表示失败", required = true)
    String ret;
    /**
     * data里面如果是非数组类型，在0的情况下都是1，如果是数组则是，数组元素个数
     */
    @ApiModelProperty(value = "响应的业务数据的个数，如果data是数组，则是数组长度，其他只有0和1", required = true)
    int count;
    /**
     * 返回描述信息
     */
    @ApiModelProperty(value = "响应消息, 失败时要求必须有错误描述", required = false)
    String retMsg;

    /**
     * 接口的处理耗时
     */
    @ApiModelProperty(value = "本次请求的处理时间", required = false)
    String processCost;
    /**
     * 实际响应的数据，类型不限
     */
    @ApiModelProperty(value = "实际的业务数据", required = true)
    T data;

    public XRspEntity<T> buildVapRspEntity(String ret, int count, String retMsg, T date)
    {
        this.setRet(ret);
        this.setCount(count);
        this.setRetMsg(retMsg);
        this.setData(date);
        return this;
    }
}