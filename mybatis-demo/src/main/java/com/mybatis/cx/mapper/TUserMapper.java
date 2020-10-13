 /*
  * Copyright (C), 2002-2020-03-18, 苏宁易购电子商务有限公司
  * FileName: TUserMapper.java
  * Author:   chenxi
  * Date:     2020-03-18 16:59
  * Description:
  * History: //修改记录
  * <author>          <time>          <version>          <desc>
  * 修改人姓名           修改时间           版本号              描述
  */
 package com.mybatis.cx.mapper;

 import com.mybatis.cx.entity.TUser;

 import java.util.List;

 /**
  * <br>
  * 〈功能详细描述〉
  *
  * @author chenxi
  * @see [相关类/方法]（可选）
  * @since [产品/模块版本] （可选）
  */
 public interface TUserMapper {

     List<TUser> selectAll();
     TUser getOne(String custNo);

 }