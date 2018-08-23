/**
 * Created by ning on 23/8/18.
 * <p>
 * 1、Spring WebFlux是Spring Framework 5.0中引入的新的反应式Web框架
 * 与Spring MVC不同，它不需要Servlet API，完全异步和非阻塞，并 通过Reactor项目实现Reactive Streams规范。
 * <p>
 * 2、Flux和Mono  User List<User>
 * 1）简单业务而言：和其他普通对象差别不大，复杂请求业务，就可以提升性能
 * 2）通俗理解：
 * Mono 表示的是包含 0 或者 1 个元素的异步序列
 * mono->单一对象 User     redis->用户ID->唯一的用户Mono<User>
 * <p>
 * Flux 表示的是包含 0 到 N 个元素的异步序列
 * flux->数组列表对象 List<User>   redis->男性用户->Flux<User>
 * Flux 和 Mono 之间可以进行转换
 */
package com.zn.springbootdemo.webflux;