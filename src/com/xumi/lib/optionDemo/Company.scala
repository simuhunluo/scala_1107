package com.xumi.lib.optionDemo

/**
  * Created by taos on 2017/11/6.
  */
object Company {
  val opt: Option[Employee] = Some(Employee("zhangsan","dev"))
  def main(args: Array[String]): Unit = {
    val joeDepartment = lookupByName("zhangsan").map(_.department)
    println(joeDepartment.getOrElse("guagua"))
  }
  def lookupByName(name: String): Option[Employee] = {
    opt.filter(_.name == ("zhangsan") )
  }
}
//定义数据类型Employee
case class Employee(name: String, department: String)