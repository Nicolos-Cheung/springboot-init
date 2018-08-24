/**
 * Created by ning on 24/8/18.
 *
 * Spring data rest
 *
 * 添加数据：url: localhost:8080/restTestBeans   POST请求  请求体：Json格式
 *
 * 查询数据：url: localhost:8080/restTestBeans/1  查询id=1的数据
 *
 * 分页查询：url: localhost:8080/restTestBeans/?page=1&size=2   //第二页，每页数量为2
 *
 * 排序:    url: localhost:8080/restTestBeans/?sort=id,desc
 *
 * 更新数据：url: localhost:8080/restTestBeans/1  更新id为1的数据  PUT请求  请求体：Json格式
 *
 * 删除数据：url: localhost:8080/restTestBeans/1  删除id为1的数据   DELETE请求
 */
package com.zn.springbootdemo.data.rest;