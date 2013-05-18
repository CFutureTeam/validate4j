# Validate4J - Java校验库

    Validate4j是一个用于Java环境的，易于使用，可扩展的,可定义校验顺序的数据校验库。
    它内建15种常用验证规则，只需要简单配置即可使用；它也提供一个扩展接口，继承并实现Tester的方法即可自定义校验器。


## 为什么创建Validate4J项目？

是否在苦苦寻找Java的校验库？
是否羡慕嫉妒恨JQuery.Validate.js的方便，强大与优雅？
是否发现Apache,Struts等Powerful的校验库，却是为Web服务？
是否辛辛苦苦地重复地创建各种数据校验规则？
如果你也有同样的问题，那你就知道Validate4J诞生的原因。

## 特点

    * 简单  校验库内建15种常用验证规则，只需要一个简单的配置即可。所有规则都是按需要创建，不额外加载其它规则校验器。
    * 扩展  通过custom接口，可以自定义校验规则。
    * 校验顺序可控 配置的顺序就是校验的顺序。#Required 一旦配置，则无论顺序，最先被校验。

## How to use

    使用Validate4J进行数据校验，只需要三步：

    1.创建Validator类

```java
    Validator validator = new Validator();
```

    2.配置校验规则

```java
    RuleConfigs configs = validator.getRuleConfigs();
    // 必填，邮件
    configs
    .required()
    .email()
```

    3.对输入数据进行校验

```java
    // 包含校验结果状态和出错提示
    TestResult result = validator.testResult("chenyoca@gmail.com");

    // 简单的结果
    boolean result = validator.test("yoojia.chen@gmail.com");
```

## 内建规则

内建规则在net.yoojia.validate.internal.Rule枚举变量在声明。

* Required 必填，不能为空。此规则一旦被配置，则最先被校验。

* Email 校验邮件

* URL 校验URL

* MobilePhone 校验电话号码

* Number 校验数字（正负数，小数）

* Digits 校验整数

* EqualsTo 校验两个值是否相等

* InList 是否在列表中

* MaxLength 校验最大长度

* MinLength 校验最小长度

* RangeLength 校验是否在长度区间中

* MaxValue 校验最大值

* MinValue 校验最小值

* RangeValue 校验最值区间

* Regex 校验是否匹配正则表达式

* Custom 自定义校验规则

# License

    Copyright 2013 Yoojia.chen,Chenyoca(chenyoca@gmail.com)

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.