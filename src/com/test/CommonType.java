/*
 * 文件名：thisUtil.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： thisUtil.java
 * 修改人：dade
 * 修改时间：2015年12月1日
 * 修改内容：新增
 */
package com.test;

import java.io.IOException;

import org.apache.commons.lang.StringUtils;

import com.alibaba.dubbo.common.json.JSON;


/**
 * TODO 添加类的一句话简单描述.
 * <p>
 * TODO 详细描述
 * <p>
 * TODO 示例代码
 * <pre>
 * </pre>
 * 
 * @author     dade
 */
public class CommonType {
    /**
     * 退票类型 1:自愿退，2：非自愿退.
     */
    private String refID;
    /**
     * 退票类型名称.
     */
    private String refName;
    /**
     * 子类型.
     */
    private String subID;
    /**
     * 子类型名称.
     */
    private String subName;
    /**
     * 差错备注标志 1：已备注.
         */
    private String manualMark;
    /**
     * 审核类型  1：正常，2：二审差错.
     */
    private String revType;
    /**
     * 审核类型名称.
     */
    private String revTypeName;
    /**
     * 超期处理类型  1：人工超期类型，2：系统超期类型.
     */
    private String excType;
    /**
     * 超期处理类型名称.
     */
    private String excTypeName;
    /**
     * 参考时间类型  1：出票时间，2：起飞时间.
     */
    private String timeType;
    /**
     * 参考时间类型名称.
     */
    private String timeTypeName;
    /**
     * 设置refID.
     * 
     * @return 返回refID refID
     */
    public String getRefID() {
        return refID;
    }
    /**
     * 获取refID.
     * 
     * @param refID 要设置的refID
     */
    public void setRefID(String refID) {
        this.refID = refID;
    }
    /**
     * 设置refName.
     * 
     * @return 返回refName refName
     */
    public String getRefName() {
        return refName;
    }
    /**
     * 获取refName.
     * 
     * @param refName 要设置的refName
     */
    public void setRefName(String refName) {
        this.refName = refName;
    }
    /**
     * 设置subID.
     * 
     * @return 返回subID subID
     */
    public String getSubID() {
        return subID;
    }
    /**
     * 获取subID.
     * 
     * @param subID 要设置的subID
     */
    public void setSubID(String subID) {
        this.subID = subID;
    }
    /**
     * 设置subName.
     * 
     * @return 返回subName subName
     */
    public String getSubName() {
        return subName;
    }
    /**
     * 获取subName.
     * 
     * @param subName 要设置的subName
     */
    public void setSubName(String subName) {
        this.subName = subName;
    }
    /**
     * 设置manualMark.
     * 
     * @return 返回manualMark manualMark
     */
    public String getManualMark() {
        return manualMark;
    }
    /**
     * 获取manualMark.
     * 
     * @param manualMark 要设置的manualMark
     */
    public void setManualMark(String manualMark) {
        this.manualMark = manualMark;
    }
    /**
     * 设置revType.
     * 
     * @return 返回revType revType
     */
    public String getRevType() {
        return revType;
    }
    /**
     * 获取revType.
     * 
     * @param revType 要设置的revType
     */
    public void setRevType(String revType) {
        this.revType = revType;
    }
    /**
     * 设置revTypeName.
     * 
     * @return 返回revTypeName revTypeName
     */
    public String getRevTypeName() {
        return revTypeName;
    }
    /**
     * 获取revTypeName.
     * 
     * @param revTypeName 要设置的revTypeName
     */
    public void setRevTypeName(String revTypeName) {
        this.revTypeName = revTypeName;
    }
    /**
     * 设置excType.
     * 
     * @return 返回excType excType
     */
    public String getExcType() {
        return excType;
    }
    /**
     * 获取excType.
     * 
     * @param excType 要设置的excType
     */
    public void setExcType(String excType) {
        this.excType = excType;
    }
    /**
     * 设置excTypeName.
     * 
     * @return 返回excTypeName excTypeName
     */
    public String getExcTypeName() {
        return excTypeName;
    }
    /**
     * 获取excTypeName.
     * 
     * @param excTypeName 要设置的excTypeName
     */
    public void setExcTypeName(String excTypeName) {
        this.excTypeName = excTypeName;
    }
    /**
     * 设置timeType.
     * 
     * @return 返回timeType timeType
     */
    public String getTimeType() {
        return timeType;
    }
    /**
     * 获取timeType.
     * 
     * @param timeType 要设置的timeType
     */
    public void setTimeType(String timeType) {
        this.timeType = timeType;
    }
    /**
     * 设置timeTypeName.
     * 
     * @return 返回timeTypeName timeTypeName
     */
    public String getTimeTypeName() {
        return timeTypeName;
    }
    /**
     * 获取timeTypeName.
     * 
     * @param timeTypeName 要设置的timeTypeName
     */
    public void setTimeTypeName(String timeTypeName) {
        this.timeTypeName = timeTypeName;
    }
    /**
     * 将this类转化为字符串.
     * 
     * @return 转化后的字符串
     */
    public String convertToString() {
        StringBuffer temp=new StringBuffer();
        if (StringUtils.isNotBlank(this.getRefID())) {
            temp.append("RefID:" + this.getRefID() + ";");
        }
        if (StringUtils.isNotBlank(this.getRefName())) {
            temp.append("RefName:" + this.getRefName() + ";");
        }
        if (StringUtils.isNotBlank(this.getSubID())) {
            temp.append("SubID:" + this.getSubID() + ";");
        }
        if (StringUtils.isNotBlank(this.getSubName())) {
            temp.append("SubName:" + this.getSubName() + ";");
        }
        if (StringUtils.isNotBlank(this.getManualMark())) {
            temp.append("ManualMark:" + this.getManualMark() + ";");
        }
        if (StringUtils.isNotBlank(this.getRevType())) {
            temp.append("RevType:" + this.getRevType() + ";");
        }
        if (StringUtils.isNotBlank(this.getRevTypeName())) {
            temp.append("RevTypeName:" + this.getRevTypeName() + ";");
        }
        if (StringUtils.isNotBlank(this.getExcType())) {
            temp.append("ExcType:" + this.getExcType() + ";");
        }
        if (StringUtils.isNotBlank(this.getExcTypeName())) {
            temp.append("ExcTypeName:" + this.getExcTypeName() + ";");
        }
        if (StringUtils.isNotBlank(this.getTimeType())) {
            temp.append("TimeType:" + this.getTimeType() + ";");
        }
        if (StringUtils.isNotBlank(this.getTimeTypeName())) {
            temp.append("TimeTypeName:" + this.getTimeTypeName() + ";");
        }
        return temp.toString();
    }
    /**
     * 将字符串转化为CommonType类.
     * 
     * @param str 带转化的字符串
     * @return CommonType类
     */
    public CommonType convertStringToCommonType(String str) {
        CommonType commonType = new CommonType();
        if (str == null) {
            throw new RuntimeException("传入字段不能为NULL");
        }
        if (StringUtils.isBlank(str)) {
            return new CommonType();
        }
        String[] arr = str.split(";");
        for (int i = 0; i < arr.length; i++) {
            String[] arr1 = arr[i].split(":");
            if (arr1.length < 2) {
                continue;
            }
            setFieldForCommonType(commonType, arr1[0], arr1[1]);
        }
        return commonType;
    }
    /**
     * 为CommonType类中的字段设置值.
     * 
     * @param commonType CommonType类
     * @param key 字段键
     * @param value 字段键对应的值
     */
    private void setFieldForCommonType(CommonType commonType, String key, String value){
        if ("RefID".equals(key)) {
            commonType.setRefID(value);
        }
        if ("RefName".equals(key)) {
            commonType.setRefName(value);
        }
        if ("SubID".equals(key)) {
            commonType.setSubID(value);
        }
        if ("SubName".equals(key)) {
            commonType.setSubName(value);
        }
        if ("ManualMark".equals(key)) {
            commonType.setManualMark(value);
        }
        if ("RevType".equals(key)) {
            commonType.setRevType(value);
        }
        if ("RevTypeName".equals(key)) {
            commonType.setRevTypeName(value);
        }
        if ("ExcType".equals(key)) {
            commonType.setExcType(value);
        }
        if ("ExcTypeName".equals(key)) {
            commonType.setExcTypeName(value);
        }
        if ("TimeType".equals(key)) {
            commonType.setTimeType(value);
        }
        if ("TimeTypeName".equals(key)) {
            commonType.setTimeTypeName(value);
        }
    }
    /**
     * TODO 添加方法注释.
     * 
     * @param args main参数
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        CommonType commonType=new CommonType();
        commonType.setExcType("dade");
        commonType.setExcTypeName("");
        System.out.println(commonType.convertToString());
        String str = "RefID:1;RefName:;TimeType:1;TimeTypeName:出票时间;ExcType:1;ExcTypeName:;";
        commonType=commonType.convertStringToCommonType(str);
        System.out.println(JSON.json(commonType));
    }
}
