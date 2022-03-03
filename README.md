# 设计模式
  
## 原型模式Prototype
1.实现Cloneable接口   
2.重写Object类中的clone方法   
3.直接操作内存中的二进制流，复制对象的时候性能比new一个新对象好很多   
4.核心在于原型类实现标识接口Cloneable，并重写object中的clone()方法。Cloneable接口仅仅是用作标识，因为它没有定义任何方法   
5.适用场景，需要两个同类型的对象，其中只有少量的属性数据值不同，使用该模式可以提高性能  
6.常与工厂方法模式一起使用。  
7.对象拷贝时构造函数不会执行  
8.Object类提供的方法clone()只是拷贝本对象，对象内部的数组，引用对象，都不拷贝，还是指向原生对象的内部元素地址，所以叫浅拷贝  
9.深拷贝和浅拷贝尽量不要在一个类中复合使用，会增加复杂度，不利于维护  
10.使用clone()方法，类成员变量上就不要用final，这两者有冲突  
  
## 单例模式
1.构造函数使用private修饰符，避免在类外部被实例化  
2.懒汉模式要留意线程安全的问题，需使用volatile、synchronized保证对象在所有类中同步  
3.饿汉模式在类加载时就已初始化了一个实例对象  
4.类中其他方法尽量是static  
4.建议使用饿汉式的单例，避免线程同步带来的资源损耗
5.spring中每个bean默认就是单例的
  
##  简单工厂 
1.静态工厂方法  
2.不属于23种模式之一  
3.通过一个静态工厂类，按照参数，实例化不同的对象  
4.所有产品都由一个工厂创建，出现问题的话Boom   
5.如果要增加一个产品就需要修改工厂类，违反了开闭原则  
  

##  工厂方法
1.可以做到增加一个现有的产品不必修改代码，符合开闭原则
2.明确分割使用对象和管理对象的职责
3.由四类角色组成 分别是抽象产品、具体产品、抽象工厂、具体工厂

##  抽象工厂  
 




