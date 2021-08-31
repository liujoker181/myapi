# myapi
使用springboot制作的api接口，可以部署于服务器中以供调用

主干中默认是以jar包方式配置pom文件

附带自己在本人服务器上所部署的部分接口的url地址，仅供参考展示接口的实际效果



### helloApi

https://liujoker.club/myapi/hello

​	最基础的接口，测试用



### getApi

https://liujoker.club/myapi/get1?name=joker

https://liujoker.club/myapi/get2/joker

​	实现最基础的httpget的两种方式



### getCookieApi

https://liujoker.club/myapi/getcookie?user=joker

https://liujoker.club/myapi/usecookie

​	实现创建cookie和使用cookie验证访问



### postApi

https://liujoker.club/myapi/post-adduser

```json
{
  "id":"00001",
  "username":"joker",
  "password":"joker"
}
```

https://liujoker.club/myapi/get-finduser?id=00001

​	实现post User类的新增，
