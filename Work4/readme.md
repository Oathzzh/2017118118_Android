# 活动的四种模式
## standard模式如下：
Android默认启动模式就是standard模式，或者也可在AndroidManifest.xml文件指定：
![images](https://github.com/Oathzzh/2017118118_Android/blob/master/Work4/images/1.1.png)
### 在standard模式工作原理
在此模式中，不论活动是否在栈顶，只要点击按钮都将会创建一个新活动：
![images](https://github.com/Oathzzh/2017118118_Android/blob/master/Work4/images/1.2.png)

## singleTop模式如下：
通过在AndroidManifest.xml文件指定为singTop模式：
![images](https://github.com/Oathzzh/2017118118_Android/blob/master/Work4/images/2.1.png)
### singleTop模式工作原理
在此模式中，只要在栈顶活动已存在，就不会再创建新活动，此模式能很好地解决重复创建栈顶活动的问题，多次点击按钮如下所示：
![images](https://github.com/Oathzzh/2017118118_Android/blob/master/Work4/images/2.2.png)
