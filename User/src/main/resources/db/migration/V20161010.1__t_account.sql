CREATE TABLE t_account (
  id int(11) NOT NULL AUTO_INCREMENT,
  phone varchar(11) DEFAULT NULL COMMENT '手机号码',
  password varchar(32) DEFAULT NULL COMMENT '密码',
  identify_salt varchar(4) DEFAULT NULL COMMENT 'salt',
  register_time datetime DEFAULT NULL COMMENT '注册时间',
  create_date datetime DEFAULT NULL COMMENT '创建时间',
  create_user varchar(50) DEFAULT NULL COMMENT '创建用户',
  modify_date datetime DEFAULT NULL COMMENT '更新时间',
  modify_user varchar(50) DEFAULT NULL COMMENT '更新用户',
  is_enable char(1) DEFAULT '1' COMMENT '是否可用',
  PRIMARY KEY (id)
)COMMENT='账户表';
