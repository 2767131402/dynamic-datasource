package com.zhenglei.dynamicdatasource.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@ToString
@TableName(value = "user")//默认将类名作为表名
public class User {

    @TableId(value = "id",type = IdType.AUTO)
    private String id;

    @TableField(value = "user_name")
    private String userName;

    private Integer age;

}

