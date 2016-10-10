CREATE TABLE IF NOT EXISTS t_vehicle (
  id int(11) NOT NULL AUTO_INCREMENT ,
  vin varchar(50) COMMENT '车架号',
  engine_number varchar(50) COMMENT '发动机编号',
  plate varchar(50) COMMENT '车牌号',
  colour varchar(50) COMMENT '颜色',
  description varchar(200) COMMENT '描述',
  create_date datetime COMMENT '创建时间',
  create_user varchar(50) COMMENT '创建用户',
  modify_date datetime COMMENT '更新时间',
  modify_user varchar(50) COMMENT '更新用户',
  is_enable varchar(1) COMMENT '是否可用',
  PRIMARY KEY (id)
)COMMENT = '车辆表' ;

