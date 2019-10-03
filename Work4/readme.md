# 活动的四种模式
## standard模式如下：
Android默认启动模式就是standard模式，或者也可在AndroidManifest.xml文件指定：
![images](https://github.com/Oathzzh/2017118118_Android/blob/master/Work4/images/1.1.png)
### 在standard模式工作原理
在此模式中，不论活动是否在栈顶，只要点击按钮都将会创建一个新活动：
![images](https://github.com/Oathzzh/2017118118_Android/blob/master/Work4/images/1.2.png)

## singleTop模式如下：
通过在AndroidManifest.xml文件指定为singleTop模式：
![images](https://github.com/Oathzzh/2017118118_Android/blob/master/Work4/images/2.1.png)
### singleTop模式工作原理
在此模式中，只要在栈顶活动已存在，就不会再创建新活动，此模式能很好地解决重复创建栈顶活动的问题，多次点击按钮如图所示：

![images](https://github.com/Oathzzh/2017118118_Android/blob/master/Work4/images/2.2.png)

但在多活动切换时，比如已有一个Hello1，然后启动Hello2，由于此时Hello2到了栈顶，再点击启动Hello1时，仍会创建新Hello1：

![images](https://github.com/Oathzzh/2017118118_Android/blob/master/Work4/images/2.3.png)

## singleTask模式如下：
通过在AndroidManifest.xml文件指定为singleTask模式：
![images](https://github.com/Oathzzh/2017118118_Android/blob/master/Work4/images/3.1.png)
### singleTask模式工作原理
从以下打印信息中可以看出，在Hello2启动Hello1时，返回栈中已经存在Hello1的实例，并且就在Hello2下面，Hello1活动前的所有活动都出栈，于是Hello2出栈，Hello1重回栈顶活动，因此Hello1的onRestart（）方法和Hello2的onDestroy（）方法会得到执行。

![images](https://github.com/Oathzzh/2017118118_Android/blob/master/Work4/images/3.2.png)

## singleInstance模式如下：
通过在AndroidManifest.xml文件指定为singleInstance模式：
![images](https://github.com/Oathzzh/2017118118_Android/blob/master/Work4/images/4.1.png)
### singleInstance模式工作原理
此模式下会有单独的返回栈来解决共享活动实例的问题，从以下打印信息中可得知，启动了Hello1之后，再启动Hello2，当返回Hello1时，返回的是之前创建的Hello1，返回Hello2也是之前创建的Hello2.
![images](https://github.com/Oathzzh/2017118118_Android/blob/master/Work4/images/4.2.png)

