# 开始面向 `对象`

但在此之前，我们需要了解一些基本的语法。  
吗？

不用。语法该出手时候自然会出手 👋

随便读读小文章，愉悦身心更重要 😎

祝天天开心

## 你可能没有对象，但请你不必因此悲伤

嗯......

你看，a class is a template for objects, and an object is an instance of a class.

比如 Fruit 是一个 class  
那么 objects 可以是 Apple, Banana, Mango...

你可能会想道：阿！典型的后宫番（笑，其实不对）  
在创建单个对象时，它们继承类中的所有变量和方法。（更确切地说，这更像是子女关系，事实上，超类又被称为父类......）。

好吧，如果你硬想理解成后宫番也行，那么这是最伦理剧的一集，，，`但我劝你善良`......

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

## 想攻略一个人，可没那么简单（误）

当然，你或许会批判这是什么 `too capitalistical` 之类。  
笔者：这仅仅是个示例，不代表笔者的价值观：欢迎加上你自己的价值观，修改程序。

也有人认为，一个人收到礼物多了之后，再送礼物对好感度提升就没那么多了，得采用其他方式（比如陪 ta 听听歌逛逛街）什么的。  
因此你添加其他的方法，并修改加分的逻辑。  
写着写着你会发现每个活动方法都写一次加分逻辑十分麻烦，而且又杂乱无章。

---

于是你想：能不能把逻辑组织地更加美观有序呢？

这是一个不错的想法！在接下来的学习中，你将学会与如何做到这一点。

## 于是，真正的旅程开始了

你最近在追番，番名叫《葬送的芙莉莲》。

<!-- 如果你动动脑筋，就会发现可以专门写一个加分逻辑的方法。在这个方法中我们查看相关属性的值，加的分数按照一定的逻辑和这个属性的值呈负相关！ -->

## 今天，你遇见了可爱的 フリーレン

今天，你遇见了可爱的 フリーレン。

你问道：你是精灵么？她说她是精灵。

kawaii!  
你决定写一个 [Kawaii 类](/OOP/KawaiiWithoutCons.java) 来描述她。  
你希望在见到一个可爱的家伙的第一面就记录下 ta 的信息。

先写两个属性，姓名和物种（当然，Kawaii 的也有人类啦）

一般来说，你会写一堆方法，比如 setName 等等。这其实是无所谓的。  
但是在调用的时候，太麻烦了！比如，你不得不一行一行地调用方法来初始化 Furiren 的信息。

```java
KawaiiWithoutCons furiren = new KawaiiWithoutCons();
furiren.setSpecis("sprite");
furiren.setName("Furiren");
```

要是再加上年龄啊，性别啊，各种各样的多如牛毛的属性，一个一个加，实在是一件苦事。  
如果自己新编个函数修改属性的也不是不行。不管怎么样，好像都得 new 一下，然后调用方法修改属性。

于是你想，好呆啊，有没有更加简洁的方法呢？

---

这就是构造器 Constructor！构造器是一个特殊的方法，它和所在的类同名。  
利用这个方法，你可以在 new 一个对象的同时初始化对象的属性。相当于省了一行（笑）

见 [KawaiiWithCons.java](/OOP/KawaiiWithCons.java)

```java
public KawaiiWithCons(String name, String species) {
    this.name = name;
    this.species = species;
}
```

加了构造器之后，你只需要一行就可以轻松记录下 Furiren 的信息。

```java
KawaiiWithCons furiren = new KawaiiWithCons("Furiren", "sprite");
```

你可能会问，有些属性碍于情面或者其它社会原因（比如问女生年龄）不方便第一时间得知，又希望在 new 的同时其他可知的属性咋办？

很简单，只要再加一个构造器，比如你不方便得知 Furiren 的种族，但是可以问问她的名字，你可以

```java
public KawaiiWithCons(String name) {
    this.name = name;
}
```

正常调用即可！

```java
KawaiiWithCons furiren = new KawaiiWithCons("Furiren");
```

## 实在太多了！qwq

~~实在太多了！希望你能理解，为此处值的 `实在` 并不是 `实在`，而是指本当に，即 really; truly; indeed~~

回归正题。Kawaii 的家伙的属性实在太多了！比如姓名，年龄，物种，血型，MBTI，星座...

这时候，你可能会写一大堆构造器，比如：姓名 + 年龄，姓名 + 物种，姓名 + 年龄 + 物种......

你有强迫症，你试图穷尽所有情况来构造。  
于是你写了非常非常多的构造器... 每个构造器都长这样

```java
public KawaiiWithCons(Type1 a1,Type2 a2,Type3 a3...){
    this.a1=a1;
    this.a2=a2;
    this.a3=a3;
    ...
}
```

当有人问你为什么要这么做时，你答道：万一有一天，我们只知道一个人的 balabala 信息，咋办？使用者使用起来方便不是最好的吗？

于是你沉浸在无穷无尽相似的、枯燥的代码中无法自拔，面黄肌瘦，晕了过去。

---

更悲催的是，你说：万一有一天，我只知道某个 Kawaii 的家伙的物种咋办？于是你添了一个构造器长这样：

```java
public KawaiiWithCons(String name) {
    this.name = name;
}
```

编译器发出了友善的告警：

```txt
constructor KawaiiWithCons(java.lang.String) is already defined in class OOP.KawaiiWithCons(compiler.err.already.defined)
Duplicate method KawaiiWithCons(String) in type KawaiiWithConsJava(67109219)
OOP.KawaiiWithCons.KawaiiWithCons(String name)
```

## 你陷入了沉思
