package club.liujoker.myapi.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * User对象，包含id，用户名，密码
 * @date 2021-08-31
 * @description 使用lombok帮助生成getset函数和不带参数的构造函数
 */
@Data//主要用于自动生成getset
@NoArgsConstructor//用于生成不带参数的构造函数
public class User {
    private Long id;
    private String username;
    private String password;
}
