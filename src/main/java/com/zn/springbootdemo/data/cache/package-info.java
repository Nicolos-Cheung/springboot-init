/**
 * Created by ning on 24/8/18.
 * <p>
 * 声明式缓存
 * <p>
 * 针对不同的缓存技术，需要实现不同的CacheManager
 * <p>
 * 声明式缓存注解有：原理：AOP
 *
 * @Cacheable 方法执行前Spring先查看缓存是否有数据，如果有，则直接返回。
 * @CachePut 无论怎样都将方法的返回值放入缓存
 * @CacheEvict 将一条或多条数据从缓存删除
 * @Caching 可以通过该注解组合多个注解策略在一个方法上
 * <p>
 * SpringBoot支持并自动配置的缓存技术：相关cacheManager位于->org.springframework.boot.autoconfigure.cache包下
 * 默认情况下是SimpleCacheConfiguration(使用ConcurrentMap)
 * 其次还有:
 * EhCacheCacheConfiguration
 * RedisCacheConfiguration
 * GuavaCacheConfiguration
 * GenericCacheConfiguration(使用Collection)
 * ...
 * <p>
 * 切换缓存技术：
 * EhCache 相关配置：
 * 1、引入依赖
 * <dependency>
 *        <groupId>net.sf.ehcache</groupId>
 *        <artifactId>ehcache</artifactId>
 *        <version>2.8.3</version>
 * </dependency>
 * 2、添加ehcache.xml
 * <p>
 * Guava 相关配置：只需要引入依赖，Spring boot 会自动配置GuavaCacheManager这个bean.
 * <dependency>
 *       <groupId>com.google.guava</groupId>
 *       <artifactId>guava</artifactId>
 *       <version>18.0</version>
 * </dependency>
 * <p>
 * <p>
 * Redis 相关配置：只需要引入依赖，Spring boot 会自动配置RedisCacheManager 以及 RedisTemplate的bean.
 * <dependency>
 *        <groupId>org.springframework.boot</groupId>
 *        <artifactId>spring-boot-starter-data-redis</artifactId>
 * </dependency>
 */
package com.zn.springbootdemo.data.cache;