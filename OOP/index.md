# 开始面向 `对象`

## 说明

参考 [https://www.w3schools.com/java/java_oop.asp](https://www.w3schools.com/java/java_oop.asp)

## 你没有对象，而你不必因此感到悲伤

嗯......

你看，a class is a template for objects, and an object is an instance of a class.

比如 Fruit 是一个 class  
那么 objects 可以是 Apple, Banana, Mango...

典型的后宫番（笑，其实不对）  
在创建单个对象时，它们继承类中的所有变量和方法。（更确切地说，这更像是子女关系，事实上，超类又被称为父类......）。

好吧，如果你硬想理解成后宫番也行，`但我劝你行善`......

## 一个对象有属性 attribute 有方法 method，正如你玩 gal 时，攻略对象有好感度和攻略方法

但我不玩 gal！（正人君子语气）  
（问就是狐朋狗友的只言片语那里听来的！）

前往 [Npy.md](/OOP/Npy.java) 一探究竟吧！

一个简单的 Npy 两个属性，一个是收到的礼物，一个是好感度。刚开始它们都是 0。

```java
private int recievedGifts = 0;
private int favorability = 0;
```

程序提供了一个被 public 修饰的方法 giveAGift，这意味着你可以给 ta 送礼物，程序会在终端输出当前好感度的值。逻辑很简单，送一份礼物好感值就加一！在 main 函数里，我们调用了一次这个方法。

```java
public void giveAGift() {
    this.recievedGifts++;
    this.favorability++;

    System.out.println("好感度: " + this.favorability);
}
```

当然你或许会批判这是什么 `too capitalistical` 之类。  
笔者表示这仅仅是个示例啦，也不代表笔者的价值观：欢迎加上你自己的价值观，修改程序。

还有些人认为没那么简单，一个人收到礼物多了之后，再送礼物对好感度提升就没那么多了，得采用其他方式（比如陪 ta 听听歌逛逛街）什么的。因此你添加其他的方法，并修改加分的逻辑。  
写着写着你会发现每个方法都写一次加分逻辑好麻烦，而且又杂乱无章。

于是你想：能不能把逻辑组织地更加美观有序呢？

这是一个不错的想法！在接下来的学习中，你将学会与如何做到这一点。

<!-- 如果你动动脑筋，就会发现可以专门写一个加分逻辑的方法。在这个方法中我们查看相关属性的值，加的分数按照一定的逻辑和这个属性的值呈负相关！ -->

但在此之前，我们需要了解一些基本的语法。
