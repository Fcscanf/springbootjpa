package cn.fcsca.springbootjpa.repository;

import cn.fcsca.springbootjpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UserRepository 继承JpaRepository来完成对数据库的操作
 *
 * @author Fcscanf@樊乘乘
 * @date 下午 19:14 2018-08-14
 */
public interface UserRepository extends JpaRepository<User,Integer> {
}
