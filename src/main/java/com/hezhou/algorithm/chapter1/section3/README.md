# 1.3 背包、队列和栈

**许多数据类型**都和对象的集合有关。具体来说，数据类型的值就是一组对象的集合，所有操作都是关于添加、删除或者访问集合中的对象。

集合类型的抽象数据类型的一个关键特性是我们应该可以用它们存储任意类型的数据。通过**泛型**（也叫参数化类型）可以做到这点。
通过泛型，我们只需要一份 API（和一次实现）就能够处理所有类型的数据，甚至是在未来定义的数据类型。

## 自动装箱

自动将一个原始数据类型转换为一个封装类型被称为**自动装箱**。
自动将一个封装类型转换为一个原始数据类型被称为**自动拆箱**。

```java
Stack<Integer> stack = new Stack<Integer>();
stack.push(17); // 自动装箱（int -> Integer）
int i = stack.pop(); // 自动拆箱（Integer -> int）
```

背包是一种不支持从中删除元素的集合数据类型。特点：
- 只增不减
- 无序

队列：先进先出（FIFO）；栈：后进先出（LIFO）。

算数表达式求值