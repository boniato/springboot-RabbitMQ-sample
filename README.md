# RabbitMQ
#### # 개발 환경
- mac os M1
- java 8
- spring boot 2.4.0
- gradle 6.6.1
- RabbitMQ 3.8

#### # 모듈 소개
- producer : module to send messages to queue
- consumer : module to read messages from queue

#### # RabbitMQ install in mac
```
$ brew install rabbitmq
```

#### # RabbitMQ start
- foreground
```
$RABBITMQ_HOME/sbin/rabbitmq-server start
```
- background
```
brew services start rabbitmq
```

#### # RabbitMQ management UI
- http://localhost:15672
- account : test-admin / password!

#### # RabbitMQ add user
```
$RABBITMQ_HOME/sbin/rabbitmqctl add_user test-admin password!
```
#### # RabbitMQ set user tag
```
$RABBITMQ_HOME/sbin/rabbitmqctl set_user_tags test-admin administrator
```
#### # search user list
```
$RABBITMQ_HOME/sbin/rabbitmqctl list_users
```
#### # add vhost
```
$RABBITMQ_HOME/sbin/rabbitmqctl add_vhost vhost-01
```
#### # search vhost list
```
$RABBITMQ_HOME/sbin/rabbitmqctl list_vhosts
```
#### # add user vhost authentication
rabbitmqctl list_permissions [-p vhost ] [user] [conf] [write] [read]
```
$RABBITMQ_HOME/sbin/rabbitmqctl set_permissions -p vhost-01 test-admin ".*" ".*" ".*"
```
