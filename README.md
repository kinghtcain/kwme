# kwme项目说明文件
**<h3>This is a knowledge management & explore app.</h3>**

_#<h5>补充说明：一开始由于使用IDEA的CVS（版本控制）不熟悉，所以把IDEA的配置文件也上传了，勿怪！</h5>_

整体说明：本项目的基本架构是SSM，一开始测试写的entities是自己写的，比较简单的User，后来复杂了是使用MybatisGenerator生成的。<br>
（1）在master分支上是可以使用的基础的SSM架构，前后端都经过测试了的；前端返回的是json数据格式；<br/>在开始的时候我还在这个分支上测试集成spring，但是没有成功，所以会有spring的一些历史消息；<br>
（2）add_gecco分支上的加入了gecco这个开源的项目，main方法测试成功，而且集成时候用以提取拉勾网的job信息，也集成成功了，而且持久化到了数据库中;
