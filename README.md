このMavenプロジェクトから別のMavenプロジェクトを呼び出すサンプルです。

このMavenプロジェクトでは、依存関係を解決するためのリモートリポジトリにNexusを利用しています。
#### pom.xmlの抜粋
```
  <repositories>
    <repository>
      <id>golden-group</id>
      <name>golden-group</name>
      <url>http://localhost:8081/repository/golden-group/</url>
      <releases>
        <enabled>true</enabled>
      </releases>
      <snapshots>
        <enabled>true</enabled>
      </snapshots>
    </repository>
  </repositories>
```

このMavenプロジェクトがリリースやスナップショットをデプロイするリモートリポジトリを指定します。
#### pom.xmlの抜粋
```
  <distributionManagement>
    <repository>
	  <id>nexus</id>
	  <url>http://localhost:8081/repository/golden-hosted/</url>
	</repository>
  </distributionManagement>
```

Nexus上に配置されているアーティファクトに依存関係を設定して、このMavenプロジェクトで利用します。
#### pom.xmlの抜粋
```
    <dependency>
      <groupId>com.doikota</groupId>
      <artifactId>maven_sonar</artifactId>
      <version>1.0-SNAPSHOT</version>
    </dependency>
```
