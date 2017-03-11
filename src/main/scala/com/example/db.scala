package com.example

import io.getquill.{MysqlJdbcContext, SnakeCase}

// http://blog.vogonjeltz.com/blog/2016/08/19/actually-getting-data-with-quill/

package object db {

  type JdbcDatabase = MysqlJdbcContext[SnakeCase]

  lazy val ctx = new JdbcDatabase("ctx")

}

