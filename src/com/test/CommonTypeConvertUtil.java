/*
 * 文件名：CommonTypeConvertUtil.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： CommonTypeConvertUtil.java
 * 修改人：dade
 * 修改时间：2015年12月1日
 * 修改内容：新增
 */
package com.test;

import org.apache.commons.lang.StringUtils;

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
public class CommonTypeConvertUtil{
    /**
     * 将CommonType类转化为字符串.
     * 
     * @param commonType CommonType类
     * @return 转化后的字符串
     */
    public String convertCommonTypeToString(CommonType commonType) {
        if (commonType == null) {
            throw new RuntimeException("commonType不能为NULL");
        }
        StringBuffer temp=new StringBuffer();
        if (StringUtils.isNotBlank(commonType.getRefID())) {
            temp.append("RefID:" + commonType.getRefID() + ";");
        }
        if (StringUtils.isNotBlank(commonType.getRefName())) {
            temp.append("RefName:" + commonType.getRefName() + ";");
        }
        if (StringUtils.isNotBlank(commonType.getSubID())) {
            temp.append("SubID:" + commonType.getSubID() + ";");
        }
        if (StringUtils.isNotBlank(commonType.getSubName())) {
            temp.append("SubName:" + commonType.getSubName() + ";");
        }
        if (StringUtils.isNotBlank(commonType.getManualMark())) {
            temp.append("ManualMark:" + commonType.getManualMark() + ";");
        }
        if (StringUtils.isNotBlank(commonType.getRevType())) {
            temp.append("RevType:" + commonType.getRevType() + ";");
        }
        if (StringUtils.isNotBlank(commonType.getRevTypeName())) {
            temp.append("RevTypeName:" + commonType.getRevTypeName() + ";");
        }
        if (StringUtils.isNotBlank(commonType.getExcType())) {
            temp.append("ExcType:" + commonType.getExcType() + ";");
        }
        if (StringUtils.isNotBlank(commonType.getExcTypeName())) {
            temp.append("ExcTypeName:" + commonType.getExcTypeName() + ";");
        }
        if (StringUtils.isNotBlank(commonType.getTimeType())) {
            temp.append("TimeType:" + commonType.getTimeType() + ";");
        }
        if (StringUtils.isNotBlank(commonType.getTimeTypeName())) {
            temp.append("TimeTypeName:" + commonType.getTimeTypeName() + ";");
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
     * main测试.
     * 
     * @param args main参数
     */
    public static void main(String[] args) {
        System.out.println("yuanqiao: ".split(":")[1]);
    }
}
