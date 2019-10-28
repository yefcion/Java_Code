<map>
		<node ID="root" TEXT="Java Web 结构和 SSM 框架的理解">		<node TEXT="Java Web 常见的三层结构" ID="13816e1050cdbc008" STYLE="bubble" POSITION="right">
		<node TEXT="表现层 Web" ID="32416e1050f21e01e" STYLE="fork">
		<node TEXT="Servelet" ID="2c216e1051c6450b1" STYLE="fork">
		</node>
		<node TEXT="JSP" ID="d016e10519e8315" STYLE="fork">
		</node>
		</node>
		<node TEXT="业务层 Service" ID="22916e1051e842073" STYLE="fork">
		</node>
		<node TEXT="持久/数据层 Dao" ID="f816e10523866196" STYLE="fork">
		<node TEXT="MyBatis" ID="3e116e105279a6148" STYLE="fork">
		</node>
		<node TEXT="Hibernate" ID="3516e1052c10f0ad" STYLE="fork">
		</node>
		</node>
		<node TEXT="工作流程图" ID="1e716e105604ce0fa" STYLE="fork">
		<node TEXT="" ID="27816e1056282b031" STYLE="fork">
		</node>
		</node>
		</node>
		<node TEXT="SSM 框架" ID="32816e1056f088157" STYLE="bubble" POSITION="left">
		<node TEXT="框架简介" ID="d816e106a246e186" STYLE="fork">
		<node TEXT="Spring" ID="7116e106c465808f" STYLE="fork">
		<node TEXT="整合项目的所有框架，管理各种Java Bean（mapper、service、controller），事务控制" ID="3e416e106c3478002" STYLE="fork">
		</node>
		</node>
		<node TEXT="Spring MVC" ID="16216e106c00b8157" STYLE="fork">
		<node TEXT="表现层框架，把模型、视图、控制器分离，组合成一个灵活的系统" ID="23516e106adb5e0a3" STYLE="fork">
		</node>
		</node>
		<node TEXT="MyBatis" ID="27e16e106bc573002" STYLE="fork">
		<node TEXT="持久层框架，负责数据库访问" ID="16e16e106ad8ba11d" STYLE="fork">
		</node>
		</node>
		</node>
		<node TEXT="代码结构" ID="33f16e106aa3a2002" STYLE="fork">
		<node TEXT="DAO 层" ID="2bb16e1059f7170e6" STYLE="fork">
		<node TEXT="负责数据库的访问，增、删、改、查等" ID="19716e1059e678102" STYLE="fork">
		</node>
		<node TEXT="Mapper" ID="24616e105c830f046" STYLE="fork">
		</node>
		</node>
		<node TEXT="POJO 层" ID="3db16e1059b3580a7" STYLE="fork">
		<node TEXT="由一组POJO组成，是对系统各种对象的抽象表达" ID="17a16e10592d52161" STYLE="fork">
		</node>
		<node TEXT="Entity：一般与数据库的表相对应，封装dao层取出来的数据为一个对象，也就是我们常说的pojo，一般只在dao层与service层之间传输" ID="3c216e106002171" STYLE="fork">
		</node>
		</node>
		<node TEXT="Service 层" ID="a616e105a766806f" STYLE="fork">
		<node TEXT="由业务逻辑对象组成，是不同系统的业务逻辑的具体实现" ID="31c16e105a66bf0f5" STYLE="fork">
		</node>
		</node>
		<node TEXT="Controller 层" ID="36416e105aac9c089" STYLE="fork">
		<node TEXT="由控制器组成，对来自浏览器的用户请求进行拦截，并调用Service层的响应的业务逻辑组件处理用户请求，并转发返回结果到View层" ID="1a316e105ac4d4036" STYLE="fork">
		</node>
		</node>
		<node TEXT="View 层" ID="3d416e105b218c171" STYLE="fork">
		<node TEXT="由JSP界面，PDF文档等组件组成，用于显示系统对用户请求的处理结果" ID="14416e105b0bae079" STYLE="fork">
		</node>
		</node>
		<node TEXT="IDEA 中的结构展示" ID="3716e105b5726035" STYLE="fork">
		<node TEXT="IDEA 中的结构展示" ID="b016e105bab39166" STYLE="fork">
		</node>
		<node TEXT="文件结构解读" ID="c216e105bcc09022" STYLE="fork">
		<node TEXT="java.com 包" ID="23016e10618daf06d" STYLE="fork">
		<node TEXT="controller 包是 Spring MVC 的主要文件，其中对来自浏览器的各种请求进行转发和处理。在 controller 中会内置各种 Service 包中的对象，当接收到新的请求的时候，解析 url ，根据注解调用相应的服务来完成请求。" ID="30d16e1068e23c18c" STYLE="fork">
		</node>
		<node TEXT="entity 包常常与数据库中的表一一对应，dao 包中定义了数据库的基本操作，并在 mapper 包中的 xml 配置文件中完成数据操作的具体实现（也就是增、删、改、查）。Mybatis 可以实现 dao 与 .xml 的自动匹配，这时候就需要把 xxxMapper.xml 和 xxxMapper.java 放在同一个包内。" ID="19816e10693f2a04f" STYLE="fork">
		</node>
		<node TEXT="service 包中定义了各种服务的接口，然后在 Service-Impl 包中对接口进行实现，在实现接口的时候会内置一个 DAO 包中的对象（因为 web 服务的实现肯定是涉及到数据访问的，而数据访问被抽象成了 DAO 包中的对象，所以服务的实现必须借助 DAO 包），然后我们借助 DAO 中的对象所实现的各种数据访问处理方法来实现具体的服务。" ID="2716e10695fda162" STYLE="fork">
		</node>
		</node>
		<node TEXT="resource 后端配置文件" ID="24216e10613b6704d" STYLE="fork">
		</node>
		<node TEXT="webapp 前端页面与配置文件" ID="9f16e1064f53d042" STYLE="fork">
		<node TEXT="存放jsp、css等静态文件" ID="19316e1065a9d3049" STYLE="fork">
		</node>
		<node TEXT="web.xml 配置文件主要包含：" ID="bf16e106585ee0ad" STYLE="fork">
		<node TEXT="配置 Spring 需要加载的配置文件" ID="3e216e1065c103185" STYLE="fork">
		</node>
		<node TEXT="启用 disapatcher 转发处理所有的请求" ID="9116e1065cd03198" STYLE="fork">
		</node>
		<node TEXT="指定编码格式" ID="39e16e106588d206d1" STYLE="fork">
		</node>
		</node>
		</node>
		</node>
		</node>
		</node>
		</node>
</node>
</map>