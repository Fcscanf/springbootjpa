package cn.fcsca.springbootjpa.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * User 使用JPA注解配置映射关系
 * @Entity 指定实体映射类
 * @Table(name = "tbl_user") 指定表，省略name属性则默认表名是类名
 *
 * @author Fcscanf@樊乘乘
 * @description
 * @date 下午 18:59 2018-08-14
 */
@Entity
@Table(name = "tbl_user")
@Data
public class User {

    /**
     * @Id主键
     * @GeneratedValue(strategy = GenerationType.IDENTITY)自增
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * @Column(name = "last_name",length = 50)表明列，name设置数据库列名称
     */
    @Column(name = "last_name",length = 50)
    private String lastName;

    /**
     * 省略则默认列名就是属性名
     */
    @Column
    private String email;
}
