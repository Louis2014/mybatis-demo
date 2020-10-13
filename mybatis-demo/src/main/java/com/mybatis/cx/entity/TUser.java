 /*
  * Copyright (C), 2002-2020-03-18, 苏宁易购电子商务有限公司
  * FileName: TUser.java
  * Author:   chenxi
  * Date:     2020-03-18 16:59
  * Description:
  * History: //修改记录
  * <author>          <time>          <version>          <desc>
  * 修改人姓名           修改时间           版本号              描述
  */
 package com.mybatis.cx.entity;

 import java.io.Serializable;

 /**
  * <br>
  * 〈功能详细描述〉
  *
  * @author chenxi
  * @see [相关类/方法]（可选）
  * @since [产品/模块版本] （可选）
  */
 public class TUser implements Serializable {

     private static final long serialVersionUID = 6583561408115181207L;

     private String custNo;
     private String phoneNum;

     public String getCustNo() {
         return custNo;
     }

     public void setCustNo(String custNo) {
         this.custNo = custNo;
     }

     public String getPhoneNum() {
         return phoneNum;
     }

     public void setPhoneNum(String phoneNum) {
         this.phoneNum = phoneNum;
     }

     @Override
     public String toString() {
         return "TUser{" +
                 "custNo='" + custNo + '\'' +
                 ", phoneNum='" + phoneNum + '\'' +
                 '}';
     }
 }